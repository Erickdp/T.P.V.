/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.view;

import com.storage.control.MyException;
import com.storage.control.ProductTrs;
import com.storage.model.Product;
import java.awt.Frame;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Díaz
 */
public class frmProducts extends javax.swing.JFrame {
    
    private final ProductTrs ptrs = new ProductTrs();
    private List<Product> products = ptrs.read();
    
    private void loadTable() {
        Object[] columns = {"Code", "Product", "Price", "Stock"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (Product p : products) {
            if (p.isStock()) {
                Object[] rows = {p.getCode(), p.getNameProduct(), p.getPrice(), "Yes"};
                model.addRow(rows);
            } else {
                Object[] rows = {p.getCode(), p.getNameProduct(), p.getPrice(), "No"};
                model.addRow(rows);
            }
        }
        this.rSTableMetro1.setModel(model);
    }

    /**
     * Creates new form frmProducts
     */
    public frmProducts() {
        initComponents();
        setLocationRelativeTo(this);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jCode = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jNameP = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPrice = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jStock = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        rSButtonRiple4 = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Products");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 51, 77));
        jPanel2.setPreferredSize(new java.awt.Dimension(990, 30));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButton1.setBackground(new java.awt.Color(25, 51, 77));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/back.png"))); // NOI18N
        rSButton1.setColorHover(new java.awt.Color(255, 255, 255));
        rSButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButton1MouseExited(evt);
            }
        });
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        rSButton2.setBackground(new java.awt.Color(25, 51, 77));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/exit.png"))); // NOI18N
        rSButton2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButton2MouseExited(evt);
            }
        });
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 30, 30));

        rSButton3.setBackground(new java.awt.Color(25, 51, 77));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/minus.png"))); // NOI18N
        rSButton3.setColorHover(new java.awt.Color(255, 255, 255));
        rSButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButton3MouseExited(evt);
            }
        });
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 30));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(25, 51, 77));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setMultipleSeleccion(false);
        rSTableMetro1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 680, 490));

        jLabel1.setText("Code:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jCode.setBackground(new java.awt.Color(255, 255, 255));
        jCode.setForeground(new java.awt.Color(102, 102, 102));
        jCode.setText("Optional when you add..");
        jCode.setBorder(null);
        jPanel1.add(jCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 10));

        jLabel2.setText("Name Product:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jNameP.setBackground(new java.awt.Color(255, 255, 255));
        jNameP.setForeground(new java.awt.Color(102, 102, 102));
        jNameP.setBorder(null);
        jPanel1.add(jNameP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 160, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, 10));

        jLabel3.setText("Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jPrice.setBackground(new java.awt.Color(255, 255, 255));
        jPrice.setForeground(new java.awt.Color(102, 102, 102));
        jPrice.setBorder(null);
        jPanel1.add(jPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, 10));

        jLabel4.setText("Stock:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jStock.setBackground(new java.awt.Color(255, 255, 255));
        jStock.setForeground(new java.awt.Color(102, 102, 102));
        jStock.setText("Optional when you add..");
        jStock.setBorder(null);
        jPanel1.add(jStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 160, 10));

        rSButtonRiple2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/addC.png"))); // NOI18N
        rSButtonRiple2.setText("Add");
        rSButtonRiple2.setColorHover(new java.awt.Color(25, 51, 77));
        rSButtonRiple2.setColorText(new java.awt.Color(25, 51, 77));
        rSButtonRiple2.setIconTextGap(30);
        rSButtonRiple2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple2MouseExited(evt);
            }
        });
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, -1));

        rSButtonRiple3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/delete2.png"))); // NOI18N
        rSButtonRiple3.setText("Delete");
        rSButtonRiple3.setColorHover(new java.awt.Color(25, 51, 77));
        rSButtonRiple3.setColorText(new java.awt.Color(25, 51, 77));
        rSButtonRiple3.setIconTextGap(30);
        rSButtonRiple3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple3MouseExited(evt);
            }
        });
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 170, -1));

        rSButtonRiple4.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/up2.png"))); // NOI18N
        rSButtonRiple4.setText("Update");
        rSButtonRiple4.setColorHover(new java.awt.Color(25, 51, 77));
        rSButtonRiple4.setColorText(new java.awt.Color(25, 51, 77));
        rSButtonRiple4.setIconTextGap(30);
        rSButtonRiple4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple4MouseExited(evt);
            }
        });
        rSButtonRiple4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 170, -1));

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

    private void rSButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton1MouseEntered
        // TODO add your handling code here:
        rSButton1.setIcon(new ImageIcon("img\\back2.png"));
    }//GEN-LAST:event_rSButton1MouseEntered

    private void rSButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton1MouseExited
        // TODO add your handling code here:
        rSButton1.setIcon(new ImageIcon("img\\back.png"));
    }//GEN-LAST:event_rSButton1MouseExited

    private void rSButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton2MouseEntered
        // TODO add your handling code here:
        rSButton2.setIcon(new ImageIcon("img\\close2.png"));
    }//GEN-LAST:event_rSButton2MouseEntered

    private void rSButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton2MouseExited
        // TODO add your handling code here:
        rSButton2.setIcon(new ImageIcon("img\\exit.png"));
    }//GEN-LAST:event_rSButton2MouseExited

    private void rSButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton3MouseEntered
        // TODO add your handling code here:
        rSButton3.setIcon(new ImageIcon("img\\min2.png"));
    }//GEN-LAST:event_rSButton3MouseEntered

    private void rSButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton3MouseExited
        // TODO add your handling code here:
        rSButton3.setIcon(new ImageIcon("img\\minus.png"));
    }//GEN-LAST:event_rSButton3MouseExited

    private void rSButtonRiple2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple2MouseExited
        // TODO add your handling code here:
        rSButtonRiple2.setIcon(new ImageIcon("img\\addC.png"));
    }//GEN-LAST:event_rSButtonRiple2MouseExited

    private void rSButtonRiple3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple3MouseExited
        // TODO add your handling code here:
        rSButtonRiple3.setIcon(new ImageIcon("img\\delete2.png"));
    }//GEN-LAST:event_rSButtonRiple3MouseExited

    private void rSButtonRiple4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple4MouseExited
        // TODO add your handling code here:
        rSButtonRiple4.setIcon(new ImageIcon("img\\up2.png"));
    }//GEN-LAST:event_rSButtonRiple4MouseExited

    private void rSButtonRiple2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple2MouseEntered
        // TODO add your handling code here:
        rSButtonRiple2.setIcon(new ImageIcon("img\\addC2.png"));
    }//GEN-LAST:event_rSButtonRiple2MouseEntered

    private void rSButtonRiple4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple4MouseEntered
        // TODO add your handling code here:
        rSButtonRiple4.setIcon(new ImageIcon("img\\up.png"));
    }//GEN-LAST:event_rSButtonRiple4MouseEntered

    private void rSButtonRiple3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple3MouseEntered
        // TODO add your handling code here:
        rSButtonRiple3.setIcon(new ImageIcon("img\\delete.png"));
    }//GEN-LAST:event_rSButtonRiple3MouseEntered

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        // TODO add your handling code here:
        if (!(jNameP.getText().isEmpty() | jPrice.getText().isEmpty())) {
            try {
                ptrs.create(new Product(jNameP.getText(), Double.parseDouble(jPrice.getText())));
                jNameP.setText(null);
                jPrice.setText(null);
                jStock.setText(null);
                jCode.setText(null);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, true, ex.getMessage()).setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "Please, complete fields.").setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void rSButtonRiple4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple4ActionPerformed
        // TODO add your handling code here:
        if (!(jCode.getText().isEmpty() | jNameP.getText().isEmpty() | jPrice.getText().isEmpty())) {
            try {
                Product p = ptrs.searchProductByCode(jCode.getText());
                p.setNameProduct(jNameP.getText());
                p.setPrice(Double.parseDouble(jPrice.getText()));
                p.setStock(true);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, true, ex.getMessage()).setVisible(true);
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "To update fill in the fields of: code, name and price").setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple4ActionPerformed

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        // TODO add your handling code here:
        if (!jCode.getText().isEmpty()) {
            try {
                ptrs.delete(ptrs.searchProductByCode(jCode.getText()));
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, true, ex.getMessage()).setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "Enter the product code to remove.").setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAdmin().setVisible(true);
    }//GEN-LAST:event_rSButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jNameP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jStock;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSButtonRiple rSButtonRiple4;
    private rojerusan.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
