/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbankmanagements;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author wahid
 */
public class UpdateDonor extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDonor
     */
    public UpdateDonor() {
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

        searchemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        bloodgrp = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        donationdate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        donorid = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        homepage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchemail.setBackground(new java.awt.Color(255, 102, 0));
        searchemail.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        searchemail.setForeground(new java.awt.Color(255, 255, 255));
        searchemail.setText("Enter Donor Email");
        getContentPane().add(searchemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 490, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel10.setText("Update Donor Data");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        searchbtn.setBackground(new java.awt.Color(102, 0, 51));
        searchbtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search1.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 225, 50));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel11.setText("Full Name:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel12.setText("Email:");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 176, -1, -1));

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel13.setText("Phone No:");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 222, -1, -1));

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel15.setText("Adress");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 268, -1, -1));

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel16.setText("City:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 314, -1, -1));

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel17.setText("Gender:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 354, -1, -1));

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel18.setText("Blood Group:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 394, -1, -1));

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel19.setText("Date of Birth:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel20.setText("Donation Date");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        name.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 280, -1));

        email.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 280, -1));

        phoneno.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 217, 280, -1));

        address.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 265, 280, -1));

        city.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 313, 280, -1));

        gender.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 353, 280, -1));

        bloodgrp.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        bloodgrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodgrpActionPerformed(evt);
            }
        });
        getContentPane().add(bloodgrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 395, 280, -1));

        dob.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 280, -1));

        donationdate.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        donationdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationdateActionPerformed(evt);
            }
        });
        getContentPane().add(donationdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 280, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Donor Id:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        donorid.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        donorid.setText("Null");
        getContentPane().add(donorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 280, -1));

        updatebtn.setBackground(new java.awt.Color(0, 0, 102));
        updatebtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update details.png"))); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, -1, -1));

        homepage.setBackground(new java.awt.Color(51, 0, 51));
        homepage.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        homepage.setForeground(new java.awt.Color(255, 255, 255));
        homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        homepage.setText("Home");
        homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageActionPerformed(evt);
            }
        });
        getContentPane().add(homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void bloodgrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodgrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodgrpActionPerformed

    private void donationdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donationdateActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String donorEmail = searchemail.getText();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Diu_projects", "wahid", "Wahid@#81");
            Statement st = connection.createStatement();

            ResultSet rt = st.executeQuery("select * from donor where email='" + donorEmail + "'");
            if (rt.next()) {
                donorid.setText(rt.getString(1));
                email.setText(rt.getString(3));
                phoneno.setText(rt.getString(4));
                bloodgrp.setText(rt.getString(8));
                address.setText(rt.getString(5));
                city.setText(rt.getString(6));
                gender.addItem(rt.getString(1));
                dob.setText(rt.getString(9));
                donationdate.setText(rt.getString(10));
                name.setText(rt.getString(2));

            } else {
                JOptionPane.showMessageDialog(null, "Donor not found");

            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void homepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomePage hm = new HomePage();
        hm.setVisible(true);
    }//GEN-LAST:event_homepageActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField bloodgrp;
    private javax.swing.JTextField city;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField donationdate;
    private javax.swing.JLabel donorid;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchemail;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
