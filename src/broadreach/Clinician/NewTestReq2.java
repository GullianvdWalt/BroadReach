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
 * This Is The New Test Request View
 * 
 * 
 */
package broadreach.Clinician;


public class NewTestReq2 extends javax.swing.JFrame {

    /**
     * Creates new form NewTestReq2
     */
    public NewTestReq2() {
        initComponents();
        setExtendedState(getExtendedState() | ClinicianHome.MAXIMIZED_BOTH );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testReqPanel2 = new javax.swing.JPanel();
        headPanel3 = new javax.swing.JPanel();
        headSubPanel4 = new javax.swing.JPanel();
        backBtn3 = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        headSubPanel5 = new javax.swing.JPanel();
        clinicianIconLbl = new javax.swing.JLabel();
        testReqLbl2 = new javax.swing.JLabel();
        subheadingLbl = new javax.swing.JLabel();
        headSubPanel6 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        subBodyPanel = new javax.swing.JPanel();
        filterPanel = new javax.swing.JPanel();
        exmIcon = new javax.swing.JLabel();
        selectPatientLbl = new javax.swing.JLabel();
        filterIcon = new javax.swing.JLabel();
        pNameLbl = new javax.swing.JLabel();
        pNameTxtFld = new javax.swing.JTextField();
        pastTestDBPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testResultTbl = new javax.swing.JTable();
        nextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroadReach - Test Request");
        setName("testReqFrame2"); // NOI18N

        testReqPanel2.setBackground(new java.awt.Color(255, 255, 255));
        testReqPanel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        testReqPanel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        testReqPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));

        headPanel3.setBackground(new java.awt.Color(0, 46, 93));
        headPanel3.setMaximumSize(new java.awt.Dimension(1920, 227));
        headPanel3.setMinimumSize(new java.awt.Dimension(1440, 227));
        headPanel3.setPreferredSize(new java.awt.Dimension(1920, 225));
        headPanel3.setLayout(new java.awt.GridLayout(1, 1));

        headSubPanel4.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel4.setPreferredSize(new java.awt.Dimension(640, 227));

        backBtn3.setBackground(new java.awt.Color(0, 46, 93));
        backBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        backBtn3.setToolTipText("Exit BroadReach");
        backBtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn3.setBorderPainted(false);
        backBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn3.setDefaultCapable(false);
        backBtn3.setPreferredSize(new java.awt.Dimension(97, 97));
        backBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn3ActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(0, 46, 93));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeBtn.setBorderPainted(false);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headSubPanel4Layout = new javax.swing.GroupLayout(headSubPanel4);
        headSubPanel4.setLayout(headSubPanel4Layout);
        headSubPanel4Layout.setHorizontalGroup(
            headSubPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        headSubPanel4Layout.setVerticalGroup(
            headSubPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel4Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(headSubPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeBtn)
                    .addComponent(backBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        headPanel3.add(headSubPanel4);

        headSubPanel5.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel5.setPreferredSize(new java.awt.Dimension(640, 227));

        clinicianIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lab_Logo.png"))); // NOI18N

        testReqLbl2.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        testReqLbl2.setForeground(new java.awt.Color(255, 255, 255));
        testReqLbl2.setText("Test Request");
        testReqLbl2.setToolTipText("");
        testReqLbl2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        subheadingLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        subheadingLbl.setForeground(new java.awt.Color(255, 255, 255));
        subheadingLbl.setText("BroadReach Clinic");
        subheadingLbl.setToolTipText("");
        subheadingLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout headSubPanel5Layout = new javax.swing.GroupLayout(headSubPanel5);
        headSubPanel5.setLayout(headSubPanel5Layout);
        headSubPanel5Layout.setHorizontalGroup(
            headSubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel5Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(headSubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel5Layout.createSequentialGroup()
                        .addComponent(clinicianIconLbl)
                        .addGap(18, 18, 18)
                        .addComponent(testReqLbl2)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel5Layout.createSequentialGroup()
                        .addComponent(subheadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        headSubPanel5Layout.setVerticalGroup(
            headSubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(subheadingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(headSubPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel5Layout.createSequentialGroup()
                        .addComponent(testReqLbl2)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel5Layout.createSequentialGroup()
                        .addComponent(clinicianIconLbl)
                        .addContainerGap())))
        );

        headPanel3.add(headSubPanel5);

        headSubPanel6.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel6.setPreferredSize(new java.awt.Dimension(640, 227));

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

        javax.swing.GroupLayout headSubPanel6Layout = new javax.swing.GroupLayout(headSubPanel6);
        headSubPanel6.setLayout(headSubPanel6Layout);
        headSubPanel6Layout.setHorizontalGroup(
            headSubPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel6Layout.createSequentialGroup()
                .addContainerGap(533, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headSubPanel6Layout.setVerticalGroup(
            headSubPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel6Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        headPanel3.add(headSubPanel6);

        testReqPanel2.add(headPanel3);

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

        exmIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exam_Logo.png"))); // NOI18N
        exmIcon.setToolTipText("Filter Tests");
        filterPanel.add(exmIcon);

        selectPatientLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        selectPatientLbl.setForeground(new java.awt.Color(0, 46, 93));
        selectPatientLbl.setText("Select Examination");
        selectPatientLbl.setPreferredSize(new java.awt.Dimension(300, 30));
        filterPanel.add(selectPatientLbl);

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

        testResultTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(testResultTbl);

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

        testReqPanel2.add(bodyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(testReqPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(testReqPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn3ActionPerformed
        new NewTestReq().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtn3ActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new ClinicianHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void pNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameTxtFldActionPerformed
    //Next Button
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewTestReq2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTestReq2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTestReq2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTestReq2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTestReq2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn3;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel clinicianIconLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel exmIcon;
    private javax.swing.JLabel filterIcon;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JPanel headPanel3;
    private javax.swing.JPanel headSubPanel4;
    private javax.swing.JPanel headSubPanel5;
    private javax.swing.JPanel headSubPanel6;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel pNameLbl;
    private javax.swing.JTextField pNameTxtFld;
    private javax.swing.JPanel pastTestDBPane;
    private javax.swing.JLabel selectPatientLbl;
    private javax.swing.JPanel subBodyPanel;
    private javax.swing.JLabel subheadingLbl;
    private javax.swing.JLabel testReqLbl2;
    private javax.swing.JPanel testReqPanel2;
    private javax.swing.JTable testResultTbl;
    // End of variables declaration//GEN-END:variables
}
