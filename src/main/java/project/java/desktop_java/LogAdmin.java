/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.java.desktop_java;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author hp
 */
public class LogAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LogAdmin
     */
    public LogAdmin() {
        initComponents();
        //Border borderTextField = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        //txtmdp.setBorder(borderTextField);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnlogin1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtmdp1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtmdp = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        bttnLogin = new project.java.desktop_java.NewClass();
        X = new java.awt.Button();

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnlogin1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnlogin1.setForeground(new java.awt.Color(0, 102, 102));
        btnlogin1.setText("Log in");
        btnlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Log in as a admin");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Get your document for a click");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");

        txtmdp1.setBackground(new java.awt.Color(0, 102, 102));
        txtmdp1.setForeground(new java.awt.Color(255, 255, 255));
        txtmdp1.setBorder(null);
        txtmdp1.setCaretColor(new java.awt.Color(0, 102, 102));
        txtmdp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmdp1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mot de passe");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(txtmdp1)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmdp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("GET YOU DOCUMENT FOR A CLICK");

        jPanel5.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Achraf\\Desktop\\FINAL\\projetGL\\projetGL\\projetGL\\desktop_java_F\\data\\LogoDesk-01.png")); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(-20, -30, 250, 290);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        kGradientPanel1.setEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel1.setStartColor(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log in as a admin");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        txtuser.setBackground(new java.awt.Color(0, 102, 102));
        txtuser.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setText("Entrez votre username");
        txtuser.setBorder(null);
        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mot de passe");

        txtmdp.setBackground(new java.awt.Color(0, 102, 102));
        txtmdp.setForeground(new java.awt.Color(255, 255, 255));
        txtmdp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmdp.setText(".............");
        txtmdp.setBorder(null);
        txtmdp.setCaretColor(new java.awt.Color(0, 102, 102));
        txtmdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmdpActionPerformed(evt);
            }
        });

        bttnLogin.setForeground(new java.awt.Color(0, 102, 102));
        bttnLogin.setText("Log in");
        bttnLogin.setBorderColor(new java.awt.Color(0, 102, 102));
        bttnLogin.setBorderPainted(false);
        bttnLogin.setColorOver(new java.awt.Color(204, 255, 204));
        bttnLogin.setFocusable(false);
        bttnLogin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bttnLogin.setRadius(20);
        bttnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLoginActionPerformed(evt);
            }
        });

        X.setLabel("X");
        X.setName("X"); // NOI18N
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtuser, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtmdp, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(bttnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bttnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogin1ActionPerformed

    private void txtmdp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmdp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmdp1ActionPerformed

    private void txtmdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmdpActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void bttnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLoginActionPerformed
        // TODO add your handling code here:
        {                                         
        // TODO add your handling code here:
        if(checkEmptyFields())
        JOptionPane.showMessageDialog(null, "Please entrez votre password", "Missing information", JOptionPane.ERROR_MESSAGE);
        else{
            PreparedStatement ps;
            ResultSet rs;
            String passwd = txtmdp.getText();
            String login = txtuser.getText();
            String query = "SELECT * FROM gl_projet.admin WHERE login=? and passwd=?";
            try{
                ps = ConnectionDB.getConnexion().prepareStatement(query);
                ps.setString(1,login);
                ps.setString(2,passwd);
                rs = ps.executeQuery();
                if(rs.next()){
                    Demande_archive log = new Demande_archive();
                    log.setVisible(true);
                    setVisible(false);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "No user with this password","Incorrect data",JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception ex){

            }
        }
    } 
    }//GEN-LAST:event_bttnLoginActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_XActionPerformed

    private boolean checkEmptyFields(){
        return(txtmdp.getText().equals(""));
            }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button X;
    private javax.swing.JButton btnlogin1;
    private project.java.desktop_java.NewClass bttnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtmdp;
    private javax.swing.JPasswordField txtmdp1;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}