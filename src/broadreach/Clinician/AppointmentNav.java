/**
 *
 * @author Gullian Van Der Walt H5G8YT7X3
 * ITDA301 - Project 2020
 * Pearson Pretoria 
 * BSC IT Level 3
 * 
 * 
 * 
 * This Is The Main Appointment Navigation View
 * 
 * 
 */
package broadreach.Clinician;

public class AppointmentNav extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentNav
     */
    public AppointmentNav() {
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

        AppointmentNavPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        header = new java.awt.Label();
        appNavLbl = new java.awt.Label();
        appointmentIcon = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        viewAppointmentBtn = new javax.swing.JButton();
        newAppointmentBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroadReach - Appointment Nav");
        setName("appNavFrame"); // NOI18N
        setResizable(false);

        AppointmentNavPanel.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentNavPanel.setToolTipText("");

        headerPanel.setBackground(new java.awt.Color(0, 46, 93));

        header.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setName(""); // NOI18N
        header.setText("BroadReach");

        appNavLbl.setFont(new java.awt.Font("Constantia", 0, 34)); // NOI18N
        appNavLbl.setForeground(new java.awt.Color(255, 255, 255));
        appNavLbl.setText("Appointment Navigation");

        appointmentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/appointment_icon.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394)
                .addComponent(appointmentIcon)
                .addGap(58, 58, 58)
                .addComponent(appNavLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(appointmentIcon))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appNavLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        buttonPanel.setBackground(new java.awt.Color(255, 255, 255));

        viewAppointmentBtn.setBackground(new java.awt.Color(0, 46, 93));
        viewAppointmentBtn.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        viewAppointmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewAppointmentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/past.png"))); // NOI18N
        viewAppointmentBtn.setText("View Appointments");
        viewAppointmentBtn.setToolTipText("View Appointments");
        viewAppointmentBtn.setBorderPainted(false);
        viewAppointmentBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewAppointmentBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentBtnActionPerformed(evt);
            }
        });

        newAppointmentBtn.setBackground(new java.awt.Color(0, 46, 93));
        newAppointmentBtn.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        newAppointmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        newAppointmentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_list.png"))); // NOI18N
        newAppointmentBtn.setText("New Appointment");
        newAppointmentBtn.setToolTipText("");
        newAppointmentBtn.setBorderPainted(false);
        newAppointmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newAppointmentBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newAppointmentBtn.setPreferredSize(new java.awt.Dimension(267, 139));
        newAppointmentBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAppointmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(viewAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(newAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newAppointmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(viewAppointmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        backBtn.setToolTipText("Back");
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(19, 19, 19)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout AppointmentNavPanelLayout = new javax.swing.GroupLayout(AppointmentNavPanel);
        AppointmentNavPanel.setLayout(AppointmentNavPanelLayout);
        AppointmentNavPanelLayout.setHorizontalGroup(
            AppointmentNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AppointmentNavPanelLayout.setVerticalGroup(
            AppointmentNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppointmentNavPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppointmentNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppointmentNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //View Appointments Button
    private void viewAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentBtnActionPerformed
        new ViewAppointment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewAppointmentBtnActionPerformed

    //New Appointment Button
    private void newAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAppointmentBtnActionPerformed
        new NewAppointment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newAppointmentBtnActionPerformed

    //Back Button
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new ClinicianHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentNav().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppointmentNavPanel;
    private java.awt.Label appNavLbl;
    private javax.swing.JLabel appointmentIcon;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel buttonPanel;
    private java.awt.Label header;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton newAppointmentBtn;
    private javax.swing.JButton viewAppointmentBtn;
    // End of variables declaration//GEN-END:variables
}
