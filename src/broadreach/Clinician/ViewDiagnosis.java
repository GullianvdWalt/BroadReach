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
 * This Is The Diagnosis View
 * 
 * 
 */
package broadreach.Clinician;

public class ViewDiagnosis extends javax.swing.JFrame {

    /**
     * Creates new form ViewDiagnosis
     */
    public ViewDiagnosis() {
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

        diagnosisViewPanel = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        headSubPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        headSubPanel2 = new javax.swing.JPanel();
        diagnosisIcon = new javax.swing.JLabel();
        diagnosisViewLbl = new javax.swing.JLabel();
        subheadingLbl = new javax.swing.JLabel();
        headSubPanel3 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        subBodyPanel = new javax.swing.JPanel();
        filterPanel = new javax.swing.JPanel();
        filterIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pNameTxtFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateTxtFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labIDTxtFld = new javax.swing.JTextField();
        pastTestDBPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testResultTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroadReach - View Diagnosis");
        setName("viewDiagnosisFrame"); // NOI18N

        diagnosisViewPanel.setBackground(new java.awt.Color(255, 255, 255));
        diagnosisViewPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        diagnosisViewPanel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        diagnosisViewPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));

        headPanel.setBackground(new java.awt.Color(0, 46, 93));
        headPanel.setMaximumSize(new java.awt.Dimension(1920, 227));
        headPanel.setMinimumSize(new java.awt.Dimension(1440, 227));
        headPanel.setPreferredSize(new java.awt.Dimension(1920, 225));
        headPanel.setLayout(new java.awt.GridLayout(1, 1));

        headSubPanel1.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel1.setPreferredSize(new java.awt.Dimension(640, 227));

        homeBtn.setBackground(new java.awt.Color(0, 46, 93));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeBtn.setBorderPainted(false);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headSubPanel1Layout = new javax.swing.GroupLayout(headSubPanel1);
        headSubPanel1.setLayout(headSubPanel1Layout);
        headSubPanel1Layout.setHorizontalGroup(
            headSubPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        headSubPanel1Layout.setVerticalGroup(
            headSubPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(homeBtn)
                .addContainerGap())
        );

        headPanel.add(headSubPanel1);

        headSubPanel2.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel2.setPreferredSize(new java.awt.Dimension(640, 227));

        diagnosisIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diagnosis.png"))); // NOI18N

        diagnosisViewLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        diagnosisViewLbl.setForeground(new java.awt.Color(255, 255, 255));
        diagnosisViewLbl.setText("Past Diagnosis");
        diagnosisViewLbl.setToolTipText("");
        diagnosisViewLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        subheadingLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        subheadingLbl.setForeground(new java.awt.Color(255, 255, 255));
        subheadingLbl.setText("BroadReach Clinic");
        subheadingLbl.setToolTipText("");
        subheadingLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout headSubPanel2Layout = new javax.swing.GroupLayout(headSubPanel2);
        headSubPanel2.setLayout(headSubPanel2Layout);
        headSubPanel2Layout.setHorizontalGroup(
            headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel2Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headSubPanel2Layout.createSequentialGroup()
                        .addComponent(diagnosisIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diagnosisViewLbl))
                    .addComponent(subheadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );
        headSubPanel2Layout.setVerticalGroup(
            headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(subheadingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(diagnosisViewLbl)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(diagnosisIcon)
                        .addContainerGap())))
        );

        headPanel.add(headSubPanel2);

        headSubPanel3.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel3.setPreferredSize(new java.awt.Dimension(640, 227));

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

        javax.swing.GroupLayout headSubPanel3Layout = new javax.swing.GroupLayout(headSubPanel3);
        headSubPanel3.setLayout(headSubPanel3Layout);
        headSubPanel3Layout.setHorizontalGroup(
            headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                .addContainerGap(533, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headSubPanel3Layout.setVerticalGroup(
            headSubPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel3Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        headPanel.add(headSubPanel3);

        diagnosisViewPanel.add(headPanel);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setForeground(new java.awt.Color(0, 46, 93));
        bodyPanel.setMinimumSize(new java.awt.Dimension(1920, 853));
        bodyPanel.setPreferredSize(new java.awt.Dimension(1920, 853));

        subBodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        subBodyPanel.setMinimumSize(new java.awt.Dimension(900, 853));
        subBodyPanel.setPreferredSize(new java.awt.Dimension(1650, 750));

        filterPanel.setBackground(new java.awt.Color(255, 255, 255));
        filterPanel.setPreferredSize(new java.awt.Dimension(1625, 160));
        filterPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 60, 5));

        filterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filter.png"))); // NOI18N
        filterIcon.setToolTipText("Filter Tests");
        filterPanel.add(filterIcon);

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 46, 93));
        jLabel1.setText("Patient Name:");
        filterPanel.add(jLabel1);

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

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 46, 93));
        jLabel2.setText("Date:");
        filterPanel.add(jLabel2);

        dateTxtFld.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dateTxtFld.setToolTipText("");
        dateTxtFld.setActionCommand("<Not Set>");
        dateTxtFld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 46, 93), 2, true));
        dateTxtFld.setPreferredSize(new java.awt.Dimension(232, 45));
        dateTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtFldActionPerformed(evt);
            }
        });
        filterPanel.add(dateTxtFld);

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 46, 93));
        jLabel3.setText("Lab ID:");
        filterPanel.add(jLabel3);

        labIDTxtFld.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labIDTxtFld.setToolTipText("");
        labIDTxtFld.setActionCommand("<Not Set>");
        labIDTxtFld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 46, 93), 2, true));
        labIDTxtFld.setPreferredSize(new java.awt.Dimension(232, 45));
        labIDTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labIDTxtFldActionPerformed(evt);
            }
        });
        filterPanel.add(labIDTxtFld);

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        subBodyPanel.add(pastTestDBPane);

        bodyPanel.add(subBodyPanel);

        diagnosisViewPanel.add(bodyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(diagnosisViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(diagnosisViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new ClinicianHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void pNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameTxtFldActionPerformed

        if(pNameTxtFld.isCursorSet()){
            pNameTxtFld.setText("");
        }
    }//GEN-LAST:event_pNameTxtFldActionPerformed

    private void dateTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtFldActionPerformed

    private void labIDTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labIDTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labIDTxtFldActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDiagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JTextField dateTxtFld;
    private javax.swing.JLabel diagnosisIcon;
    private javax.swing.JLabel diagnosisViewLbl;
    private javax.swing.JPanel diagnosisViewPanel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel filterIcon;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel headSubPanel1;
    private javax.swing.JPanel headSubPanel2;
    private javax.swing.JPanel headSubPanel3;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField labIDTxtFld;
    private javax.swing.JTextField pNameTxtFld;
    private javax.swing.JPanel pastTestDBPane;
    private javax.swing.JPanel subBodyPanel;
    private javax.swing.JLabel subheadingLbl;
    private javax.swing.JTable testResultTbl;
    // End of variables declaration//GEN-END:variables
}
