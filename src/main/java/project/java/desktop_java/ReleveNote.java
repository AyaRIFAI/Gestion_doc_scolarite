/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.java.desktop_java;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.Section;
import com.spire.doc.Table;
import com.spire.doc.TableCell;
import com.spire.doc.TableRow;
import com.spire.doc.documents.Paragraph;
import com.spire.doc.documents.TextSelection;
import com.spire.doc.fields.DocPicture;
import com.spire.doc.fields.TextRange;
import java.awt.Desktop;
import java.io.File;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class ReleveNote extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String niveau_e="";
    int semestre;
    int id_etu;
    int id_demande;
    
    static void replaceTextinDocumentBody(Map<String, String> map, Document document){  
        for(Section section : (Iterable<Section>)document.getSections()) {  
            for (Paragraph para : (Iterable<Paragraph>) section.getParagraphs()) {  
                for (Map.Entry<String, String> entry : map.entrySet()) {  
                    para.replace("${" + entry.getKey() + "}", entry.getValue(), false, true);  
                }  
            }  
        }  
    }
    static void replaceTextinTable(Map<String, String> map, Table table){  
        for(TableRow row:(Iterable<TableRow>)table.getRows()){  
            for(TableCell cell : (Iterable<TableCell>)row.getCells()){  
                for(Paragraph para : (Iterable<Paragraph>)cell.getParagraphs()){  
                    for (Map.Entry<String, String> entry : map.entrySet()) {  
                        para.replace("${" + entry.getKey() + "}", entry.getValue(), false, true);  
                    }  
                }  
            }  
        }  
    }
    static  void replaceTextWithImage(Document document, String stringToReplace, String imagePath){  
        TextSelection[] selections = document.findAllString("${" + stringToReplace + "}", false, true);  
        int index = 0;  
        TextRange range = null;  
        for (Object obj : selections) {  
            TextSelection textSelection = (TextSelection)obj;  
            DocPicture pic = new DocPicture(document);  
            pic.loadImage(imagePath);
            
            range = textSelection.getAsOneRange();  
            index = range.getOwnerParagraph().getChildObjects().indexOf(range);  
            range.getOwnerParagraph().getChildObjects().insert(index,pic);  
            range.getOwnerParagraph().getChildObjects().remove(range);  
        }  
    }
    /**
    /**
     * Creates new form ReleveNote
     */
    public ReleveNote(int id,int id_etud) {
        initComponents();
        id_etu = id_etud;
        id_demande = id;
        try {
                      ps = (PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select niveau,semestre from gl_projet.releve_notes where id=?");
                      ps.setInt(1,id);
                      rs = ps.executeQuery();
                      if(rs.next()){
                          niveau_e=rs.getString("niveau");
                           semestre=rs.getInt("semestre");
                          niveau.setText(rs.getString("niveau")); 
                         
                         if(rs.getInt("semestre")==1){
                             jRadioButton1.setSelected(true);
                             jRadioButton2.setEnabled(false);
                             jRadioButton3.setEnabled(false);
                             jRadioButton1.setEnabled(false);
                            
                         }
                         else if(rs.getInt("semestre")==2){
                             jRadioButton2.setSelected(true);
                             jRadioButton2.setEnabled(false);
                             jRadioButton3.setEnabled(false);
                             jRadioButton1.setEnabled(false);
                             
                         }
                         else{
                             jRadioButton3.setSelected(true);
                             jRadioButton2.setEnabled(false);
                             jRadioButton3.setEnabled(false);
                             jRadioButton1.setEnabled(false);
                             
                         }
                  } 
                      niveau.setEditable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection failed!!!");
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        semestreGroupe = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        niveau = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        deconnecter = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Niveau :");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Semestre :");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        semestreGroupe.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("TOUT");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        semestreGroupe.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("SEMESTRE 1");

        semestreGroupe.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("SEMESTRE 2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Accepter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visualisation des données");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        niveau.setBackground(new java.awt.Color(0, 102, 102));
        niveau.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveauActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refuser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(396, 396, 396))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        kGradientPanel4.setEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel4.setStartColor(new java.awt.Color(0, 102, 102));

        deconnecter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deconnecter.setForeground(new java.awt.Color(0, 102, 102));
        deconnecter.setText("Se déconnecter");
        deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnecterActionPerformed(evt);
            }
        });

        menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 102, 102));
        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        retour.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        retour.setForeground(new java.awt.Color(0, 102, 102));
        retour.setText("Retour");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deconnecter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(retour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deconnecter)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        demandeNonTraite ar = new demandeNonTraite();
        ar.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_retourActionPerformed

    private void deconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnecterActionPerformed
        // TODO add your handling code here:
        LogAdmin menu = new LogAdmin();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_deconnecterActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Demande_archive ar = new Demande_archive();
        ar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Refuser r = new Refuser();
        r.set_id_etudiant(id_etu);
        r.set_id_demande(id_demande);
        r.set_type("releve de notes");
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            ps = (PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select niveau,semestre from gl_projet.releve_notes where id=?");
            ps.setInt(1,id_demande);
            rs = ps.executeQuery();
            if(rs.next()){
                niveau_e=rs.getString("niveau");
                semestre=rs.getInt("semestre");
                niveau.setText(rs.getString("niveau"));

                if(rs.getInt("semestre")==1){
                    jRadioButton1.setSelected(true);
                    jRadioButton2.setEnabled(false);
                    jRadioButton3.setEnabled(false);
                    jRadioButton1.setEnabled(false);

                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl_projet", "root", "");
                    PreparedStatement pst1 =(PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select * from modules,etudiants,modules_etudiants,demande_docs,releve_notes where modules_etudiants.id_module = modules.id and modules_etudiants.id_etudiant=etudiants.id and demande_docs.id_etudiant = etudiants.id and releve_notes.id=demande_docs.id_demande and modules.niveau=? and etudiants.id=? and demande_docs.id_demande=?; ");
                    String niveau=niveau_e;
                    String semester ="1";
                    String conca = niveau+semester;
                    pst1.setString(1, conca);
                    pst1.setString(2, Integer.toString(id_etu));
                    pst1.setString(3, Integer.toString(id_demande));

                    ResultSet rs1 = pst1.executeQuery();
                    Document document = new Document("D:\\javadirectories\\releve_de_notes.docx");
                    Section section = document.getSections().get(0);
                    Table table = section.getTables().get(0);
                    //Section section1 = document.getSections().get(0);
                    Table table1 = section.getTables().get(1);

                    Map<String, String> map = new HashMap<String, String>();

                    rs1.next();
                    String a = rs1.getString("nom");
                    map.put("nom",a);

                    map.put("prenom",rs1.getString("prenom"));
                    map.put("date_nai",rs1.getString("annee_naissance"));
                    map.put("adress",rs1.getString("adresse"));
                    map.put("filiere",rs1.getString("filiere"));
                    map.put("apogee",rs1.getString("code_apogee"));
                    map.put("cne",rs1.getString("cne"));
                    map.put("annee_univ",rs1.getString("annee_univ"));
                    map.put("date",java.time.LocalDate.now().toString());

                    /**************************************/
                    map.put("module1",rs1.getString("intitule"));
                    map.put("note1",rs1.getString("note"));
                    map.put("status1",rs1.getString("status"));
                    rs1.next();
                    map.put("module2",rs1.getString("intitule"));
                    map.put("note2",rs1.getString("note"));
                    map.put("status2",rs1.getString("status"));
                    rs1.next();
                    map.put("module3",rs1.getString("intitule"));
                    map.put("note3",rs1.getString("note"));
                    map.put("status3",rs1.getString("status"));

                    replaceTextinDocumentBody(map,document);
                    replaceTextinTable(map,table);
                    replaceTextinTable(map,table1);

                    String path ="D:\\javadirectories\\repos\\relever_note_"+rs1.getString("code_apogee")+"_"+rs1.getString("id_demande")+".pdf";
                    document.saveToFile(path, FileFormat.PDF);
                    JOptionPane.showMessageDialog(null, "File generated, path : "+path);

                    //archiver
                    //archiver
                    pst1 =(PreparedStatement) ConnectionDB.getConnexion().prepareStatement("UPDATE demande_docs SET status='accepté', is_archive=1 WHERE id_etudiant=? and id_demande=? and type_demande='releve de notes';");

                    pst1.setString(1, Integer.toString(id_etu));
                    pst1.setString(2, Integer.toString(id_demande));

                    pst1.executeUpdate();

                    //open pdf fine
                    File myFile = new File(path);
                    Desktop.getDesktop().open(myFile);

                    //variable de email

                    String email = rs1.getString("email_etudiant");
                    String bodymessage = "Votre relever de note";
                    String subject = "Tester email";
                    String myAdress = "porjetgenie.logiciel2022@gmail.com";
                    String passwordEMail = "genielogiciel";
                    String contenue = bodymessage;
                    String otherEmail = email;
                    //send file in email code
                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.port", "587");
                    Session session = Session.getDefaultInstance(properties,new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("porjetgenie.logiciel2022@gmail.com","trbqpsgfwezksylh");
                        }

                    });
                    Message message = new MimeMessage(session);
                    message.setSubject(subject);
                    //message.setContent(other,"text/plain");
                    message.setFrom(new InternetAddress(myAdress));
                    message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
                    message.setSentDate(new java.util.Date());

                    // Create the message part
                    BodyPart messageBodyPart = new MimeBodyPart();

                    // Fill the message
                    messageBodyPart.setText(bodymessage);
                    // Create a multipar message
                    Multipart multipart = new MimeMultipart();

                    // Set text message part
                    multipart.addBodyPart(messageBodyPart);

                    // Part two is attachment
                    messageBodyPart = new MimeBodyPart();
                    String filename = path;
                    DataSource source = new FileDataSource(filename);
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(filename);
                    multipart.addBodyPart(messageBodyPart);

                    // Send the complete message parts
                    message.setContent(multipart);

                    Transport.send(message);
                    JOptionPane.showMessageDialog(null, "email sent");

                }
                else if(rs.getInt("semestre")==2){
                    jRadioButton2.setSelected(true);
                    jRadioButton2.setEnabled(false);
                    jRadioButton3.setEnabled(false);
                    jRadioButton1.setEnabled(false);

                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl_projet", "root", "");
                    PreparedStatement pst1 =(PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select * from modules,etudiants,modules_etudiants,demande_docs,releve_notes where modules_etudiants.id_module = modules.id and modules_etudiants.id_etudiant=etudiants.id and demande_docs.id_etudiant = etudiants.id and releve_notes.id=demande_docs.id_demande and modules.niveau=? and etudiants.id=? and demande_docs.id_demande=?; ");
                    //pst1.setString(2, Integer.toString(id));
                    String niveau=niveau_e;
                    String semester ="2";
                    String conca = niveau+semester;
                    pst1.setString(1,conca);
                    pst1.setString(2,Integer.toString(id_etu));
                    pst1.setString(3,Integer.toString(id_demande));
                    ResultSet rs1 = pst1.executeQuery();
                    Document document = new Document("D:\\javadirectories\\releve_de_notes_2.docx");
                    Section section = document.getSections().get(0);
                    Table table = section.getTables().get(0);
                    //Section section1 = document.getSections().get(0);
                    Table table1 = section.getTables().get(1);

                    Map<String, String> map = new HashMap<String, String>();

                    rs1.next();
                    String a = rs1.getString("nom");
                    map.put("nom",a);

                    map.put("prenom",rs1.getString("prenom"));
                    map.put("date_nai",rs1.getString("annee_naissance"));
                    map.put("adress",rs1.getString("adresse"));
                    map.put("filiere",rs1.getString("filiere"));
                    map.put("apogee",rs1.getString("code_apogee"));
                    map.put("cne",rs1.getString("cne"));
                    map.put("annee_univ",rs1.getString("annee_univ"));
                    map.put("date",java.time.LocalDate.now().toString());

                    /**************************************/
                    map.put("module1",rs1.getString("intitule"));
                    map.put("note1",rs1.getString("note"));
                    map.put("status1",rs1.getString("status"));
                    rs1.next();
                    map.put("module2",rs1.getString("intitule"));
                    map.put("note2",rs1.getString("note"));
                    map.put("status2",rs1.getString("status"));
                    rs1.next();
                    map.put("module3",rs1.getString("intitule"));
                    map.put("note3",rs1.getString("note"));
                    map.put("status3",rs1.getString("status"));

                    replaceTextinDocumentBody(map,document);
                    replaceTextinTable(map,table);
                    replaceTextinTable(map,table1);

                    String path ="D:\\javadirectories\\repos\\relever_note_2_"+rs1.getString("code_apogee")+"_"+rs1.getString("id_demande")+".pdf";
                    document.saveToFile(path, FileFormat.PDF);
                    JOptionPane.showMessageDialog(null, "File generated, path : "+path);

                    //archiver
                    //archiver
                    pst1 =(PreparedStatement) ConnectionDB.getConnexion().prepareStatement("UPDATE demande_docs SET status='accepté', is_archive=1 WHERE id_etudiant=? and id_demande=? and type_demande='releve de notes';");

                    pst1.setString(1, Integer.toString(id_etu));
                    pst1.setString(2, Integer.toString(id_demande));

                    pst1.executeUpdate();

                    //open pdf fine
                    File myFile = new File(path);
                    Desktop.getDesktop().open(myFile);

                    //variable de email

                    String email = rs1.getString("email_etudiant");
                    String bodymessage = "Votre relever de note";
                    String subject = "Tester email";
                    String myAdress = "porjetgenie.logiciel2022@gmail.com";
                    String passwordEMail = "genielogiciel";
                    String contenue = bodymessage;
                    String otherEmail = email;
                    //send file in email code
                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.port", "587");
                    Session session = Session.getDefaultInstance(properties,new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("porjetgenie.logiciel2022@gmail.com","trbqpsgfwezksylh");
                        }

                    });
                    Message message = new MimeMessage(session);
                    message.setSubject(subject);
                    //message.setContent(other,"text/plain");
                    message.setFrom(new InternetAddress(myAdress));
                    message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
                    message.setSentDate(new java.util.Date());

                    // Create the message part
                    BodyPart messageBodyPart = new MimeBodyPart();

                    // Fill the message
                    messageBodyPart.setText(bodymessage);
                    // Create a multipar message
                    Multipart multipart = new MimeMultipart();

                    // Set text message part
                    multipart.addBodyPart(messageBodyPart);

                    // Part two is attachment
                    messageBodyPart = new MimeBodyPart();
                    String filename = path;
                    DataSource source = new FileDataSource(filename);
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(filename);
                    multipart.addBodyPart(messageBodyPart);

                    // Send the complete message parts
                    message.setContent(multipart);

                    Transport.send(message);
                    JOptionPane.showMessageDialog(null, "email sent");

                }
                else{
                    jRadioButton3.setSelected(true);
                    jRadioButton2.setEnabled(false);
                    jRadioButton3.setEnabled(false);
                    jRadioButton1.setEnabled(false);

                    PreparedStatement pst1 =(PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select * from modules,etudiants,modules_etudiants,demande_docs,releve_notes where modules_etudiants.id_module = modules.id and modules_etudiants.id_etudiant=etudiants.id and demande_docs.id_etudiant = etudiants.id and releve_notes.id=demande_docs.id_demande and (modules.niveau=? or modules.niveau=?) and etudiants.id=? and demande_docs.id_demande=?;");

                    String conca = niveau_e+"1";
                    String conca2 = niveau_e+"2";
                    pst1.setString(1,conca);

                    pst1.setString(2,conca2);
                    pst1.setString(3,Integer.toString(id_etu));
                    pst1.setString(4,Integer.toString(id_demande));
                    ResultSet rs1 = pst1.executeQuery();
                    Document document = new Document("D:\\javadirectories\\releve_de_notes_t.docx");
                    Section section = document.getSections().get(0);
                    Table table = section.getTables().get(0);
                    //Section section1 = document.getSections().get(0);
                    Table table1 = section.getTables().get(1);
                    Table table2 = section.getTables().get(2);

                    Map<String, String> map = new HashMap<String, String>();

                    rs1.next();
                    map.put("nom",rs1.getString("nom"));
                    map.put("prenom",rs1.getString("prenom"));
                    map.put("date_nai",rs1.getString("annee_naissance"));
                    map.put("adress",rs1.getString("adresse"));
                    map.put("filiere",rs1.getString("filiere"));
                    map.put("apogee",rs1.getString("code_apogee"));
                    map.put("cne",rs1.getString("cne"));
                    map.put("annee_univ",rs1.getString("annee_univ"));
                    map.put("date",java.time.LocalDate.now().toString());

                    /**************************************/
                    map.put("module1",rs1.getString("intitule"));
                    map.put("note1",rs1.getString("note"));
                    map.put("status1",rs1.getString("status"));
                    rs1.next();
                    map.put("module2",rs1.getString("intitule"));
                    map.put("note2",rs1.getString("note"));
                    map.put("status2",rs1.getString("status"));
                    rs1.next();
                    map.put("module3",rs1.getString("intitule"));
                    map.put("note3",rs1.getString("note"));
                    map.put("status3",rs1.getString("status"));
                    rs1.next();
                    map.put("module4",rs1.getString("intitule"));
                    map.put("note4",rs1.getString("note"));
                    map.put("status4",rs1.getString("status"));
                    rs1.next();
                    map.put("module5",rs1.getString("intitule"));
                    map.put("note5",rs1.getString("note"));
                    map.put("status5",rs1.getString("status"));
                    rs1.next();
                    map.put("module6",rs1.getString("intitule"));
                    map.put("note6",rs1.getString("note"));
                    map.put("status6",rs1.getString("status"));

                    replaceTextinDocumentBody(map,document);
                    replaceTextinTable(map,table);
                    replaceTextinTable(map,table1);
                    replaceTextinTable(map,table2);

                    String path ="D:\\javadirectories\\repos\\relever_note_t_"+rs1.getString("code_apogee")+"_"+rs1.getString("id_demande")+".pdf";
                    document.saveToFile(path, FileFormat.PDF);
                    JOptionPane.showMessageDialog(null, "File generated, path : "+path);

                    //archiver
                    //archiver
                    PreparedStatement pst2 =(PreparedStatement) ConnectionDB.getConnexion().prepareStatement("UPDATE demande_docs SET status='accepté', is_archive=1 WHERE id_etudiant=? and id_demande=? and type_demande='releve de notes';");

                    pst2.setString(1, Integer.toString(id_etu));
                    pst2.setString(2, Integer.toString(id_demande));

                    pst2.executeUpdate();

                    //open pdf fine
                    File myFile = new File(path);
                    Desktop.getDesktop().open(myFile);

                    //variable de email

                    String email = rs1.getString("email_etudiant");
                    String bodymessage = "Votre relever de note";
                    String subject = "Tester email";
                    String myAdress = "porjetgenie.logiciel2022@gmail.com";
                    String passwordEMail = "genielogiciel";
                    String contenue = bodymessage;
                    String otherEmail = email;
                    //send file in email code
                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.port", "587");
                    Session session = Session.getDefaultInstance(properties,new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("porjetgenie.logiciel2022@gmail.com","trbqpsgfwezksylh");
                        }

                    });
                    Message message = new MimeMessage(session);
                    message.setSubject(subject);
                    //message.setContent(other,"text/plain");
                    message.setFrom(new InternetAddress(myAdress));
                    message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
                    message.setSentDate(new java.util.Date());

                    // Create the message part
                    BodyPart messageBodyPart = new MimeBodyPart();

                    // Fill the message
                    messageBodyPart.setText(bodymessage);
                    // Create a multipar message
                    Multipart multipart = new MimeMultipart();

                    // Set text message part
                    multipart.addBodyPart(messageBodyPart);

                    // Part two is attachment
                    messageBodyPart = new MimeBodyPart();
                    String filename = path;
                    DataSource source = new FileDataSource(filename);
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(filename);
                    multipart.addBodyPart(messageBodyPart);

                    // Send the complete message parts
                    message.setContent(multipart);

                    Transport.send(message);
                    JOptionPane.showMessageDialog(null, "email sent");

                }
            }
            niveau.setEditable(false);
            demandeNonTraite ar = new demandeNonTraite();
            ar.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niveauActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lniveauplaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReleveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReleveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReleveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReleveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new ReleveNote().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deconnecter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JButton menu;
    private javax.swing.JTextField niveau;
    private javax.swing.JButton retour;
    private javax.swing.ButtonGroup semestreGroupe;
    // End of variables declaration//GEN-END:variables
}
