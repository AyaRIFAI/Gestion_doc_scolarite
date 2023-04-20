/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.java.desktop_java;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.io.File;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import project.java.desktop_java.ConnectionDB;
import java.sql.*;
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
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Attestation extends javax.swing.JFrame {
 ResultSet rs = null;
    PreparedStatement ps = null;
    int id_etu,id_demande;
    /**
     * Creates new form Attestation
     */
    public Attestation(int id,int id_etud) {
        initComponents();
        id_etu = id_etud;
        id_demande = id;
        try {
                      ps = (PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select niveau from gl_projet.attestation_scolarites where id=?");
                      ps.setInt(1,id);
                      rs = ps.executeQuery();
                      if(rs.next()){
                         niveau1.setText(rs.getString("niveau"));
                      
                  } 
                   niveau1.setEditable(false);
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

        jPanel51 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        envoyer = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        niveau = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        envoie = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        niveau1 = new javax.swing.JTextField();
        telecharger = new javax.swing.JButton();
        X = new java.awt.Button();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        retour = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        deconnecter = new javax.swing.JButton();

        jPanel51.setBackground(new java.awt.Color(0, 102, 102));

        jLabel74.setBackground(new java.awt.Color(0, 0, 102));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("niveau");

        envoyer.setBackground(new java.awt.Color(0, 153, 153));
        envoyer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        envoyer.setForeground(new java.awt.Color(255, 255, 255));
        envoyer.setText("Envoyer");

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Visualisation des données");
        title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        niveau.setBackground(new java.awt.Color(0, 153, 153));
        niveau.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel74)
                .addGap(38, 38, 38)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(niveau)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addComponent(envoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(envoyer)
                .addGap(68, 68, 68))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));

        jLabel75.setBackground(new java.awt.Color(0, 102, 102));
        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 102, 102));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Niveau");

        envoie.setBackground(new java.awt.Color(0, 102, 102));
        envoie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        envoie.setForeground(new java.awt.Color(255, 255, 255));
        envoie.setText("Envoyer");
        envoie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoieActionPerformed(evt);
            }
        });

        title1.setBackground(new java.awt.Color(0, 102, 102));
        title1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 102, 102));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Visualisation des données");
        title1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        niveau1.setBackground(new java.awt.Color(0, 102, 102));
        niveau1.setForeground(new java.awt.Color(255, 255, 255));

        telecharger.setBackground(new java.awt.Color(0, 102, 102));
        telecharger.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telecharger.setForeground(new java.awt.Color(255, 255, 255));
        telecharger.setText("Télécharger");
        telecharger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telechargerActionPerformed(evt);
            }
        });

        X.setLabel("X");
        X.setName("X"); // NOI18N
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addGap(18, 18, 18)
                        .addComponent(niveau1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telecharger, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(envoie, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))
                    .addComponent(X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(niveau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addGap(28, 28, 28)
                .addComponent(envoie)
                .addGap(18, 18, 18)
                .addComponent(telecharger)
                .addGap(62, 62, 62))
        );

        kGradientPanel4.setEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel4.setStartColor(new java.awt.Color(0, 102, 102));

        retour.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        retour.setForeground(new java.awt.Color(0, 102, 102));
        retour.setText("Retour");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
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

        deconnecter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deconnecter.setForeground(new java.awt.Color(0, 102, 102));
        deconnecter.setText("Se déconnecter");
        deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnecterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deconnecter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(retour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deconnecter)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        // TODO add your handling code here:
         Archive ar = new Archive();
         ar.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_retourActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Demande_archive ar = new Demande_archive();
       ar.setVisible(true);
       this.dispose();   
    }//GEN-LAST:event_menuActionPerformed

    private void deconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnecterActionPerformed
        // TODO add your handling code here:
        LogAdmin menu = new LogAdmin();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_deconnecterActionPerformed

    private void envoieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoieActionPerformed
        // TODO add your handling code here:
        try {
        CanvasLoop c = new CanvasLoop();
        c.setVisible(true);
         Class.forName("com.mysql.cj.jdbc.Driver");
            
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl_projet", "root", "");
        PreparedStatement pst =(PreparedStatement) conn.prepareStatement("select * from etudiants,demande_docs,attestation_scolarites where etudiants.id=demande_docs.id_etudiant and attestation_scolarites.id=demande_docs.id_demande and is_archive=1 and etudiants.id=? and demande_docs.id_demande=? ;");
        pst.setString(1, Integer.toString(id_etu));
        pst.setString(2, Integer.toString(id_demande));
        ResultSet rs = pst.executeQuery();
        rs.next();
        
        
        String bodymessage="Bonjour, \nVoici votre attestation. \n \n \n Très cordialement";
        String pathpdf ="D:\\javadirectories\\repos\\attestation_"+rs.getString("code_apogee")+"_"+rs.getString("id_demande")+".pdf";
        
        //open pdf fine
        //File myFile = new File(pathpdf);
        //Desktop.getDesktop().open(myFile);
        // We suppose you have already set your JFrame 
        
        /*JFrame frame = new JFrame("Loader"); // windows title is Loader, change
                                      // it if you don't like it!
        URL url=null;
        ImageIcon icon = createImageIcon("images/middle.gif","a pretty but meaningless splat");

        Icon icon = new ImageIcon(icon);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);*/
        
        //variable de email
        String subject = "Tester email";
        String myAdress = "porjetgenie.logiciel2022@gmail.com";
        String passwordEMail = "genielogiciel";
        String contenue = bodymessage;
        String otherEmail = rs.getString("email_etudiant");
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
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(otherEmail));
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
          c.dispose();
        JOptionPane.showMessageDialog(null, "email sent");
        //frame.dispose();
        Archive ar = new Archive();
         ar.setVisible(true);
         this.dispose();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_envoieActionPerformed

    private void telechargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telechargerActionPerformed
        // TODO add your handling code here:
         try {
             PreparedStatement pst1 =(PreparedStatement) ConnectionDB.getConnexion().prepareStatement("select * from etudiants,demande_docs,attestation_scolarites where etudiants.id=demande_docs.id_etudiant and attestation_scolarites.id=demande_docs.id_demande and is_archive=1 and etudiants.id=? and demande_docs.id_demande=? ;");
        pst1.setString(1, Integer.toString(id_etu));
        pst1.setString(2, Integer.toString(id_demande));
            
                             
                             ResultSet rs1 = pst1.executeQuery();
                             
                             rs1.next();
                             
                             String path ="D:\\javadirectories\\repos\\attestation_"+rs1.getString("code_apogee")+"_"+id_demande+".pdf";
                             //open pdf fine
                             File myFile = new File(path);
                             Desktop.getDesktop().open(myFile);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur");
        }
    }//GEN-LAST:event_telechargerActionPerformed

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
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attestation().setVisible(true);
            }
        });
     */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button X;
    private javax.swing.JButton deconnecter;
    private javax.swing.JButton envoie;
    private javax.swing.JButton envoyer;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JButton menu;
    private javax.swing.JTextField niveau;
    private javax.swing.JTextField niveau1;
    private javax.swing.JButton retour;
    private javax.swing.JButton telecharger;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
