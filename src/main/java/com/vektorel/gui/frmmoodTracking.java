/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.gui;

import com.vektorel.dao.tblmoodHistorydao;
import com.vektorel.dao.tblmoodTrackingdao;
import com.vektorel.models.tblmoodHistory;
import com.vektorel.models.tblmoodTracking;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author metin
 */
public class frmmoodTracking extends javax.swing.JFrame {

    private List<tblmoodTracking> tblmoodtrackinglist;
    tblmoodTrackingdao DBmoodTracking = new tblmoodTrackingdao();
    private tblmoodTracking moodtracking;
    
    private List<tblmoodHistory> tblmoodhistorylist;
    tblmoodHistorydao DBmoodHistory = new tblmoodHistorydao();
    private tblmoodHistory moodhistory;


    private void getMoodHistory(){     
    tblmoodhistorylist = DBmoodHistory.MyList(moodhistory);
    int row=0;        
    DefaultTableModel tm = (DefaultTableModel)jmoodhistorytable.getModel();
    tm.getDataVector().removeAllElements();
    tm.setRowCount(tblmoodhistorylist.size());
    jmoodhistorytable.repaint();
    for (Object item : tblmoodhistorylist) {              
        jmoodhistorytable.setValueAt(((tblmoodHistory)item).getMoodcode(), row, 0);
        jmoodhistorytable.setValueAt(((tblmoodHistory)item).getMoodselecteddate(), row, 1);      
        row++;
    }
    }
    
    
    
    private void getMoodTracking(){   
    tblmoodtrackinglist = DBmoodTracking.MyList(moodtracking);
    int row=0;        
    DefaultTableModel tm = (DefaultTableModel)jmoodtable.getModel();
    tm.getDataVector().removeAllElements();
    tm.setRowCount(tblmoodtrackinglist.size());
    jmoodtable.repaint();
    for (Object item : tblmoodtrackinglist) {              
        jmoodtable.setValueAt(((tblmoodTracking)item).getTitle(), row, 0);
        jmoodtable.setValueAt(((tblmoodTracking)item).getContent(), row, 1);  
        jmoodtable.setValueAt(((tblmoodTracking)item).getIconUrl(), row, 2);   
        row++;
    }
    }
    
    public frmmoodTracking() {
        initComponents();
        getMoodHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        relationsbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jmoodtable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jmoodhistorytable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        relationsbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        relationsbtn.setText("Relations");
        relationsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relationsbtnActionPerformed(evt);
            }
        });

        jmoodtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jmoodtable);

        jmoodhistorytable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jmoodhistorytable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mood History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(relationsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(relationsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void relationsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relationsbtnActionPerformed
       getMoodTracking();
    }//GEN-LAST:event_relationsbtnActionPerformed

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
            java.util.logging.Logger.getLogger(frmmoodTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmoodTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmoodTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmoodTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmoodTracking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jmoodhistorytable;
    private javax.swing.JTable jmoodtable;
    private javax.swing.JButton relationsbtn;
    // End of variables declaration//GEN-END:variables
}
