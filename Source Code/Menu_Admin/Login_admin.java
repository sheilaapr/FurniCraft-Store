package Menu_Admin;

import Main.Menu_register;
import Main.Menu_utama;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Login_admin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login_admin() {
        initComponents();
        setLocationRelativeTo(this);
        setExtendedState(MAXIMIZED_BOTH);

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furnicraft", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\1_Kuliah\\Semester 2\\PRAKTIKUM PBO\\ProjectAkhir\\furnicraft-removebg-preview.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADMIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 831, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\1_Kuliah\\Semester 2\\PRAKTIKUM PBO\\ProjectAkhir\\furnicraft-removebg-preview.png")); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter your personal data");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username :");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password :");

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 153, 153));
        loginBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(0, 153, 153));
        resetBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        backBtn1.setBackground(new java.awt.Color(0, 153, 153));
        backBtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backBtn1.setText("Register");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtUserLayout = new javax.swing.GroupLayout(txtUser);
        txtUser.setLayout(txtUserLayout);
        txtUserLayout.setHorizontalGroup(
            txtUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(txtUserLayout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(txtUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtUserLayout.createSequentialGroup()
                        .addComponent(backBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn)
                        .addGap(28, 28, 28))
                    .addGroup(txtUserLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addGroup(txtUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                            .addComponent(txtPass))))
                .addContainerGap(329, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(58, 58, 58))
        );
        txtUserLayout.setVerticalGroup(
            txtUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtUserLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(150, 150, 150)
                .addGroup(txtUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtUserLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(txtUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn)
                    .addComponent(loginBtn)
                    .addComponent(backBtn1))
                .addGap(142, 142, 142))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to back?", "FurniCraft.id",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Menu_utama menuUtama = new Menu_utama();
            menuUtama.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try {
            String query = "SELECT * FROM Login_admin WHERE Username=? AND Password=?";

            pst = con.prepareStatement(query);
            pst.setString(1, txtUsername.getText());
            pst.setString(2, txtPass.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Hallo " + rs.getString("Username") + "! \n"
                        + "Logged in as admin successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Login failed");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        {
            Menu_kurir menuKurir = new Menu_kurir();
            menuKurir.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        {
            Menu_register menuRegister = new Menu_register();
            menuRegister.setVisible(true);
            dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_backBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPanel txtUser;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
