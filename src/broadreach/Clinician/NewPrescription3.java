/**
 *
 * @author Gullian Van Der Walt H5G8YT7X3
 * ITDA301 - Project 2020
 * Pearson Pretoria 
 * BSC IT Level 3
 * 
 * 
 * 
 * This Is The New Prescription View
 * 
 * 
 */

package broadreach.Clinician;

public class NewPrescription3 extends javax.swing.JFrame {

    /**
     * Creates new form NewPrescription3
     */
    public NewPrescription3() {
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

        newPrescriptionPanel3 = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        headSubPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        headSubPanel2 = new javax.swing.JPanel();
        prescriptionIcon = new javax.swing.JLabel();
        prescriptionHeadLbl = new javax.swing.JLabel();
        subheadingLbl = new javax.swing.JLabel();
        headSubPanel3 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        subBodyPanel = new javax.swing.JPanel();
        remakrsLbl = new javax.swing.JLabel();
        clinicianIDLbl1 = new javax.swing.JLabel();
        timeTxtFld = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        pSurnameLbl = new javax.swing.JLabel();
        medicineLbl = new javax.swing.JLabel();
        exmaIDLbl = new javax.swing.JLabel();
        dateTxtFld1 = new javax.swing.JTextField();
        timeLbl = new javax.swing.JLabel();
        examTxtFld1 = new javax.swing.JTextField();
        pSurnameTxtFld = new javax.swing.JTextField();
        clinicianIDTxtFld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineTbl = new javax.swing.JTable();
        medicineCdLbl = new javax.swing.JLabel();
        medicineIcon = new javax.swing.JLabel();
        medicineCdTxtFld = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarksTxtArea = new javax.swing.JTextArea();
        patientIDLbl = new javax.swing.JLabel();
        pNameLBl = new javax.swing.JLabel();
        patientIDTxtFld2 = new javax.swing.JTextField();
        pNameTxtFld = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroadReach - New Prescription");
        setName("newPrescriptionFrame3"); // NOI18N

        newPrescriptionPanel3.setBackground(new java.awt.Color(255, 255, 255));
        newPrescriptionPanel3.setMaximumSize(new java.awt.Dimension(1920, 1080));
        newPrescriptionPanel3.setMinimumSize(new java.awt.Dimension(1920, 1080));
        newPrescriptionPanel3.setPreferredSize(new java.awt.Dimension(1920, 1080));

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

        prescriptionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prescription_logo.png"))); // NOI18N

        prescriptionHeadLbl.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        prescriptionHeadLbl.setForeground(new java.awt.Color(255, 255, 255));
        prescriptionHeadLbl.setText("New Prescription");
        prescriptionHeadLbl.setToolTipText("");
        prescriptionHeadLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
                .addGroup(headSubPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(prescriptionIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prescriptionHeadLbl)
                        .addGap(97, 97, 97))
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
                        .addComponent(prescriptionIcon)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headSubPanel2Layout.createSequentialGroup()
                        .addComponent(prescriptionHeadLbl)
                        .addGap(23, 23, 23))))
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

        newPrescriptionPanel3.add(headPanel);

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

        remakrsLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        remakrsLbl.setForeground(new java.awt.Color(0, 46, 93));
        remakrsLbl.setText("Remarks:");
        remakrsLbl.setToolTipText("");
        subBodyPanel.add(remakrsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 40, -1, -1));

        clinicianIDLbl1.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        clinicianIDLbl1.setForeground(new java.awt.Color(0, 46, 93));
        clinicianIDLbl1.setText("Clinician ID:");
        clinicianIDLbl1.setToolTipText("");
        subBodyPanel.add(clinicianIDLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, -1, -1));

        timeTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timeTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        timeTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(timeTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, -1, -1));

        dateLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        dateLbl.setForeground(new java.awt.Color(0, 46, 93));
        dateLbl.setText("Date:");
        dateLbl.setToolTipText("");
        subBodyPanel.add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, -1, -1));

        pSurnameLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        pSurnameLbl.setForeground(new java.awt.Color(0, 46, 93));
        pSurnameLbl.setText("Patient Surname:");
        pSurnameLbl.setToolTipText("");
        subBodyPanel.add(pSurnameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        medicineLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        medicineLbl.setForeground(new java.awt.Color(0, 46, 93));
        medicineLbl.setText("Medicine");
        medicineLbl.setToolTipText("");
        subBodyPanel.add(medicineLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        exmaIDLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        exmaIDLbl.setForeground(new java.awt.Color(0, 46, 93));
        exmaIDLbl.setText("Exam ID:");
        exmaIDLbl.setToolTipText("");
        subBodyPanel.add(exmaIDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        dateTxtFld1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateTxtFld1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        dateTxtFld1.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(dateTxtFld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, -1, -1));

        timeLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        timeLbl.setForeground(new java.awt.Color(0, 46, 93));
        timeLbl.setText("Time:");
        timeLbl.setToolTipText("");
        subBodyPanel.add(timeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, -1, -1));

        examTxtFld1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examTxtFld1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        examTxtFld1.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(examTxtFld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, -1, -1));

        pSurnameTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pSurnameTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        pSurnameTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(pSurnameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        clinicianIDTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clinicianIDTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        clinicianIDTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(clinicianIDTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, -1, -1));

        medicineTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(medicineTbl);

        subBodyPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 600, -1));

        medicineCdLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        medicineCdLbl.setForeground(new java.awt.Color(0, 46, 93));
        medicineCdLbl.setText("Medicine Code:");
        medicineCdLbl.setToolTipText("");
        subBodyPanel.add(medicineCdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        medicineIcon.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        medicineIcon.setForeground(new java.awt.Color(0, 46, 93));
        medicineIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medicine_Logo.png"))); // NOI18N
        medicineIcon.setToolTipText("");
        subBodyPanel.add(medicineIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 100));

        medicineCdTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        medicineCdTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        medicineCdTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(medicineCdTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        remarksTxtArea.setColumns(20);
        remarksTxtArea.setRows(5);
        jScrollPane2.setViewportView(remarksTxtArea);

        subBodyPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 70, 230, 280));

        patientIDLbl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        patientIDLbl.setForeground(new java.awt.Color(0, 46, 93));
        patientIDLbl.setText("Patient ID:");
        patientIDLbl.setToolTipText("");
        subBodyPanel.add(patientIDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        pNameLBl.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        pNameLBl.setForeground(new java.awt.Color(0, 46, 93));
        pNameLBl.setText("Patient Name:");
        pNameLBl.setToolTipText("");
        subBodyPanel.add(pNameLBl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        patientIDTxtFld2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientIDTxtFld2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        patientIDTxtFld2.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(patientIDTxtFld2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        pNameTxtFld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pNameTxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 46, 93), 2));
        pNameTxtFld.setPreferredSize(new java.awt.Dimension(240, 30));
        subBodyPanel.add(pNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

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

        newPrescriptionPanel3.add(bodyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newPrescriptionPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newPrescriptionPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Back Button
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new NewPrescription2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    //Add Prescription Button
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        new NewPrescription1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnActionPerformed

    //Home 
    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new ClinicianHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    //Save Button
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
            java.util.logging.Logger.getLogger(NewPrescription3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPrescription3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPrescription3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPrescription3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPrescription3().setVisible(true);
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
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTxtFld1;
    private javax.swing.JTextField examTxtFld1;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel exmaIDLbl;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel headSubPanel1;
    private javax.swing.JPanel headSubPanel2;
    private javax.swing.JPanel headSubPanel3;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel medicineCdLbl;
    private javax.swing.JTextField medicineCdTxtFld;
    private javax.swing.JLabel medicineIcon;
    private javax.swing.JLabel medicineLbl;
    private javax.swing.JTable medicineTbl;
    private javax.swing.JPanel newPrescriptionPanel3;
    private javax.swing.JLabel pNameLBl;
    private javax.swing.JTextField pNameTxtFld;
    private javax.swing.JLabel pSurnameLbl;
    private javax.swing.JTextField pSurnameTxtFld;
    private javax.swing.JLabel patientIDLbl;
    private javax.swing.JTextField patientIDTxtFld2;
    private javax.swing.JLabel prescriptionHeadLbl;
    private javax.swing.JLabel prescriptionIcon;
    private javax.swing.JLabel remakrsLbl;
    private javax.swing.JTextArea remarksTxtArea;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel subBodyPanel;
    private javax.swing.JLabel subheadingLbl;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JTextField timeTxtFld;
    // End of variables declaration//GEN-END:variables
}