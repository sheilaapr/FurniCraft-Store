package Menu_customer;

import Main.Menu_utama;
import Menu_Admin.Menu_kurir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu_order extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel tbl;

    public Menu_order() {
        initComponents();
        setLocationRelativeTo(this);
        setExtendedState(MAXIMIZED_BOTH);

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furnicraft", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tbl = new DefaultTableModel(new Object[]{"id", "Name", "Address", "No. Telp", "Furniture", "Price", "Qty", "Subtotal"}, 0);
        cs_dataTbl.setModel(tbl);
        refreshData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        furnitureBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        countBtn = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        cs_dataTbl = new javax.swing.JTable();
        txtTotPay = new javax.swing.JTextField();
        txtReturn = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtStot = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        countBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FurniCraft");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer");

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CUSTOMER DATA");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");

        furnitureBox.setBackground(new java.awt.Color(255, 255, 255));
        furnitureBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        furnitureBox.setForeground(new java.awt.Color(0, 0, 0));
        furnitureBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Coffee table", "Chair", "Bed", "Wardrobe", "Office chair", "Office table" }));
        furnitureBox.setToolTipText("");
        furnitureBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furnitureBoxActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Furniture");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");

        txtQty.setBackground(new java.awt.Color(255, 255, 255));
        txtQty.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtQty.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quantity");

        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("No. Telp");

        txtTelp.setBackground(new java.awt.Color(255, 255, 255));
        txtTelp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelp.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total Pay");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Return");

        countBtn.setBackground(new java.awt.Color(0, 153, 153));
        countBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        countBtn.setText("Count");
        countBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countBtnActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));

        resetBtn.setBackground(new java.awt.Color(0, 153, 153));
        resetBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        orderBtn.setBackground(new java.awt.Color(0, 153, 153));
        orderBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        orderBtn.setText("Order");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        cs_dataTbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cs_dataTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Address", "No. Telp", "Furniture", "Price", "Qty", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cs_dataTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cs_dataTblMouseClicked(evt);
            }
        });
        cs_dataTbl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cs_dataTblComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(cs_dataTbl);

        txtTotPay.setBackground(new java.awt.Color(255, 255, 255));
        txtTotPay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTotPay.setForeground(new java.awt.Color(0, 0, 0));
        txtTotPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotPayActionPerformed(evt);
            }
        });

        txtReturn.setBackground(new java.awt.Color(255, 255, 255));
        txtReturn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtReturn.setForeground(new java.awt.Color(0, 0, 0));
        txtReturn.setEnabled(false);
        txtReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReturnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 153, 153));
        addBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Return");

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));

        txtPay.setBackground(new java.awt.Color(255, 255, 255));
        txtPay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPay.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Pay");

        txtStot.setBackground(new java.awt.Color(255, 255, 255));
        txtStot.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtStot.setForeground(new java.awt.Color(0, 0, 0));
        txtStot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStotActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sub Total");

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");

        countBtn1.setBackground(new java.awt.Color(0, 153, 153));
        countBtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        countBtn1.setText("=");
        countBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotPay, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(txtReturn)
                    .addComponent(txtPay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(countBtn)
                .addGap(203, 203, 203)
                .addComponent(orderBtn)
                .addGap(397, 397, 397))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(403, 403, 403)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addGap(210, 210, 210))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(40, 40, 40))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtQty, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrice)
                                            .addComponent(furnitureBox, 0, 285, Short.MAX_VALUE)))
                                    .addGap(178, 178, 178)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(36, 36, 36)
                                            .addComponent(txtStot, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(countBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel14))
                                    .addGap(57, 57, 57)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtName)
                                            .addGap(176, 176, 176)
                                            .addComponent(jLabel12)
                                            .addGap(49, 49, 49)
                                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(furnitureBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStot)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(resetBtn))
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(countBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(orderBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(41, 41, 41))
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

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Order is being delivered", "FurniCraft.id",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Menu_utama menuUtama = new Menu_utama();
            menuUtama.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_orderBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        furnitureBox.setSelectedIndex(0);
        txtPrice.setText("");
        txtQty.setText("");
        txtTelp.setText("");
        txtStot.setText("");
        txtTotPay.setText("");
        txtReturn.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void countBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countBtnActionPerformed
        calculateReturn();

    }//GEN-LAST:event_countBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to back?", "FurniCraft.id",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Login_customer loginCust = new Login_customer();
            loginCust.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String furniture = furnitureBox.getSelectedItem().toString();
        String price = txtPrice.getText();
        String qty = txtQty.getText();
        String notelp = txtTelp.getText();
        String subtotal = txtStot.getText();

        try {
            String query = "INSERT INTO data_customer (id, name, address, notelp, furniture, price, qty, subtotal) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(query);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, address);
            pst.setString(4, notelp);
            pst.setString(5, furniture);
            pst.setString(6, price);
            pst.setString(7, qty);
            pst.setString(8, subtotal);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data added successfully!");

            txtId.setText("");
            txtName.setText("");
            txtAddress.setText("");
            furnitureBox.setSelectedIndex(0);
            txtPrice.setText("");
            txtQty.setText("");
            txtTelp.setText("");
            txtStot.setText("");
            txtTotPay.setText("");
            txtReturn.setText("");

            refreshData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving data: " + ex.getMessage());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void txtReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReturnActionPerformed

    private void cs_dataTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cs_dataTblMouseClicked

    }//GEN-LAST:event_cs_dataTblMouseClicked

    private void txtTotPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotPayActionPerformed
        // double totalPay= txtPrice*txtQty
    }//GEN-LAST:event_txtTotPayActionPerformed

    private void furnitureBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furnitureBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_furnitureBoxActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        refreshData();
    }//GEN-LAST:event_jPanel1ComponentShown

    private void cs_dataTblComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cs_dataTblComponentShown

    }//GEN-LAST:event_cs_dataTblComponentShown

    private void txtStotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStotActionPerformed

    }//GEN-LAST:event_txtStotActionPerformed

    private void countBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countBtn1ActionPerformed
        countSubtot();
    }//GEN-LAST:event_countBtn1ActionPerformed

    private void calculateReturn() {
        try {
            double totalPay = Double.parseDouble(txtTotPay.getText());
            double pay = Double.parseDouble(txtPay.getText());
            double returnAmount = totalPay - pay;
            txtReturn.setText(String.valueOf(returnAmount));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void countSubtot() {
        try {
            double price = Double.parseDouble(txtPrice.getText());
            double qty = Double.parseDouble(txtQty.getText());
            double countAmount = price * qty;
            txtStot.setText(String.valueOf(countAmount));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(Menu_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_order().setVisible(true);
            }
        });
    }

    private void refreshData() {
        try {
            String query = "SELECT * FROM data_customer";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            tbl.setRowCount(0);

            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String furniture = rs.getString("furniture");
                String price = rs.getString("price");
                String qty = rs.getString("qty");
                String notelp = rs.getString("notelp");
                String subtotal = rs.getString("subtotal");
                tbl.addRow(new Object[]{id, name, address, notelp, furniture, price, qty, subtotal});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton countBtn;
    private javax.swing.JButton countBtn1;
    private javax.swing.JTable cs_dataTbl;
    private javax.swing.JComboBox<String> furnitureBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtReturn;
    private javax.swing.JTextField txtStot;
    private javax.swing.JTextField txtTelp;
    private javax.swing.JTextField txtTotPay;
    // End of variables declaration//GEN-END:variables

    private static class DefaultTabelModel {

        public DefaultTabelModel() {
        }
    }

}
