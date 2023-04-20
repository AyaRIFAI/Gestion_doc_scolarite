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
import java.io.*;
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
public class ConventionStage extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
     String path1="";
    String path2="";
    int id_etu;
    int id_demande;
    /**
     * Creates new form ConventionStage
     */
    public ConventionStage(int id,int id_etud) {
        initComponents();
        id_etu = id_etud;
        id_demande = id;
        try {           System.out.println(id_etud+"    "+id);
                      ps = (PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select * from gl_projet.convention_stages where id=?");
                      ps.setInt(1,id);
                      rs = ps.executeQuery();
                      if(rs.next()){
                          
                          nom_entrep.setText(rs.getString("nom_entreprise"));
                          nom_entrep.setEditable(false);
                          adresse.setText(rs.getString("adresse_entreprise"));
                          adresse.setEditable(false);
                        encadrant_entreprise.setText(rs.getString("encadrant_entreprise"));
                        encadrant_entreprise.setEditable(false);
                          tel.setText(rs.getString("tel_entreprise"));
                          tel.setEditable(false);
                          encadrant_ecole.setText(rs.getString("encadrant_ecole"));
                          encadrant_ecole.setEditable(false);
                          assistant_pedagogique.setText(rs.getString("assistant_pedagogique"));
                          assistant_pedagogique.setEditable(false);
                         directeur.setText(rs.getString("directeur"));
                         directeur.setEditable(false);
                         sujet.setText(rs.getString("sujet"));
                         sujet.setEditable(false);
                          date_debut.setText(rs.getString("date_debut"));
                          date_debut.setEditable(false);
                          date_fin.setText(rs.getString("date_fin"));
                          date_fin.setEditable(false);
                          email.setText(rs.getString("email_entreprise"));
                          email.setEditable(false);
                           path1=rs.getString("accord");
                          path2=rs.getString("assurance");


                          

                  } 
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        deconnecter1 = new javax.swing.JButton();
        menu1 = new javax.swing.JButton();
        retour1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        adresse = new javax.swing.JTextField();
        nom_entrep = new javax.swing.JTextField();
        assistant_pedagogique = new javax.swing.JTextField();
        encadrant_ecole = new javax.swing.JTextField();
        sujet = new javax.swing.JTextField();
        date_debut = new javax.swing.JFormattedTextField();
        directeur = new javax.swing.JTextField();
        date_fin = new javax.swing.JFormattedTextField();
        tel = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        assurance = new javax.swing.JButton();
        accord = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        encadrant_entreprise = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        X = new java.awt.Button();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        deconnecter = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        retour = new javax.swing.JButton();

        kGradientPanel6.setEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel6.setStartColor(new java.awt.Color(0, 102, 102));

        deconnecter1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deconnecter1.setForeground(new java.awt.Color(0, 102, 102));
        deconnecter1.setText("Se déconnecter");
        deconnecter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnecter1ActionPerformed(evt);
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

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deconnecter1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retour1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(retour1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deconnecter1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        adresse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adresse.setForeground(new java.awt.Color(0, 102, 102));
        adresse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adresse.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Adresse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        adresse.setSelectionColor(new java.awt.Color(0, 0, 102));
        adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseActionPerformed(evt);
            }
        });

        nom_entrep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nom_entrep.setForeground(new java.awt.Color(0, 102, 102));
        nom_entrep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nom_entrep.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Nom Entreprise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        nom_entrep.setSelectionColor(new java.awt.Color(0, 51, 51));
        nom_entrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_entrepActionPerformed(evt);
            }
        });

        assistant_pedagogique.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        assistant_pedagogique.setForeground(new java.awt.Color(0, 102, 102));
        assistant_pedagogique.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        assistant_pedagogique.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Assistant Pédagogique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        assistant_pedagogique.setSelectionColor(new java.awt.Color(0, 0, 102));
        assistant_pedagogique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assistant_pedagogiqueActionPerformed(evt);
            }
        });

        encadrant_ecole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        encadrant_ecole.setForeground(new java.awt.Color(0, 102, 102));
        encadrant_ecole.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        encadrant_ecole.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Nom Encadrant Ecole", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        encadrant_ecole.setSelectionColor(new java.awt.Color(0, 0, 102));
        encadrant_ecole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encadrant_ecoleActionPerformed(evt);
            }
        });

        sujet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sujet.setForeground(new java.awt.Color(0, 102, 102));
        sujet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sujet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Thème du stage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        sujet.setSelectionColor(new java.awt.Color(0, 51, 51));
        sujet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sujetActionPerformed(evt);
            }
        });

        date_debut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Date Début", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        date_debut.setForeground(new java.awt.Color(0, 102, 102));
        date_debut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        date_debut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date_debut.setToolTipText("");
        date_debut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        date_debut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_debutActionPerformed(evt);
            }
        });

        directeur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        directeur.setForeground(new java.awt.Color(0, 102, 102));
        directeur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directeur.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Directeur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        directeur.setSelectionColor(new java.awt.Color(0, 0, 102));
        directeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directeurActionPerformed(evt);
            }
        });

        date_fin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Date Fin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        date_fin.setForeground(new java.awt.Color(0, 102, 102));
        date_fin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        date_fin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date_fin.setToolTipText("");
        date_fin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(0, 102, 102));
        tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Tel Entreprise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        tel.setSelectionColor(new java.awt.Color(0, 0, 102));
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 102, 102));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Email Entreprise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        email.setSelectionColor(new java.awt.Color(0, 0, 102));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        assurance.setBackground(new java.awt.Color(0, 102, 102));
        assurance.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        assurance.setForeground(new java.awt.Color(255, 255, 255));
        assurance.setText("Assurance");
        assurance.setBorder(null);
        assurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assuranceActionPerformed(evt);
            }
        });

        accord.setBackground(new java.awt.Color(0, 102, 102));
        accord.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accord.setForeground(new java.awt.Color(255, 255, 255));
        accord.setText("Accord Entreprise");
        accord.setBorder(null);
        accord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accordActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Refuser");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Accepter");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        encadrant_entreprise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        encadrant_entreprise.setForeground(new java.awt.Color(0, 102, 102));
        encadrant_entreprise.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        encadrant_entreprise.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Nom Encadrant Entreprise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        encadrant_entreprise.setSelectionColor(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(date_debut, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(directeur, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(sujet, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                                .addComponent(assurance, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(nom_entrep, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(encadrant_ecole, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(assistant_pedagogique, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(encadrant_entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accord, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_entrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encadrant_entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encadrant_ecole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assistant_pedagogique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sujet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_debut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assurance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accord, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(38, 38, 38))
        );

        X.setLabel("X");
        X.setName("X"); // NOI18N
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        kGradientPanel1.setEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel1.setStartColor(new java.awt.Color(0, 102, 102));

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

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(retour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deconnecter)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void deconnecter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnecter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deconnecter1ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
        Demande_archive ar = new Demande_archive();
        ar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu1ActionPerformed

    private void retour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retour1ActionPerformed
        // TODO add your handling code here:
        Archive ar = new Archive();
        ar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_retour1ActionPerformed

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

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        // TODO add your handling code here:
        demandeNonTraite ar = new demandeNonTraite();
        ar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_retourActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl_projet", "root", "");
            PreparedStatement pst =(PreparedStatement) conn.prepareStatement("select * from etudiants,demande_docs,convention_stages where etudiants.id=demande_docs.id_etudiant and convention_stages.id=demande_docs.id_demande and etudiants.id=?;");
            pst.setString(1, Integer.toString(id_etu));
            rs = pst.executeQuery();
            rs.next();
            String nom_entreprise = rs.getString("nom_entreprise");
            String email_entreprise = rs.getString("email_entreprise");
            String adresse_entreprise = rs.getString("adresse_entreprise");
            String tel_entreprise = rs.getString("tel_entreprise");
            String nom = rs.getString("nom");
            String email = rs.getString("email_etudiant");
            String prenom = rs.getString("prenom");
            String filiere = rs.getString("filiere");
            String date_debut = rs.getString("date_debut");
            String date_fin = rs.getString("date_fin");
            String encadrant_entreprise = rs.getString("encadrant_entreprise");
            String encadrant_ecole = rs.getString("encadrant_ecole");
            String date = java.time.LocalDate.now().toString();
            String apogee = rs.getString("code_apogee");
            String sujet = rs.getString("sujet");
            String directeur = rs.getString("directeur");

            Document document = new Document("D:\\javadirectories\\convension.docx");
            Section section = document.getSections().get(0);
            Table table = section.getTables().get(1);
            Map<String, String> map = new HashMap<String, String>();

            map.put("societe",nom_entreprise);
            map.put("societe_adress",adresse_entreprise);
            map.put("societe_email",email_entreprise);
            map.put("societe_num",tel_entreprise);
            map.put("nom",nom);
            map.put("prenom",prenom);
            map.put("filiere",filiere);
            map.put("date_debut",date_debut);
            map.put("date_fin",date_fin);
            map.put("societe_encadrant",encadrant_entreprise);
            map.put("encadrant",encadrant_ecole);
            map.put("date",date);
            map.put("sujet",sujet);
            map.put("directeur",directeur);

            /**********************************************************************/
            String path ="D:\\javadirectories\\repos\\convension_"+apogee+"_"+rs.getString("id_demande")+".pdf";

            replaceTextinDocumentBody(map,document);
            replaceTextinTable(map,table);
            document.saveToFile(path, FileFormat.PDF);
            JOptionPane.showMessageDialog(null, "File generated, path : "+path);

            //archiver
            pst =(PreparedStatement) conn.prepareStatement("UPDATE demande_docs SET status='accepté', is_archive=1 WHERE id_etudiant=? and id_demande=?;");

            pst.setString(1, Integer.toString(id_etu));
            pst.setString(2, Integer.toString(id_demande));

            pst.executeUpdate();

            //open pdf fine
            File myFile = new File(path);
            Desktop.getDesktop().open(myFile);

            //variable de email
            //String email = rs.getString("email_etudiant");
            String bodymessage = "Votre convension de stage";
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
            demandeNonTraite ar = new demandeNonTraite();
            ar.setVisible(true);
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Refuser r = new Refuser();
        r.set_id_etudiant(id_etu);
        r.set_id_demande(id_demande);
        this.dispose();
        r.set_type("convention stage");
        r.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void accordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accordActionPerformed

        File myfile = new File(path1);
        try {
            Desktop.getDesktop().open(myfile);
            /* selecteur.setDialogTitle(" l'accord d'entreprise" );
            selecteur.showDialog(this, "consulter");*/
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "fichier introuvable!!!");

        }
    }//GEN-LAST:event_accordActionPerformed

    private void assuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assuranceActionPerformed
        File myfile = new File(path2);
        try {
            Desktop.getDesktop().open(myfile);
            /* selecteur.setDialogTitle(" l'accord d'entreprise" );
            selecteur.showDialog(this, "consulter");*/
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "fichier introuvable");

        }
    }//GEN-LAST:event_assuranceActionPerformed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        /* String email =emailEntrep.getText();
        if (!email.matches(EMAIL_PATTERN)) {
            evt.consume();
        } */
    }//GEN-LAST:event_emailKeyTyped

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        char c  =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_telKeyTyped

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void directeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directeurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directeurActionPerformed

    private void date_debutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_debutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_debutActionPerformed

    private void sujetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sujetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sujetActionPerformed

    private void encadrant_ecoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encadrant_ecoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encadrant_ecoleActionPerformed

    private void assistant_pedagogiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assistant_pedagogiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assistant_pedagogiqueActionPerformed

    private void adresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseActionPerformed

    private void nom_entrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_entrepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_entrepActionPerformed

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
            java.util.logging.Logger.getLogger(ConventionStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConventionStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConventionStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConventionStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConventionStage().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button X;
    private javax.swing.JButton accord;
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField assistant_pedagogique;
    private javax.swing.JButton assurance;
    private javax.swing.JFormattedTextField date_debut;
    private javax.swing.JFormattedTextField date_fin;
    private javax.swing.JButton deconnecter;
    private javax.swing.JButton deconnecter1;
    private javax.swing.JTextField directeur;
    private javax.swing.JTextField email;
    private javax.swing.JTextField encadrant_ecole;
    private javax.swing.JTextField encadrant_entreprise;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JButton menu;
    private javax.swing.JButton menu1;
    private javax.swing.JTextField nom_entrep;
    private javax.swing.JButton retour;
    private javax.swing.JButton retour1;
    private javax.swing.JTextField sujet;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
