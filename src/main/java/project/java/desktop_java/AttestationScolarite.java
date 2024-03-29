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
import com.spire.doc.ToPdfParameterList;
import com.spire.doc.documents.Paragraph;
import com.spire.doc.documents.TextSelection;
import com.spire.doc.fields.DocPicture;
import com.spire.doc.fields.TextRange;
import java.awt.Desktop;
import java.io.File;
import project.java.desktop_java.ConnectionDB;
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
public class AttestationScolarite extends javax.swing.JFrame {
   
    ResultSet rs = null;
    PreparedStatement ps = null;
    String niveau_e="";
    int id_etu;
    int id_demande;
    /**
     * Creates new form AttestationScolarite
     */
    public AttestationScolarite(int id,int id_etud) {
        initComponents();
        id_etu = id_etud;
        id_demande = id;
      
         try {
                      ps = (PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select * from gl_projet.attestation_scolarites where id=?;");
                      ps.setInt(1,id);
                      rs = ps.executeQuery();
                      //JOptionPane.showMessageDialog(null, id);
                      //JOptionPane.showMessageDialog(null, rs.getString("niveau"));
                      if(rs.next()){
                          
                          niveau.setText(rs.getString("niveau"));
                      
                  } 
                       niveau.setEditable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection failed!!!");
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
    static void replaceTextinDocumentBody(Map<String, String> map, Document document){  
        for(Section section : (Iterable<Section>)document.getSections()) {  
            for (Paragraph para : (Iterable<Paragraph>) section.getParagraphs()) {  
                for (Map.Entry<String, String> entry : map.entrySet()) {  
                    para.replace("${" + entry.getKey() + "}", entry.getValue(), false, true);  
                }  
            }  
        }  
    }
    public void noneditableFormulaire(){
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new keeptoo.KGradientPanel();
        deconnecter = new javax.swing.JButton();
        menu1 = new javax.swing.JButton();
        retour1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        niveau = new javax.swing.JTextField();
        X = new java.awt.Button();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jButton4 = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        retour = new javax.swing.JButton();

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

        menu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu1.setForeground(new java.awt.Color(0, 102, 102));
        menu1.setText("Menu");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        retour1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        retour1.setForeground(new java.awt.Color(0, 102, 102));
        retour1.setText("Retour");
        retour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(retour1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deconnecter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(retour1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deconnecter)
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));

        jLabel74.setBackground(new java.awt.Color(0, 0, 102));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 102, 102));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Niveau :");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Accepter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Visualisation des données");
        title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refuser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        niveau.setBackground(new java.awt.Color(0, 102, 102));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveauActionPerformed(evt);
            }
        });

        X.setLabel("X");
        X.setName("X"); // NOI18N
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(title)
                .addGap(46, 46, 46)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        kGradientPanel5.setEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel5.setStartColor(new java.awt.Color(0, 102, 102));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Se déconnecter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
        retour.setText("retour");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(retour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(retour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Refuser r = new Refuser();
        r.set_id_etudiant(id_etu);
        r.set_id_demande(id_demande);
        r.set_type("attestation scolarite");
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        // TODO add your handling code here:
        demandeNonTraite ar = new demandeNonTraite();
         ar.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_retourActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LogAdmin menu = new LogAdmin();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Demande_archive ar = new Demande_archive();
       ar.setVisible(true);
       this.dispose();   
    }//GEN-LAST:event_menuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl_projet", "root", "");
        PreparedStatement pst =(PreparedStatement) conn.prepareStatement("select * from etudiants,demande_docs,attestation_scolarites where etudiants.id=demande_docs.id_etudiant and attestation_scolarites.id=demande_docs.id_demande and etudiants.id=? and demande_docs.id_demande=? ;");
        pst.setString(1, Integer.toString(id_etu));
        pst.setString(2, Integer.toString(id_demande));
        ResultSet rs = pst.executeQuery();
        rs.next();
        
        
        
        String email = rs.getString("email_etudiant");

        String date = java.time.LocalDate.now().toString();
        String nom = rs.getString("nom");
        String prenom = rs.getString("prenom");
        String cne = rs.getString("cne");
        String apogee = rs.getString("code_apogee");
        String filiere  = rs.getString("filiere");
        String année = rs.getString("annee_univ");
        
        
        
        String signature = "D:\\javadirectories\\signatures\\signature.png";
        
        
        String bodymessage="Votre Attestation de scolarite est pris";
       
        Document document = new Document("D:\\javadirectories\\attestation.docx");
        //Document document = new Document("/attestation.docx");
        
        Map<String, String> map = new HashMap<String, String>();  
        
        map.put("date",date);
        map.put("nom",nom);
        map.put("prenom",prenom);
        map.put("cne",cne);
        map.put("apogee",apogee);
        map.put("filiere",filiere);
        map.put("année",année);
        
        replaceTextinDocumentBody(map,document);
        
        replaceTextWithImage(document, "signature", signature);
              
        
        String pathpdf ="D:\\javadirectories\\repos\\attestation_"+apogee+"_"+rs.getString("id_demande")+".pdf";
        String path ="D:\\javadirectories\\repos\\attestation_"+apogee+"_"+rs.getString("id_demande")+".docx";
        //document.saveToFile(path, FileFormat.PDF);
        document.saveToFile(path, FileFormat.Docx);
        
        //word to pdf
        /*
        Document documentpdf = new Document(path);
        documentpdf.saveToFile(path, FileFormat.PDF);*/
        Document doc = new Document();
        //Load a sample Word document
        doc.loadFromFile(path);
        //Create a ToPdfParameterList instance
        ToPdfParameterList ppl=new ToPdfParameterList();
        //Embed all fonts in the PDF document
        ppl.isEmbeddedAllFonts(true);
        //Remove the hyperlinks and keep the character formats
        ppl.setDisableLink(true);
        //Set the output image quality as 40% of the original image. 80% is the default setting.
        doc.setJPEGQuality(40);
        //Save the document as PDF
        doc.saveToFile(pathpdf, ppl);
        
        File f = new File(path);
        f.delete();
        
        JOptionPane.showMessageDialog(null, "File generated, path : "+pathpdf);
        
        //archiver
        pst =(PreparedStatement) conn.prepareStatement("UPDATE demande_docs SET status='accepté', is_archive=1 WHERE id_etudiant=? and id_demande=?;");
                
                pst.setString(1, Integer.toString(id_etu));
                pst.setString(2, Integer.toString(id_demande));
    
        pst.executeUpdate();
        
        
        //open pdf fine
        File myFile = new File(pathpdf);
        Desktop.getDesktop().open(myFile);
        
        
        //variable de email
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
            String filename = pathpdf;
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            Transport.send(message);
        JOptionPane.showMessageDialog(null, "email sent");
         demandeNonTraite ar = new demandeNonTraite();
       ar.setVisible(true);
       this.dispose(); 
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnecterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deconnecterActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
        Demande_archive ar = new Demande_archive();
        ar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu1ActionPerformed

    private void retour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retour1ActionPerformed
        demandeNonTraite ar = new demandeNonTraite();
        ar.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_retour1ActionPerformed

    private void niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niveauActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_XActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AttestationScolarite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttestationScolarite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttestationScolarite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttestationScolarite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new AttestationScolarite().setVisible(true);
                
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button X;
    private javax.swing.JButton deconnecter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel51;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JButton menu;
    private javax.swing.JButton menu1;
    private javax.swing.JTextField niveau;
    private javax.swing.JButton retour;
    private javax.swing.JButton retour1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
