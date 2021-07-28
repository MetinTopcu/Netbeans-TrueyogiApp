/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.gui;

/**
 *
 * @author metin
 */
public class frmHome extends javax.swing.JFrame {

 
    public frmHome() {
        initComponents();
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weathermoonbtn = new javax.swing.JButton();
        momentbtn = new javax.swing.JButton();
        moodtrackingbtn = new javax.swing.JButton();
        mantrabtn = new javax.swing.JButton();
        daynightbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        weathermoonbtn.setText("Weather Moon Cycle");
        weathermoonbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weathermoonbtnActionPerformed(evt);
            }
        });

        momentbtn.setText("Moment");
        momentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                momentbtnActionPerformed(evt);
            }
        });

        moodtrackingbtn.setText("Mood Tracking");
        moodtrackingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodtrackingbtnActionPerformed(evt);
            }
        });

        mantrabtn.setText("Mantra");
        mantrabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantrabtnActionPerformed(evt);
            }
        });

        daynightbtn.setText("Day/Night&Sun Position");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(momentbtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(moodtrackingbtn)
                            .addGap(50, 50, 50)
                            .addComponent(mantrabtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(weathermoonbtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(daynightbtn)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(daynightbtn)
                        .addGap(82, 82, 82)
                        .addComponent(weathermoonbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(momentbtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(moodtrackingbtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mantrabtn)
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mantrabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantrabtnActionPerformed
        frmMantra frm = new frmMantra();
        frm.setVisible(true);
    }//GEN-LAST:event_mantrabtnActionPerformed

    private void moodtrackingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodtrackingbtnActionPerformed
        frmmoodTracking frm = new frmmoodTracking();
        frm.setVisible(true);
    }//GEN-LAST:event_moodtrackingbtnActionPerformed

    private void momentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_momentbtnActionPerformed
        frmMoment frm = new frmMoment();
        frm.setVisible(true);
    }//GEN-LAST:event_momentbtnActionPerformed

    private void weathermoonbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weathermoonbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weathermoonbtnActionPerformed

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daynightbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mantrabtn;
    private javax.swing.JButton momentbtn;
    private javax.swing.JButton moodtrackingbtn;
    private javax.swing.JButton weathermoonbtn;
    // End of variables declaration//GEN-END:variables
}
