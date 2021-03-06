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

public class NewDiagnosis3 extends javax.swing.JFrame {

    /**
     * Creates new form NewDiagnosis3
     */
    public NewDiagnosis3() {
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

        newDiagnosisPanel3 = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        headSubPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        headSubPanel2 = new javax.swing.JPanel();
        diagnosisIcon2 = new javax.swing.JLabel();
        diagnosisHeadLbl = new javax.swing.JLabel();
        subheadingLbl = new javax.swing.JLabel();
        headSubPanel3 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        subBodyPanel = new javax.swing.JPanel();
        diagnosisLbl = new javax.swing.JLabel();
        dateFTxtFld = new javax.swing.JTextField();
        clinicianIDLbl1 = new javax.swing.JLabel();
        timeTxtFld = new javax.swing.JTextField();
        diagnosisTxtFld = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        patientIDLbl1 = new javax.swing.JLabel();
        testRTblLbl = new javax.swing.JLabel();
        exmaIDLbl = new javax.swing.JLabel();
        dateTxtFld1 = new javax.swing.JTextField();
        timeLbl = new javax.swing.JLabel();
        examTxtFld1 = new javax.swing.JTextField();
        patientIDTxtFld1 = new javax.swing.JTextField();
        clinicianIDTxtFld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        testResultTbl = new javax.swing.JTable();
        testRIDLbl1 = new javax.swing.JLabel();
        testRIcon = new javax.swing.JLabel();
        filterICon = new javax.swing.JLabel();
        dateFLbl3 = new javax.swing.JLabel();
        testRIDTxtFld1 = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroadReach - New Diagnosis");
        setName("newDiagnosisFrame3"); // NOI18N

        newDiagnosisPanel3.setBackground(new java.awt.Color(255, 255, 255));
        newDiagnosisPanel3.setMaximumSize(new java.awt.Dimension(1920, 1080));
        newDiagnosisPanel3.setMinimumSize(new java.awt.Dimension(1920, 1080));
        newDiagnosisPanel3.setPreferredSize(new java.awt.Dimension(1920, 1080));

        headPanel.setBackground(new java.awt.Color(0, 46, 93));
        headPanel.setMaximumSize(new java.awt.Dimension(1920, 227));
        headPanel.setMinimumSize(new java.awt.Dimension(1440, 227));
        headPanel.setPreferredSize(new java.awt.Dimension(1920, 225));
        headPanel.setLayout(new java.awt.GridLayout(1, 1));

        headSubPanel1.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel1.setPreferredSize(new java.awt.Dimension(640, 227));

        backBtn.setBackground(new java.awt.Color(0, 46, 93));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        backBtn.setToolTipText("Exit BroadReach");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setDefaultCapable(false);
        backBtn.setPreferredSize(new java.awt.Dimension(97, 97));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headSubPanel1Layout = new javax.swing.GroupLayout(headSubPanel1);
        headSubPanel1.setLayout(headSubPanel1Layout);
        headSubPanel1Layout.setHorizontalGroup(
            headSubPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        headSubPanel1Layout.setVerticalGroup(
            headSubPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        headPanel.add(headSubPanel1);

        headSubPanel2.setBackground(new java.awt.Color(0, 46, 93));
        headSubPanel2.setPreferredSize(new java.awt.Dimension(640, 227));

        diagnosisIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diagnosis.png"))); // NOI18N

        diagnosisHeadLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        diagnosisHeadLbl.setForeground(new java.awt.Color(255, 255, 255));
        diagnosisHeadLbl.setText("New Diagnosis");
        diagnosisHeadLbl.setToolTipText("");
        diagnosisHeadLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(diagnosisIcon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diagnosisHeadLbl)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(subheadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        headSubPanel2Layout.setVerticalGroup(
            headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headSubPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(subheadingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(diagnosisHeadLbl)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(diagnosisIcon2)
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

        newDiagnosisPanel3.add(headPanel);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setForeground(new java.awt.Color(0, 46, 93));
        bodyPanel.setMinimumSize(new java.awt.Dimension(1920, 853));
        bodyPanel.setPreferredSize(new java.awt.Dimension(1920, 853));
        bodyPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 30));

        subBodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        subBodyPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 46, 93), 2, true));
        subBodyPanel.setMinimumSize(new java.awt.Dimension(1200, 853));
        subBodyPanel.setPreferredSize(new java.awt.Dimension(1600, 550));
        subBodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diagnosisLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        diagnosisLbl.setForeground(new java.awt.Color(0, 46, 93));
        diagnosisLbl.setText("Diagnosis:");
        diagnosisLbl.setToolTipText("");
        subBodyPanel.add(diagnosisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 320, -1, -1));

        dateFTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateFTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        dateFTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(dateFTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 160, -1));

        clinicianIDLbl1.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        clinicianIDLbl1.setForeground(new java.awt.Color(0, 46, 93));
        clinicianIDLbl1.setText("Clinician ID:");
        clinicianIDLbl1.setToolTipText("");
        subBodyPanel.add(clinicianIDLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        timeTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timeTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        timeTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(timeTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 200, -1, -1));

        diagnosisTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        diagnosisTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        diagnosisTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(diagnosisTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 350, -1, -1));

        dateLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        dateLbl.setForeground(new java.awt.Color(0, 46, 93));
        dateLbl.setText("Date:");
        dateLbl.setToolTipText("");
        subBodyPanel.add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 40, -1, -1));

        patientIDLbl1.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        patientIDLbl1.setForeground(new java.awt.Color(0, 46, 93));
        patientIDLbl1.setText("Patient ID:");
        patientIDLbl1.setToolTipText("");
        subBodyPanel.add(patientIDLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, -1, -1));

        testRTblLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        testRTblLbl.setForeground(new java.awt.Color(0, 46, 93));
        testRTblLbl.setText("Test Results");
        testRTblLbl.setToolTipText("");
        subBodyPanel.add(testRTblLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        exmaIDLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        exmaIDLbl.setForeground(new java.awt.Color(0, 46, 93));
        exmaIDLbl.setText("Exam ID:");
        exmaIDLbl.setToolTipText("");
        subBodyPanel.add(exmaIDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, -1, -1));

        dateTxtFld1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateTxtFld1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        dateTxtFld1.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(dateTxtFld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 80, -1, -1));

        timeLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        timeLbl.setForeground(new java.awt.Color(0, 46, 93));
        timeLbl.setText("Time:");
        timeLbl.setToolTipText("");
        subBodyPanel.add(timeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 170, -1, -1));

        examTxtFld1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examTxtFld1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        examTxtFld1.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(examTxtFld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, -1, -1));

        patientIDTxtFld1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientIDTxtFld1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        patientIDTxtFld1.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(patientIDTxtFld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, -1, -1));

        clinicianIDTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clinicianIDTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        clinicianIDTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(clinicianIDTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, -1));

        testResultTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(testResultTbl);

        subBodyPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 600, -1));

        testRIDLbl1.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        testRIDLbl1.setForeground(new java.awt.Color(0, 46, 93));
        testRIDLbl1.setText("Test Result ID:");
        testRIDLbl1.setToolTipText("");
        subBodyPanel.add(testRIDLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        testRIcon.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        testRIcon.setForeground(new java.awt.Color(0, 46, 93));
        testRIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diabetes_Logo.png"))); // NOI18N
        testRIcon.setToolTipText("");
        subBodyPanel.add(testRIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 100));

        filterICon.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        filterICon.setForeground(new java.awt.Color(0, 46, 93));
        filterICon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filter.png"))); // NOI18N
        filterICon.setToolTipText("");
        subBodyPanel.add(filterICon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        dateFLbl3.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        dateFLbl3.setForeground(new java.awt.Color(0, 46, 93));
        dateFLbl3.setText("Date:");
        dateFLbl3.setToolTipText("Enter Clinician ID");
        subBodyPanel.add(dateFLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        testRIDTxtFld1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        testRIDTxtFld1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        testRIDTxtFld1.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(testRIDTxtFld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        bodyPanel.add(subBodyPanel);

        btnPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnPanel.setPreferredSize(new java.awt.Dimension(1900, 200));
        btnPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 500, 30));

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_list.png"))); // NOI18N
        addBtn.setToolTipText("New Test Request");
        addBtn.setBorderPainted(false);
        addBtn.setContentAreaFilled(false);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        btnPanel.add(addBtn);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeBtn.setToolTipText("Go To Dashboard");
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        btnPanel.add(homeBtn);

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveBtn.setToolTipText("Save Test Request");
        saveBtn.setBorderPainted(false);
        saveBtn.setContentAreaFilled(false);
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        btnPanel.add(saveBtn);

        bodyPanel.add(btnPanel);

        newDiagnosisPanel3.add(bodyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newDiagnosisPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newDiagnosisPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Back Button
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new NewDiagnosis2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    //Exit Button
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    //New Diagnosis Button
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        new NewDiagnosis1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new ClinicianHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewDiagnosis3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDiagnosis3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDiagnosis3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDiagnosis3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDiagnosis3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JLabel clinicianIDLbl1;
    private javax.swing.JTextField clinicianIDTxtFld;
    private javax.swing.JLabel dateFLbl3;
    private javax.swing.JTextField dateFTxtFld;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTxtFld1;
    private javax.swing.JLabel diagnosisHeadLbl;
    private javax.swing.JLabel diagnosisIcon2;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JTextField diagnosisTxtFld;
    private javax.swing.JTextField examTxtFld1;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel exmaIDLbl;
    private javax.swing.JLabel filterICon;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel headSubPanel1;
    private javax.swing.JPanel headSubPanel2;
    private javax.swing.JPanel headSubPanel3;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel newDiagnosisPanel3;
    private javax.swing.JLabel patientIDLbl1;
    private javax.swing.JTextField patientIDTxtFld1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel subBodyPanel;
    private javax.swing.JLabel subheadingLbl;
    private javax.swing.JLabel testRIDLbl1;
    private javax.swing.JTextField testRIDTxtFld1;
    private javax.swing.JLabel testRIcon;
    private javax.swing.JLabel testRTblLbl;
    private javax.swing.JTable testResultTbl;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JTextField timeTxtFld;
    // End of variables declaration//GEN-END:variables
}
