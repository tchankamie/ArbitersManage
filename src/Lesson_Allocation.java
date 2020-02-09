
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prabhasha
 */
public class Lesson_Allocation extends javax.swing.JFrame {

    /**
     * Creates new form Lesson_Allocation
     */
    public Lesson_Allocation() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_searchS = new javax.swing.JButton();
        btn_deleteS = new javax.swing.JButton();
        btn_updateS = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lessons = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel3.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Subject Management System");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1024, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Subject");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 260, 210, 60);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-property-80.png"))); // NOI18N
        btn_add.setText("   Add Lesson");
        btn_add.setBorder(null);
        btn_add.setBorderPainted(false);
        btn_add.setContentAreaFilled(false);
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.setFocusPainted(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel11.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 100, 270, 60));

        btn_searchS.setBackground(new java.awt.Color(255, 255, 255));
        btn_searchS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_searchS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-database-80.png"))); // NOI18N
        btn_searchS.setText("   Search Lesson");
        btn_searchS.setBorder(null);
        btn_searchS.setBorderPainted(false);
        btn_searchS.setContentAreaFilled(false);
        btn_searchS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchS.setFocusPainted(false);
        btn_searchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchSActionPerformed(evt);
            }
        });
        jPanel11.add(btn_searchS, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 190, 270, 80));

        btn_deleteS.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-bin-80.png"))); // NOI18N
        btn_deleteS.setText("   Delete Lesson");
        btn_deleteS.setBorder(null);
        btn_deleteS.setBorderPainted(false);
        btn_deleteS.setContentAreaFilled(false);
        btn_deleteS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteS.setFocusPainted(false);
        btn_deleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSActionPerformed(evt);
            }
        });
        jPanel11.add(btn_deleteS, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 310, 250, 80));

        btn_updateS.setBackground(new java.awt.Color(255, 255, 255));
        btn_updateS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_updateS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-left-rotation.png"))); // NOI18N
        btn_updateS.setText("   Update Lesson");
        btn_updateS.setBorder(null);
        btn_updateS.setBorderPainted(false);
        btn_updateS.setContentAreaFilled(false);
        btn_updateS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updateS.setFocusPainted(false);
        btn_updateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateSActionPerformed(evt);
            }
        });
        jPanel11.add(btn_updateS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 60));

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-80.png"))); // NOI18N
        btn_exit.setText("        Exit");
        btn_exit.setBorder(null);
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.setFocusPainted(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel11.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 510, 220, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-50.png"))); // NOI18N
        jLabel3.setText("      Home");
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 70));

        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 60, 250, 690);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(580, 270, 270, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Term");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Term 1", "Term 2", "Term 3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Class");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Olu", "Nelum", "Manel", "Rose" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(270, 110, 710, 93);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1643, 150, 452, 402);

        jScrollPane3.setAlignmentX(2.0F);
        jScrollPane3.setAlignmentY(2.0F);

        Lessons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lessons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lessons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "SUBJECTS"
            }
        ));
        Lessons.setAlignmentX(2.0F);
        Lessons.setAlignmentY(2.0F);
        Lessons.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Lessons.setRowHeight(20);
        jScrollPane3.setViewportView(Lessons);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(300, 390, 700, 250);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryFormatFactoryprescl~1.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(1024, 720));
        jLabel5.setMinimumSize(new java.awt.Dimension(1024, 720));
        jLabel5.setPreferredSize(new java.awt.Dimension(1024, 720));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 70, 820, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void close()
    {
        WindowEvent closeEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeEvent);
    } 
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        close();

        AddArbiter std = new  AddArbiter ();
        std.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_searchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchSActionPerformed

        close();


       SearchArbiters searchlsn = new SearchArbiters();
       searchlsn.setVisible(true);
    }//GEN-LAST:event_btn_searchSActionPerformed

    private void btn_deleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSActionPerformed

        close();

        DeleteArbiter deletestd = new  DeleteArbiter();
        deletestd.setVisible(true);
    }//GEN-LAST:event_btn_deleteSActionPerformed

    private void btn_updateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateSActionPerformed

        close();

       EditArbiters updatestd = new EditArbiters();
        updatestd.setVisible(true);
    }//GEN-LAST:event_btn_updateSActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed

        int returnValue = 0;
        returnValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Are you sure?", JOptionPane.YES_NO_OPTION);

        if (returnValue == JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Lesson_Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lesson_Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lesson_Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lesson_Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lesson_Allocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Lessons;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_deleteS;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_searchS;
    private javax.swing.JButton btn_updateS;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
