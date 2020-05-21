/**
 *
 * @author Gullian Van Der Walt 
 * H5G8YT7X3
 * ITDA301 - Project 2020
 * Pearson Pretoria 
 * BSC IT Level 3
 * 
 * 
 * 
 * This Is The New Diagnosis View
 * 
 * 
 */
package broadreach.Clinician;

public class NewDiagnosis2 extends javax.swing.JFrame {

    /**
     * Creates new form NewDiagnosis2
     */
    public NewDiagnosis2() {
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

        newDiagnosisPanel2 = new javax.swing.JPanel();
        headPanel1 = new javax.swing.JPanel();
        headSubPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        homeBtnDiagnosis2 = new javax.swing.JButton();
        headSubPanel3 = new javax.swing.JPanel();
        DiagnosisIcon = new javax.swing.JLabel();
        newDiagnosisLbl = new javax.swing.JLabel();
        subheadingLbl = new javax.swing.JLabel();
        headSubPanel4 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        subBodyPanel = new javax.swing.JPanel();
        filterPanel = new javax.swing.JPanel();
        examIcon = new javax.swing.JLabel();
        selectExamLbl = new javax.swing.JLabel();
        filterIcon = new javax.swing.JLabel();
        pNameLbl = new javax.swing.JLabel();
        pNameTxtFld = new javax.swing.JTextField();
        pastTestDBPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examTable = new javax.swing.JTable();
        nextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroadReach - New Diagnosis");
        setName("newDiagnosisFrame2"); // NOI18N

        newDiagnosisPanel2.setBackground(new java.awt.Color(255, 255, 255));
        newDiagnosisPanel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        newDiagnosisPanel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        newDiagnosisPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));

        headPanel1.setBackground(new java.awt.Color(0, 46, 93));
        headPanel1.setMaximumSize(new java.awt.Dimension(1920, 227));
        headPanel1.setMinimumSize(new java.awt.Dimension(1440, 227));
        headPanel1.setPreferredSize(new java.awt.Dimension(1920, 225));
        headPanel1.setLayout(new java.awt.GridLayout(1, 1));

        headSubPanel2.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel2.setPreferredSize(new java.awt.Dimension(640, 227));

        backBtn.setBackground(new java.awt.Color(0, 46, 93));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        backBtn.setBorderPainted(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        homeBtnDiagnosis2.setBackground(new java.awt.Color(0, 46, 93));
        homeBtnDiagnosis2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeBtnDiagnosis2.setBorderPainted(false);
        homeBtnDiagnosis2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtnDiagnosis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnDiagnosis2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headSubPanel2Layout = new javax.swing.GroupLayout(headSubPanel2);
        headSubPanel2.setLayout(headSubPanel2Layout);
        headSubPanel2Layout.setHorizontalGroup(
            headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(homeBtnDiagnosis2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        headSubPanel2Layout.setVerticalGroup(
            headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeBtnDiagnosis2)
                    .addComponent(backBtn))
                .addContainerGap())
        );

        headPanel1.add(headSubPanel2);

        headSubPanel3.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel3.setPreferredSize(new java.awt.Dimension(640, 227));

        DiagnosisIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diagnosis.png"))); // NOI18N

        newDiagnosisLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        newDiagnosisLbl.setForeground(new java.awt.Color(255, 255, 255));
        newDiagnosisLbl.setText("New Diagnosis");
        newDiagnosisLbl.setToolTipText("");
        newDiagnosisLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        subheadingLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        subheadingLbl.setForeground(new java.awt.Color(255, 255, 255));
        subheadingLbl.setText("BroadReach Clinic");
        subheadingLbl.setToolTipText("");
        subheadingLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout headSubPanel3Layout = new javax.swing.GroupLayout(headSubPanel3);
        headSubPanel3.setLayout(headSubPanel3Layout);
        headSubPanel3Layout.setHorizontalGroup(
            headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel3Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                        .addComponent(DiagnosisIcon)
                        .addGap(18, 18, 18)
                        .addComponent(newDiagnosisLbl)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                        .addComponent(subheadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        headSubPanel3Layout.setVerticalGroup(
            headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(subheadingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                        .addComponent(DiagnosisIcon)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                        .addComponent(newDiagnosisLbl)
                        .addGap(27, 27, 27))))
        );

        headPanel1.add(headSubPanel3);

        headSubPanel4.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel4.setPreferredSize(new java.awt.Dimension(640, 227));

        exitBtn.setBackground(new java.awt.Color(0, 46, 93));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit_icon.png"))); // NOI18N
        exitBtn.setToolTipText("Exit BroadReach");
        exitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.setBorderPainted(false);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setDefaultCapable(false);
        exitBtn.setPreferredSize(new java.awt.Dimension(97, 97));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headSubPanel4Layout = new javax.swing.GroupLayout(headSubPanel4);
        headSubPanel4.setLayout(headSubPanel4Layout);
        headSubPanel4Layout.setHorizontalGroup(
            headSubPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel4Layout.createSequentialGroup()
                .addContainerGap(533, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headSubPanel4Layout.setVerticalGroup(
            headSubPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel4Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        headPanel1.add(headSubPanel4);

        newDiagnosisPanel2.add(headPanel1);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setForeground(new java.awt.Color(0, 46, 93));
        bodyPanel.setMinimumSize(new java.awt.Dimension(1920, 853));
        bodyPanel.setPreferredSize(new java.awt.Dimension(1920, 853));

        subBodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        subBodyPanel.setMinimumSize(new java.awt.Dimension(900, 853));
        subBodyPanel.setPreferredSize(new java.awt.Dimension(1650, 750));

        filterPanel.setBackground(new java.awt.Color(255, 255, 255));
        filterPanel.setPreferredSize(new java.awt.Dimension(1625, 160));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 80, 5);
        flowLayout1.setAlignOnBaseline(true);
        filterPanel.setLayout(flowLayout1);

        examIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exam_Logo.png"))); // NOI18N
        examIcon.setToolTipText("Filter Tests");
        filterPanel.add(examIcon);

        selectExamLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        selectExamLbl.setForeground(new java.awt.Color(0, 46, 93));
        selectExamLbl.setText("Select Examination");
        selectExamLbl.setPreferredSize(new java.awt.Dimension(300, 30));
        filterPanel.add(selectExamLbl);

        filterIcon.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        filterIcon.setForeground(new java.awt.Color(0, 46, 93));
        filterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filter.png"))); // NOI18N
        filterPanel.add(filterIcon);

        pNameLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        pNameLbl.setForeground(new java.awt.Color(0, 46, 93));
        pNameLbl.setText("Patient Name:");
        filterPanel.add(pNameLbl);

        pNameTxtFld.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pNameTxtFld.setToolTipText("");
        pNameTxtFld.setActionCommand("<Not Set>");
        pNameTxtFld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 46, 93), 2, true));
        pNameTxtFld.setPreferredSize(new java.awt.Dimension(232, 45));
        pNameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameTxtFldActionPerformed(evt);
            }
        });
        filterPanel.add(pNameTxtFld);

        subBodyPanel.add(filterPanel);

        pastTestDBPane.setBackground(new java.awt.Color(255, 255, 255));
        pastTestDBPane.setPreferredSize(new java.awt.Dimension(1625, 570));

        examTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        jScrollPane1.setViewportView(examTable);

        nextBtn.setBackground(new java.awt.Color(255, 255, 255));
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        nextBtn.setBorderPainted(false);
        nextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pastTestDBPaneLayout = new javax.swing.GroupLayout(pastTestDBPane);
        pastTestDBPane.setLayout(pastTestDBPaneLayout);
        pastTestDBPaneLayout.setHorizontalGroup(
            pastTestDBPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastTestDBPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pastTestDBPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1605, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pastTestDBPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextBtn)))
                .addContainerGap())
        );
        pastTestDBPaneLayout.setVerticalGroup(
            pastTestDBPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastTestDBPaneLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextBtn))
        );

        subBodyPanel.add(pastTestDBPane);

        bodyPanel.add(subBodyPanel);

        newDiagnosisPanel2.add(bodyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newDiagnosisPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newDiagnosisPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Back Button
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new NewDiagnosis1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    //Exit Button
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void pNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameTxtFldActionPerformed

    //Next Button
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        new NewDiagnosis3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nextBtnActionPerformed

    //Home Button
    private void homeBtnDiagnosis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnDiagnosis2ActionPerformed
        new ClinicianHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnDiagnosis2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewDiagnosis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDiagnosis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDiagnosis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDiagnosis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDiagnosis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiagnosisIcon;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel examIcon;
    private javax.swing.JTable examTable;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel filterIcon;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JPanel headPanel1;
    private javax.swing.JPanel headSubPanel2;
    private javax.swing.JPanel headSubPanel3;
    private javax.swing.JPanel headSubPanel4;
    private javax.swing.JButton homeBtnDiagnosis2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel newDiagnosisLbl;
    private javax.swing.JPanel newDiagnosisPanel2;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel pNameLbl;
    private javax.swing.JTextField pNameTxtFld;
    private javax.swing.JPanel pastTestDBPane;
    private javax.swing.JLabel selectExamLbl;
    private javax.swing.JPanel subBodyPanel;
    private javax.swing.JLabel subheadingLbl;
    // End of variables declaration//GEN-END:variables
}
