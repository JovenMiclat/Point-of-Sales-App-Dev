package admin_GUI;
import adet_pos.dbConnectionRepo;
import adet_pos.productTable;
import adet_pos.welcome;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Admin_Inv extends javax.swing.JFrame {
    int ttlX, ttlY;
    public Admin_Inv() {
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
            java.util.logging.Logger.getLogger(Admin_Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        tableDB();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPName = new javax.swing.JTextField();
        tfPDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfPQty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfPPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfPCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnPAdd = new javax.swing.JButton();
        btnPUpdate = new javax.swing.JButton();
        btnPDelete = new javax.swing.JButton();

        tfPCode.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
               if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'|| ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                tfPCode.setEditable(true);
               } else {
                tfPCode.setEditable(false);
                JOptionPane.showMessageDialog(null, "Product Code must only contain numbers!", "Product Code Invalid", JOptionPane.WARNING_MESSAGE);
               }
            }
         });

         tfPQty.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
               if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'|| ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                tfPQty.setEditable(true);
               } else {
                tfPQty.setEditable(false);
                JOptionPane.showMessageDialog(null, "Quantity must only contain numbers!", "Quantity Invalid", JOptionPane.WARNING_MESSAGE);
               }
            }
         });

         tfPPrice.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
               if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'|| ke.getKeyChar() == KeyEvent.VK_BACK_SPACE || ke.getKeyChar() == '.') {
                tfPPrice.setEditable(true);
               } else {
                tfPPrice.setEditable(false);
                JOptionPane.showMessageDialog(null, "Product Price must only contain decimal numbers!", "Price Invalid", JOptionPane.WARNING_MESSAGE);
               }
            }
         });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(35, 38, 43));
        tfPCode.setBackground(new java.awt.Color(211, 211, 211));
        jPanel6.setBackground(new java.awt.Color(35, 38, 43));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_close_window_24px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_minimize_window_24px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(993, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(28, 30, 32));

        jPanel3.setBackground(new java.awt.Color(28, 30, 32));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 238, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_open_box_50px_1.png"))); // NOI18N
        jLabel1.setText("  Inventory");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(28, 30, 32));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 238, 242));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_calculator_50px.png"))); // NOI18N
        jLabel2.setText("  POS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(17, 17, 17))
        );

        jPanel5.setBackground(new java.awt.Color(28, 30, 32));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 238, 242));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_logout_rounded_left_50px.png"))); // NOI18N
        jLabel3.setText("  Log-out");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(17, 17, 17))
        );

        jPanel7.setBackground(new java.awt.Color(28, 30, 32));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 238, 242));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sales_performance_50px.png"))); // NOI18N
        jLabel12.setText("  Sales");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 238, 242));
        jLabel4.setText("Products");

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 238, 242));
        jLabel5.setText("Product Name:");

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 238, 242));
        jLabel6.setText("Product Description:");

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 238, 242));
        jLabel7.setText("Quantity:");

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 238, 242));
        jLabel10.setText("Price:");

        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(237, 238, 242));
        jLabel11.setText("Product Code:");

        tblProduct.setBackground(new java.awt.Color(237, 238, 242));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Name", "Description", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProduct.setGridColor(new java.awt.Color(153, 153, 153));
        tblProduct.setSelectionBackground(new java.awt.Color(249, 84, 94));
        tblProduct.setSelectionForeground(new java.awt.Color(28, 30, 32));
        tblProduct.setShowGrid(true);
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        tblProduct.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblProduct.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProduct.getColumnModel().getColumn(2).setPreferredWidth(500);
        tblProduct.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblProduct.getColumnModel().getColumn(4).setPreferredWidth(40);
        jScrollPane1.setViewportView(tblProduct);

        btnPAdd.setBackground(new java.awt.Color(249, 84, 94));
        btnPAdd.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnPAdd.setForeground(new java.awt.Color(237, 238, 242));
        btnPAdd.setText("Add");
        btnPAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAddActionPerformed(evt);
            }
        });

        btnPUpdate.setBackground(new java.awt.Color(249, 84, 94));
        btnPUpdate.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnPUpdate.setForeground(new java.awt.Color(237, 238, 242));
        btnPUpdate.setText("Update");
        btnPUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPUpdateActionPerformed(evt);
            }
        });

        btnPDelete.setBackground(new java.awt.Color(249, 84, 94));
        btnPDelete.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnPDelete.setForeground(new java.awt.Color(237, 238, 242));
        btnPDelete.setText("Delete");
        btnPDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(tfPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(45, 45, 45)
                                                        .addComponent(jLabel6))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel5)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfPDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfPName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(btnPUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(75, 75, 75)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPQty, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tfPQty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tfPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnPUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnPDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setState(Admin_Inv.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        dispose();
        welcome wc = new welcome();
        wc.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Admin_Inv ainv = new Admin_Inv();
        ainv.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Admin_POS apos = new Admin_POS();
        apos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        Admin_Sales asales = new Admin_Sales();
        asales.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void btnPAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAddActionPerformed
        if(tfPCode.getText().isEmpty() || tfPName.getText().isEmpty() || tfPDesc.getText().isEmpty() || tfPPrice.getText().isEmpty() || tfPQty.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Fill-in on all of the textfields!", "Can't add product", JOptionPane.WARNING_MESSAGE);
        }
        else{
            dbConnectionRepo db = new dbConnectionRepo();
            int prodcode = Integer.parseInt(tfPCode.getText());
            String prodname = tfPName.getText();
            String proddesc = tfPDesc.getText();
            double prodprice = Double.parseDouble(tfPPrice.getText());
            int prodqty = Integer.parseInt(tfPQty.getText());
            db.product_AddDAO(prodcode, prodname, proddesc, prodprice, prodqty);  
            tfPCode.setText(""); tfPDesc.setText(""); tfPName.setText(""); tfPPrice.setText(""); tfPQty.setText("");
            tfPCode.requestFocus();
        }
        tableDB();
    }//GEN-LAST:event_btnPAddActionPerformed

    private void btnPUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPUpdateActionPerformed
        if(tfPCode.getText().isEmpty() || tfPName.getText().isEmpty() || tfPDesc.getText().isEmpty() || tfPPrice.getText().isEmpty() || tfPQty.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Fill-in on all of the textfields!", "Can't update product", JOptionPane.WARNING_MESSAGE);
        }        
        else{
            dbConnectionRepo db = new dbConnectionRepo();
            int prodcode = Integer.parseInt(tfPCode.getText());
            String prodname = tfPName.getText();
            String proddesc = tfPDesc.getText();
            double prodprice = Double.parseDouble(tfPPrice.getText());
            int prodqty = Integer.parseInt(tfPQty.getText());
            db.product_UpdateDAO(prodcode, prodname, proddesc, prodprice, prodqty);   
            tfPCode.setText(""); tfPDesc.setText(""); tfPName.setText(""); tfPPrice.setText(""); tfPQty.setText("");
            tfPCode.requestFocus();
        }
        tableDB();
    }//GEN-LAST:event_btnPUpdateActionPerformed

    private void btnPDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDeleteActionPerformed
        if(tfPCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nothing to delete", "Select something to delete", JOptionPane.WARNING_MESSAGE);
        }
        else{
            int confirmDel = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?");
            if(confirmDel == JOptionPane.YES_OPTION){
                dbConnectionRepo db = new dbConnectionRepo();
                int prodcode = Integer.parseInt(tfPCode.getText());
                db.product_DeleteDAO(prodcode);
                tfPCode.setText(""); tfPDesc.setText(""); tfPName.setText(""); tfPPrice.setText(""); tfPQty.setText("");
                tfPCode.requestFocus();
            }
        }
        tableDB();
    }//GEN-LAST:event_btnPDeleteActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        DefaultTableModel d = (DefaultTableModel) tblProduct.getModel();
        int selectIndex = tblProduct.getSelectedRow();
        tfPCode.setText(d.getValueAt(selectIndex, 0).toString());
        tfPName.setText(d.getValueAt(selectIndex, 1).toString());
        tfPDesc.setText(d.getValueAt(selectIndex, 2).toString());
        tfPQty.setText(d.getValueAt(selectIndex, 3).toString());
        tfPPrice.setText(d.getValueAt(selectIndex, 4).toString());
    }//GEN-LAST:event_tblProductMouseClicked

    private void tableDB(){
        dbConnectionRepo db = new dbConnectionRepo();
        List<productTable> list = db.product_GetRecordsDAO();
        DefaultTableModel d = (DefaultTableModel) tblProduct.getModel();
        d.setRowCount(0);
        Object rowData[] = new Object[5];
        for(int i = 0; i < list.size(); i++){
           rowData[0] = list.get(i).getpcode();
           rowData[1] = list.get(i).getproduct_name();
           rowData[2] = list.get(i).getdescription();
           rowData[3] = list.get(i).getquantity();
           rowData[4] = list.get(i).getprice();
           d.addRow(rowData);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPAdd;
    private javax.swing.JButton btnPDelete;
    private javax.swing.JButton btnPUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField tfPCode;
    private javax.swing.JTextField tfPDesc;
    private javax.swing.JTextField tfPName;
    private javax.swing.JTextField tfPPrice;
    private javax.swing.JTextField tfPQty;
    // End of variables declaration//GEN-END:variables
}
