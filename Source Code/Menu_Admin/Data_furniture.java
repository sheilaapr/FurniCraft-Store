package Menu_Admin;

import Main.Menu_utama;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Data_furniture extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel tbl;

    public Data_furniture() {
        initComponents();
        setLocationRelativeTo(this);
        setExtendedState(MAXIMIZED_BOTH);

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furnicraft", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tbl = new DefaultTableModel(new Object[]{"Code", "Category", "Name", "Prices"}, 0);
        furniture_dataTbl.setModel(tbl);
        refreshData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtFcode = new javax.swing.JTextField();
        txtFprices = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        furniture_dataTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FurniCraft");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin");

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(backBtn))
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Furniture Data");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Category");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Furniture Code ");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Furniture Name ");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Furniture Prices ");

        txtCategory.setBackground(new java.awt.Color(255, 255, 255));
        txtCategory.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCategory.setForeground(new java.awt.Color(0, 0, 0));
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        txtFcode.setBackground(new java.awt.Color(255, 255, 255));
        txtFcode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFcode.setForeground(new java.awt.Color(0, 0, 0));

        txtFprices.setBackground(new java.awt.Color(255, 255, 255));
        txtFprices.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFprices.setForeground(new java.awt.Color(0, 0, 0));

        txtFname.setBackground(new java.awt.Color(255, 255, 255));
        txtFname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFname.setForeground(new java.awt.Color(0, 0, 0));

        addBtn.setBackground(new java.awt.Color(0, 153, 153));
        addBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(0, 153, 153));
        resetBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resetBtn.setText("Delete");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        furniture_dataTbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        furniture_dataTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Category", "Furniture", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        furniture_dataTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                furniture_dataTblMouseClicked(evt);
            }
        });
        furniture_dataTbl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                furniture_dataTblComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(furniture_dataTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetBtn))
                            .addComponent(txtFcode, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                            .addComponent(txtFprices)
                            .addComponent(txtFname)
                            .addComponent(txtCategory))))
                .addGap(243, 243, 243))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(537, 537, 537)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFcode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFprices, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        txtFcode.setText("");
        txtCategory.setText("");
        txtFname.setText("");
        txtFprices.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String fCode = txtFcode.getText();
        String Category = txtCategory.getText();
        String fName = txtFname.getText();
        String fPrices = txtFprices.getText();

        try {
            String query = "INSERT INTO data_furniture (fCode, Category, fName, fPrices) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(query);
            pst.setString(1, fCode);
            pst.setString(2, Category);
            pst.setString(3, fName);
            pst.setString(4, fPrices);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data saved successfully!");
            
            txtFcode.setText("");
            txtCategory.setText("");
            txtFname.setText("");
            txtFprices.setText("");

            refreshData();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving data: " + ex.getMessage());
        }
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to back?", "FurniCraft.id",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Menu_kurir menuKurir = new Menu_kurir();
            menuKurir.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void furniture_dataTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_furniture_dataTblMouseClicked
    
    }//GEN-LAST:event_furniture_dataTblMouseClicked

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        refreshData();
    }//GEN-LAST:event_jPanel1ComponentShown

    private void furniture_dataTblComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_furniture_dataTblComponentShown
   
    }//GEN-LAST:event_furniture_dataTblComponentShown

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
            java.util.logging.Logger.getLogger(Data_furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_furniture().setVisible(true);
            }
        });
    }

    private void refreshData(){
        try {
            String query = "SELECT * FROM data_furniture";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            tbl.setRowCount(0);

            while (rs.next()) {
                String fCode = rs.getString("fCode");
                String Category = rs.getString("Category");
                String fName = rs.getString("fName");
                String fPrices = rs.getString("fPrices");
                tbl.addRow(new Object[]{fCode, Category, fName, fPrices});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        } }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable furniture_dataTbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtFcode;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtFprices;
    // End of variables declaration//GEN-END:variables

    private static class DefaultTabelModel {
        public DefaultTabelModel() {
        }
    }
}
