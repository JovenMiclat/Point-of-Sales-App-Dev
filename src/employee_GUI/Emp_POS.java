package employee_GUI;
import adet_pos.dbConnectionRepo;
import adet_pos.welcome;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Emp_POS extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    public Emp_POS() {
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
            java.util.logging.Logger.getLogger(Emp_POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emp_POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emp_POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emp_POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfPOSPCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        tfPOSPName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spPOSPQty = new javax.swing.JSpinner();
        tfPOSPPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPOSAmount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAddCart = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfPOSTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfPOSCash = new javax.swing.JTextField();
        tfPOSChange = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnPOSPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPOS = new javax.swing.JTable();
        btnPOSVoid = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taReceipt = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        btnPOSConfirm = new javax.swing.JButton();
        btnPOSRefund = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(35, 38, 43));

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

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 238, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_logout_rounded_left_20px.png"))); // NOI18N
        jLabel1.setText("Logout");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel8.setBackground(new java.awt.Color(35, 38, 43));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter product code here:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18), new java.awt.Color(237, 238, 242))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 238, 242));
        jLabel4.setText("Product Code");

        btnSearch.setBackground(new java.awt.Color(249, 84, 94));
        btnSearch.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(237, 238, 242));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tfPOSPName.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 238, 242));
        jLabel5.setText("Product Name");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 238, 242));
        jLabel6.setText("Quantity");

        spPOSPQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        spPOSPQty.setEnabled(false);
        spPOSPQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPOSPQtyStateChanged(evt);
            }
        });

        tfPOSPPrice.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 238, 242));
        jLabel7.setText("Price");

        tfPOSAmount.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 238, 242));
        jLabel10.setText("Amount");

        btnAddCart.setBackground(new java.awt.Color(249, 84, 94));
        btnAddCart.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        btnAddCart.setForeground(new java.awt.Color(237, 238, 242));
        btnAddCart.setText("Add to Cart");
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfPOSPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfPOSPName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spPOSPQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tfPOSPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnSearch)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfPOSAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPOSPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPOSPName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(spPOSPQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfPOSPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPOSAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(237, 238, 242));
        jLabel11.setText("Total Amount");

        tfPOSTotal.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 238, 242));
        jLabel12.setText("Cash");

        tfPOSChange.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(237, 238, 242));
        jLabel13.setText("Change");

        btnPOSPrint.setBackground(new java.awt.Color(249, 84, 94));
        btnPOSPrint.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnPOSPrint.setForeground(new java.awt.Color(237, 238, 242));
        btnPOSPrint.setText("Print Receipt");
        btnPOSPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPOSPrintActionPerformed(evt);
            }
        });

        tblPOS.setBackground(new java.awt.Color(237, 238, 242));
        tblPOS.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tblPOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Quantity", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPOS.setGridColor(new java.awt.Color(153, 153, 153));
        tblPOS.setSelectionBackground(new java.awt.Color(249, 84, 94));
        tblPOS.setSelectionForeground(new java.awt.Color(28, 30, 32));
        tblPOS.setShowGrid(false);
        tblPOS.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblPOS);

        btnPOSVoid.setBackground(new java.awt.Color(249, 84, 94));
        btnPOSVoid.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        btnPOSVoid.setForeground(new java.awt.Color(237, 238, 242));
        btnPOSVoid.setText("Void Item");
        btnPOSVoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPOSVoidActionPerformed(evt);
            }
        });

        taReceipt.setBackground(new java.awt.Color(237, 238, 242));
        taReceipt.setColumns(20);
        taReceipt.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        taReceipt.setForeground(new java.awt.Color(28, 30, 32));
        taReceipt.setRows(5);
        taReceipt.setDisabledTextColor(new java.awt.Color(28, 30, 32));
        taReceipt.setEnabled(false);
        jScrollPane2.setViewportView(taReceipt);

        jLabel14.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(237, 238, 242));
        jLabel14.setText("Receipt");

        btnPOSConfirm.setBackground(new java.awt.Color(249, 84, 94));
        btnPOSConfirm.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnPOSConfirm.setForeground(new java.awt.Color(237, 238, 242));
        btnPOSConfirm.setText("Confirm Bill");
        btnPOSConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPOSConfirmActionPerformed(evt);
            }
        });

        btnPOSRefund.setBackground(new java.awt.Color(249, 84, 94));
        btnPOSRefund.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnPOSRefund.setForeground(new java.awt.Color(237, 238, 242));
        btnPOSRefund.setText("Refund a transaction");
        btnPOSRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPOSRefundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPOSVoid)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(tfPOSChange, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPOSCash, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPOSTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPOSConfirm)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPOSPrint))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnPOSRefund, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(126, 126, 126))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPOSTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPOSCash, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPOSChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPOSConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPOSPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnPOSRefund, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPOSVoid))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setState(Emp_POS.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int prodcode = Integer.parseInt(tfPOSPCode.getText());
        String conString = "jdbc:mysql://localhost:3306/adet?user=root&password=root&autoReconnect=true&useSSL=false";
        String driver =  "com.mysql.cj.jdbc.Driver";
        dbConnectionRepo db = new dbConnectionRepo();
        try(Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "select * from product where pcode = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, prodcode);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                String prodname = rs.getString("product_name");
                int prodcd = rs.getInt("price");
                tfPOSPName.setText(prodname);
                tfPOSPPrice.setText(String.valueOf(prodcd));
                spPOSPQty.setEnabled(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Product Not Found", "Entered product code does not exist in the database.", JOptionPane.WARNING_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        int prodcode = Integer.parseInt(tfPOSPCode.getText());
        String conString = "jdbc:mysql://localhost:3306/adet?user=root&password=root&autoReconnect=true&useSSL=false";
        String driver =  "com.mysql.cj.jdbc.Driver";
        dbConnectionRepo db = new dbConnectionRepo();
        try(Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "select * from product where pcode = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, prodcode);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int currentqty = rs.getInt("quantity");
                int newqty = Integer.parseInt(spPOSPQty.getValue().toString());
                if(newqty > currentqty){
                    JOptionPane.showMessageDialog(null, "Current Stock: " + currentqty, "Insufficient Stocks", JOptionPane.WARNING_MESSAGE);
                }
                
                else{
                    model = (DefaultTableModel) tblPOS.getModel();
                    int intpcode = Integer.parseInt(tfPOSPCode.getText());
                    double doubpprice = Double.parseDouble(tfPOSPPrice.getText());
                    double doubamount = Double.parseDouble(tfPOSAmount.getText());
                    model.addRow(new Object[]
                    {
                        intpcode,
                        tfPOSPName.getText(),
                        spPOSPQty.getValue(),
                        doubpprice,
                        doubamount,
                    });
                    double sum = 0;
                    for(int i = 0; i < tblPOS.getRowCount(); i++){
                        sum += Double.parseDouble(tblPOS.getValueAt(i, 4).toString());
                    }
                    tfPOSTotal.setText(String.valueOf(sum));
                    tfPOSPCode.setText("");
                    tfPOSPName.setText("");
                    tfPOSPPrice.setText("");
                    tfPOSAmount.setText("");
                    tfPOSPCode.requestFocus();
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void btnPOSPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPOSPrintActionPerformed
        try {
            taReceipt.print();
            Emp_POS epos = new Emp_POS();
            epos.setVisible(true);
        } catch (PrinterException ex) {
            Logger.getLogger(Emp_POS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPOSPrintActionPerformed

    private void btnPOSVoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPOSVoidActionPerformed
        String admin_username = JOptionPane.showInputDialog("Admin Username: ");
        String admin_password = JOptionPane.showInputDialog("Admin Password: ");
                dbConnectionRepo db = new dbConnectionRepo();
        if(db.adminLoginDao(admin_username, admin_password)){
            model.removeRow(tblPOS.getSelectedRow());
            int sum = 0;
            for(int i = 0; i<tblPOS.getRowCount(); i++){
                sum += Double.parseDouble(tblPOS.getValueAt(i, 4).toString());
            }
            tfPOSTotal.setText(String.valueOf(sum));   
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Invalid username/password!");
        }
    }//GEN-LAST:event_btnPOSVoidActionPerformed

    private void btnPOSConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPOSConfirmActionPerformed
        double tol = Double.parseDouble(tfPOSTotal.getText());
        double cash = Double.parseDouble(tfPOSCash.getText());
        double change = cash - tol;
        if(tfPOSCash.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error", "Fill up the cash field.", JOptionPane.WARNING_MESSAGE);
        }
        else if(cash < tol){
            JOptionPane.showMessageDialog(null, "Insufficient funds", "", JOptionPane.WARNING_MESSAGE);
        }
        else{
            tfPOSChange.setText(String.valueOf(change));
            btnPOSVoid.setEnabled(false);
            recordSales();
            receiptPrint();
        }
    }//GEN-LAST:event_btnPOSConfirmActionPerformed

    private void spPOSPQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPOSPQtyStateChanged
        int qtyval = Integer.parseInt(spPOSPQty.getValue().toString());
        int price = Integer.parseInt(tfPOSPPrice.getText());
        int tol = qtyval*price;
        tfPOSAmount.setText(String.valueOf(tol));
    }//GEN-LAST:event_spPOSPQtyStateChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        welcome wc = new welcome();
        wc.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnPOSRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPOSRefundActionPerformed
        String admin_username = JOptionPane.showInputDialog("Admin Username: ");
        String admin_password = JOptionPane.showInputDialog("Admin Password: ");
                dbConnectionRepo db = new dbConnectionRepo();
        if(db.adminLoginDao(admin_username, admin_password)){
            String refund = JOptionPane.showInputDialog("Transaction ID to refund: ");
            int ref = Integer.parseInt(refund);
            String conString = "jdbc:mysql://localhost:3306/adet?user=root&password=root&autoReconnect=true&useSSL=false";
            String driver =  "com.mysql.cj.jdbc.Driver";
            try(Connection con = DriverManager.getConnection(conString);)
            {
                String sql = "select * from sales where id = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, ref);
                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    String sql2 = "UPDATE sales SET subtotal = ?, status = ? where id = ?";
                    ps = con.prepareStatement(sql2);
                    ps.setDouble(1, 0);
                    ps.setString(2, "REFUNDED");
                    ps.setInt(3, ref);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Refund Successful!");
                }
                else
                    JOptionPane.showMessageDialog(null, "Transaction ID not found", "Entered Transaction ID does not exist in the database.", JOptionPane.WARNING_MESSAGE);
                ps.addBatch();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Invalid username/password!");
        }
    }//GEN-LAST:event_btnPOSRefundActionPerformed

    private void recordSales(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        double subtotal = Double.parseDouble(tfPOSTotal.getText());
        double cash = Double.parseDouble(tfPOSCash.getText());
        double change = Double.parseDouble(tfPOSChange.getText());
        dbConnectionRepo db = new dbConnectionRepo();
        String status = "SUCCESS";
        int lastid = db.sales_AddDAO(date, subtotal, cash, change, status);
        
        String conString = "jdbc:mysql://localhost:3306/adet?user=root&password=root&autoReconnect=true&useSSL=false";
        String driver =  "com.mysql.cj.jdbc.Driver";
        int rows = tblPOS.getRowCount();
        try(Connection con = DriverManager.getConnection(conString);){
            String sql = "INSERT INTO productsales (sales_id, product_id, price, qty, total) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);  
            int pcode,qty;
            double price, amount;
            for(int i = 0; i < tblPOS.getRowCount(); i++){
                pcode = Integer.parseInt(tblPOS.getValueAt(i, 0).toString());
                qty = Integer.parseInt(tblPOS.getValueAt(i, 2).toString());
                price = Double.parseDouble(String.valueOf(tblPOS.getValueAt(i, 3)));
                amount = Double.parseDouble(String.valueOf(tblPOS.getValueAt(i, 4)));
                ps.setInt(1, lastid);
                ps.setInt(2, pcode);
                ps.setDouble(3, price);
                ps.setInt(4, qty);
                ps.setDouble(5, amount);
                ps.executeUpdate();
            }
            
            String sql2 = "UPDATE product SET quantity = quantity - ? where pcode=?";
            ps = con.prepareStatement(sql2);
            for(int i = 0; i < tblPOS.getRowCount(); i++){
                pcode = Integer.parseInt(tblPOS.getValueAt(i, 0).toString());
                qty = Integer.parseInt(tblPOS.getValueAt(i, 2).toString());
                ps.setInt(1, qty);
                ps.setInt(2, pcode);
                ps.execute();
            }
            ps.addBatch();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void receiptPrint(){
        String pname;
        int qty;
        double price,amount;
        taReceipt.append("*************************************\n");
        taReceipt.append("********THIS IS YOUR RECEIPT*********\n");
        taReceipt.append("*************************************\n\n\n");
        taReceipt.append(String.format("%-17s%-6s%-6s%s%n%n", "Product", "Price", "Qty", "Total"));
        for(int i = 0; i < tblPOS.getRowCount(); i++){
            pname = tblPOS.getValueAt(i, 1).toString();
            qty = Integer.parseInt(tblPOS.getValueAt(i, 2).toString());
            price = Double.parseDouble(String.valueOf(tblPOS.getValueAt(i, 3)));
            amount = Double.parseDouble(String.valueOf(tblPOS.getValueAt(i, 4)));
            
            taReceipt.append(String.format("%-17s%-6s(%s)%-3s%s%n", pname, String.format("%.2f", price), qty, " ", String.format("%.2f", amount)));
            }
        taReceipt.append("\n\n\n\n\n\n");
        double totalamount = Double.parseDouble(tfPOSTotal.getText());
        double cash = Double.parseDouble(tfPOSCash.getText());
        double change = Double.parseDouble(tfPOSChange.getText());
        taReceipt.append(String.format("%-15s%-15s%n", "Total Amount:", totalamount));
        taReceipt.append(String.format("%-15s%-15s%n", "Cash:", cash));
        taReceipt.append(String.format("%-15s%-15s%n", "Change:", change));
        taReceipt.append("\n\n\n\n\n\n       Thank you! Come again!");
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnPOSConfirm;
    private javax.swing.JButton btnPOSPrint;
    private javax.swing.JButton btnPOSRefund;
    private javax.swing.JButton btnPOSVoid;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spPOSPQty;
    private javax.swing.JTextArea taReceipt;
    private javax.swing.JTable tblPOS;
    private javax.swing.JTextField tfPOSAmount;
    private javax.swing.JTextField tfPOSCash;
    private javax.swing.JTextField tfPOSChange;
    private javax.swing.JTextField tfPOSPCode;
    private javax.swing.JTextField tfPOSPName;
    private javax.swing.JTextField tfPOSPPrice;
    private javax.swing.JTextField tfPOSTotal;
    // End of variables declaration//GEN-END:variables
}
