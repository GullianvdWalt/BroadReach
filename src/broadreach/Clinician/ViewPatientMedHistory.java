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
 * This Is The Patient Medical History View
 * 
 * 
 */
package broadreach.Clinician;

public class ViewPatientMedHistory extends javax.swing.JFrame {

    /**
     * Creates new form ViewPatientMedHistory
     */
    public ViewPatientMedHistory() {
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

        patientMedHistPanel = new javax.swing.JPanel();
        headPanel1 = new javax.swing.JPanel();
        headSubPanel2 = new javax.swing.JPanel();
        homeBtnDiagnosis1 = new javax.swing.JButton();
        headSubPanel3 = new javax.swing.JPanel();
        medHistoryIcon = new javax.swing.JLabel();
        patientMedHistoryLbl = new javax.swing.JLabel();
        subheadingLbl = new javax.swing.JLabel();
        headSubPanel4 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        subBodyPanel = new javax.swing.JPanel();
        filterPanel = new javax.swing.JPanel();
        filterIcon = new javax.swing.JLabel();
        pNameLbl = new javax.swing.JLabel();
        pNameTxtFld = new javax.swing.JTextField();
        pSurnameLbl = new javax.swing.JLabel();
        pSurnameTxtFld = new javax.swing.JTextField();
        saIDLbl = new javax.swing.JLabel();
        saIDTxtFld = new javax.swing.JTextField();
        pastTestDBPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientMedHistTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroadReach - Patient Medical History");
        setName("patientMedHistoryFrame"); // NOI18N

        patientMedHistPanel.setBackground(new java.awt.Color(255, 255, 255));
        patientMedHistPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        patientMedHistPanel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        patientMedHistPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));

        headPanel1.setBackground(new java.awt.Color(0, 46, 93));
        headPanel1.setMaximumSize(new java.awt.Dimension(1920, 227));
        headPanel1.setMinimumSize(new java.awt.Dimension(1440, 227));
        headPanel1.setPreferredSize(new java.awt.Dimension(1920, 225));
        headPanel1.setLayout(new java.awt.GridLayout(1, 1));

        headSubPanel2.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel2.setPreferredSize(new java.awt.Dimension(640, 227));

        homeBtnDiagnosis1.setBackground(new java.awt.Color(0, 46, 93));
        homeBtnDiagnosis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeBtnDiagnosis1.setBorderPainted(false);
        homeBtnDiagnosis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtnDiagnosis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnDiagnosis1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headSubPanel2Layout = new javax.swing.GroupLayout(headSubPanel2);
        headSubPanel2.setLayout(headSubPanel2Layout);
        headSubPanel2Layout.setHorizontalGroup(
            headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBtnDiagnosis1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        headSubPanel2Layout.setVerticalGroup(
            headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(homeBtnDiagnosis1)
                .addContainerGap())
        );

        headPanel1.add(headSubPanel2);

        headSubPanel3.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel3.setPreferredSize(new java.awt.Dimension(640, 227));

        medHistoryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clinic_Logo.png"))); // NOI18N

        patientMedHistoryLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        patientMedHistoryLbl.setForeground(new java.awt.Color(255, 255, 255));
        patientMedHistoryLbl.setText("Patient Medical History");
        patientMedHistoryLbl.setToolTipText("");
        patientMedHistoryLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(medHistoryIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientMedHistoryLbl)
                    .addComponent(subheadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        headSubPanel3Layout.setVerticalGroup(
            headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(subheadingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                        .addComponent(medHistoryIcon)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                        .addComponent(patientMedHistoryLbl)
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

        patientMedHistPanel.add(headPanel1);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setForeground(new java.awt.Color(0, 46, 93));
        bodyPanel.setMinimumSize(new java.awt.Dimension(1920, 853));
        bodyPanel.setPreferredSize(new java.awt.Dimension(1920, 853));

        subBodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        subBodyPanel.setMinimumSize(new java.awt.Dimension(900, 853));
        subBodyPanel.setPreferredSize(new java.awt.Dimension(1650, 750));

        filterPanel.setBackground(new java.awt.Color(255, 255, 255));
        filterPanel.setPreferredSize(new java.awt.Dimension(1625, 160));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5);
        flowLayout1.setAlignOnBaseline(true);
        filterPanel.setLayout(flowLayout1);

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

        pSurnameLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        pSurnameLbl.setForeground(new java.awt.Color(0, 46, 93));
        pSurnameLbl.setText("Patient Surname:");
        filterPanel.add(pSurnameLbl);

        pSurnameTxtFld.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pSurnameTxtFld.setToolTipText("");
        pSurnameTxtFld.setActionCommand("<Not Set>");
        pSurnameTxtFld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 46, 93), 2, true));
        pSurnameTxtFld.setPreferredSize(new java.awt.Dimension(232, 45));
        pSurnameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pSurnameTxtFldActionPerformed(evt);
            }
        });
        filterPanel.add(pSurnameTxtFld);

        saIDLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        saIDLbl.setForeground(new java.awt.Color(0, 46, 93));
        saIDLbl.setText("SA ID:");
        filterPanel.add(saIDLbl);

        saIDTxtFld.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        saIDTxtFld.setToolTipText("");
        saIDTxtFld.setActionCommand("<Not Set>");
        saIDTxtFld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 46, 93), 2, true));
        saIDTxtFld.setPreferredSize(new java.awt.Dimension(232, 45));
        saIDTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saIDTxtFldActionPerformed(evt);
            }
        });
        filterPanel.add(saIDTxtFld);

        subBodyPanel.add(filterPanel);

        pastTestDBPane.setBackground(new java.awt.Color(255, 255, 255));
        pastTestDBPane.setPreferredSize(new java.awt.Dimension(1625, 570));

        patientMedHistTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(patientMedHistTbl);

        javax.swing.GroupLayout pastTestDBPaneLayout = new javax.swing.GroupLayout(pastTestDBPane);
        pastTestDBPane.setLayout(pastTestDBPaneLayout);
        pastTestDBPaneLayout.setHorizontalGroup(
            pastTestDBPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastTestDBPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1605, Short.MAX_VALUE)
                .addContainerGap())
        );
        pastTestDBPaneLayout.setVerticalGroup(
            pastTestDBPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastTestDBPaneLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );

        subBodyPanel.add(pastTestDBPane);

        bodyPanel.add(subBodyPanel);

        patientMedHistPanel.add(bodyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientMedHistPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientMedHistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Home Button
    private void homeBtnDiagnosis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnDiagnosis1ActionPerformed
        new ClinicianHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnDiagnosis1ActionPerformed

    //Exit Button
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void pNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameTxtFldActionPerformed

    private void pSurnameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pSurnameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pSurnameTxtFldActionPerformed

    private void saIDTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saIDTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saIDTxtFldActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPatientMedHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatientMedHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatientMedHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatientMedHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatientMedHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel filterIcon;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JPanel headPanel1;
    private javax.swing.JPanel headSubPanel2;
    private javax.swing.JPanel headSubPanel3;
    private javax.swing.JPanel headSubPanel4;
    private javax.swing.JButton homeBtnDiagnosis1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medHistoryIcon;
    private javax.swing.JLabel pNameLbl;
    private javax.swing.JTextField pNameTxtFld;
    private javax.swing.JLabel pSurnameLbl;
    private javax.swing.JTextField pSurnameTxtFld;
    private javax.swing.JPanel pastTestDBPane;
    private javax.swing.JPanel patientMedHistPanel;
    private javax.swing.JTable patientMedHistTbl;
    private javax.swing.JLabel patientMedHistoryLbl;
    private javax.swing.JLabel saIDLbl;
    private javax.swing.JTextField saIDTxtFld;
    private javax.swing.JPanel subBodyPanel;
    private javax.swing.JLabel subheadingLbl;
    // End of variables declaration//GEN-END:variables
}
