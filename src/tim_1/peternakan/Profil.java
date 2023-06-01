/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tim_1.peternakan;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Profil extends javax.swing.JFrame {

    /**
     * Creates new form Profil
     */
    public Profil() {
        initComponents();
        try {
        // Retrieve the person's data from the database
        Person person = Database.getInstance().getPersonById("6");

        // Update the GUI with the retrieved data
        updateProfileGUI(person);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotoProfil = new javax.swing.JLabel();
        panelRincian = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        noTelp = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fotoProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/fotoProfil.png"))); // NOI18N
        getContentPane().add(fotoProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 130, -1));

        panelRincian.setBackground(new java.awt.Color(221, 241, 247, 200));
        panelRincian.setPreferredSize(new java.awt.Dimension(277, 134));

        nama.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama.setText("Zahra Safira");

        role.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        role.setText("(owner)");

        noTelp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        noTelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTelp.setText("+6281329870543");

        email.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("zahrasafira@gmail.com");

        alamat.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        alamat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alamat.setText("Sidomulyo, RT24, RW05, Krikilan, Masaran, Sragen, Jawa Tengah");

        javax.swing.GroupLayout panelRincianLayout = new javax.swing.GroupLayout(panelRincian);
        panelRincian.setLayout(panelRincianLayout);
        panelRincianLayout.setHorizontalGroup(
            panelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRincianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(role, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(noTelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(alamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRincianLayout.setVerticalGroup(
            panelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRincianLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(role)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamat)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(panelRincian, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 720, 220));

        homebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/home.png"))); // NOI18N
        homebutton.setBorder(null);
        homebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 40, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/VrinFarm (1).png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebuttonActionPerformed
    
    // Update the GUI with the data retrieved from the database
    public void updateProfileGUI(Person person) {
        nama.setText(person.getNama());
        role.setText("(" + person.getRole() + ")");
        noTelp.setText(person.getContactNumber());
        email.setText(person.getEmail());
        alamat.setText(person.getAddress());
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
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel background;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fotoProfil;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel noTelp;
    private javax.swing.JPanel panelRincian;
    private javax.swing.JLabel role;
    // End of variables declaration//GEN-END:variables
}