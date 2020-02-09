/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/**
 *
 * @author thishantj
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public homePage() {
        initComponents();
        
        jPanel7.setBackground(new Color(91,146,254,95));
        jPanel8.setBackground(new Color(142,180,255,95));
       
        jPanel10.setBackground(new Color(178,203,255,95));
        jPanel11.setBackground(new Color(142,180,255,95));
        
    }

    public void close()
    {
        WindowEvent closeEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeEvent);
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_staffDetails = new javax.swing.JButton();
        staffDetails = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_progressReport = new javax.swing.JButton();
        progressReport = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        studentDetails = new javax.swing.JLabel();
        btn_studentDetails = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_staffAttendance = new javax.swing.JButton();
        staffAttendance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(246, 246, 246));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 70)); // NOI18N
        jLabel1.setText("Chess Arbiters");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel2.setText("Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 1080, 180));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 180));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setPreferredSize(new java.awt.Dimension(101, 101));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_staffDetails.setBackground(new java.awt.Color(255, 255, 255));
        btn_staffDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_staffDetails.setText("Delete Arbiters");
        btn_staffDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(btn_staffDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 210, 60));

        staffDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-management-100.png"))); // NOI18N
        jPanel7.add(staffDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 370, 110));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setPreferredSize(new java.awt.Dimension(101, 101));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_progressReport.setBackground(new java.awt.Color(255, 255, 255));
        btn_progressReport.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_progressReport.setText("Search Arbiters");
        btn_progressReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(btn_progressReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 210, 60));

        progressReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-business-report-100.png"))); // NOI18N
        jPanel8.add(progressReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 370, 100));

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel10.setToolTipText("");
        jPanel10.setPreferredSize(new java.awt.Dimension(101, 101));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-student-male-100.png"))); // NOI18N
        jPanel10.add(studentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 70));

        btn_studentDetails.setBackground(new java.awt.Color(255, 255, 255));
        btn_studentDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_studentDetails.setText("Add Arbiters");
        btn_studentDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_studentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentDetailsActionPerformed(evt);
            }
        });
        jPanel10.add(btn_studentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 210, 60));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 370, 110));

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel11.setPreferredSize(new java.awt.Dimension(101, 101));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_staffAttendance.setBackground(new java.awt.Color(255, 255, 255));
        btn_staffAttendance.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_staffAttendance.setText("Update Arbiters");
        btn_staffAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_staffAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffAttendanceActionPerformed(evt);
            }
        });
        jPanel11.add(btn_staffAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 210, 60));

        staffAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-classroom-100.png"))); // NOI18N
        jPanel11.add(staffAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 80));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 370, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot (72).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1080, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1080, 540));

        setSize(new java.awt.Dimension(1098, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_studentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentDetailsActionPerformed
        
        close();

        AddArbiter std = new AddArbiter();
        std.setVisible(true);
    }//GEN-LAST:event_btn_studentDetailsActionPerformed

    private void btn_staffAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffAttendanceActionPerformed
        // TODO add your handling code here:
        EditArbiters updatestd = new EditArbiters();
        updatestd.setVisible(true);
    }//GEN-LAST:event_btn_staffAttendanceActionPerformed
private void btn_btn_staffDetailsActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        close();

        DeleteArbiter deletestd = new DeleteArbiter();
        deletestd.setVisible(true);
}
private void btn_btn_progressReportActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        close();

        SearchArbiters searchlsn = new SearchArbiters();
        searchlsn.setVisible(true);
    } 
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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_progressReport;
    private javax.swing.JButton btn_staffAttendance;
    private javax.swing.JButton btn_staffDetails;
    private javax.swing.JButton btn_studentDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel progressReport;
    private javax.swing.JLabel staffAttendance;
    private javax.swing.JLabel staffDetails;
    private javax.swing.JLabel studentDetails;
    // End of variables declaration//GEN-END:variables
}
