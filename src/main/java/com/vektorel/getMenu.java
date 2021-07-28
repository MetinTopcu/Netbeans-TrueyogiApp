package com.vektorel;
import com.vektorel.dao.tblmantraHistorydao;
import com.vektorel.dao.tblmenudao;
import com.vektorel.dao.tblmoodHistorydao;
import com.vektorel.dao.tblmoodTrackingdao;
import com.vektorel.dao.tblsubMenudao;
import com.vektorel.models.tblcontents;
import com.vektorel.models.tblmantraHistory;
import com.vektorel.models.tblmenu;
import com.vektorel.models.tblmoodHistory;
import com.vektorel.models.tblmoodTracking;
import com.vektorel.models.tblsubMenu;
import com.vektorel.models.tblweather;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class getMenu extends javax.swing.JFrame {

    private List<tblmantraHistory> tblmantralist;
    tblmantraHistorydao DBmantra = new tblmantraHistorydao();
    private tblmantraHistory mant1;

    private List<tblmoodTracking> tblmoodtrackinglist;
    tblmoodTrackingdao DBmoodTracking = new tblmoodTrackingdao();
    private tblmoodTracking moodtracking;

    private List<tblmoodHistory> tblmoodhistorylist;
    tblmoodHistorydao DBmoodHistory = new tblmoodHistorydao();
    private tblmoodHistory moodhistory;

    private List<tblmenu> tblmenulist;
    tblmenudao DBmenu = new tblmenudao();
    private tblmenu menu;

    private List<tblsubMenu> tblsubmenulist;
    tblsubMenudao DBsubMenu = new tblsubMenudao();
    private tblsubMenu submenu;


    private void getSelectedMoodByUser(int selectedId){
        moodtracking = (tblmoodTracking)tblmoodtrackinglist.get(selectedId);
        txtcontent.setText(moodtracking.getContent());
    }

    private void Secmenu(int selectedId){
        menu= (tblmenu)tblmenulist.get(selectedId);
        //txttitle1.setText(menu.getTitle());
    }
    private void SecsubMenu(int selectedId){
        submenu= (tblsubMenu)tblsubmenulist.get(selectedId);
        //txttitle2.setText(submenu.getTitle());
    }
    private void SecChooseATool(int selectedId){
        submenu= (tblsubMenu)tblsubmenulist.get(selectedId);
        //txtcontenturl.setText(submenu.getContenturl());
    }
    
    
    private void getSubMenu(){   
        tblsubmenulist = DBsubMenu.MyList(submenu);
        int row=0;        
        DefaultTableModel tm = (DefaultTableModel)jmomenttable.getModel();
        tm.getDataVector().removeAllElements();
        tm.setRowCount(tblsubmenulist.size());
        jmomenttable.repaint();
        for (Object item : tblsubmenulist) {              
            jmomenttable.setValueAt(((tblsubMenu)item).getTitle(), row, 0);  
            row++;
        }
    }
    
    
    
    private void getMenu1(){   
        tblmenulist = DBmenu.MyList(menu);
        int row=0;        
        DefaultTableModel tm = (DefaultTableModel)jhistorytable.getModel();
        tm.getDataVector().removeAllElements();
        tm.setRowCount(tblmenulist.size());
        jhistorytable.repaint();
        for (Object item : tblmenulist) {              
            jhistorytable.setValueAt(((tblmenu)item).getTitle(), row, 0);  
            row++;
        }
    }
    
    

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
    
    
    
    
    private void getMantra(){
        tblmantralist = DBmantra.MyList(new tblmantraHistory());
        int row=0;        
        DefaultTableModel tm = (DefaultTableModel)jmantratable.getModel();
        tm.getDataVector().removeAllElements();
        tm.setRowCount(tblmantralist.size());
        jmantratable.repaint();
        for (Object item : tblmantralist) {              
            jmantratable.setValueAt(((tblmantraHistory)item).getMantra(), row, 0);            
            row++;
        }
    }



    public getMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mantra = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jhistorytable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jmomenttable = new javax.swing.JTable();
        homebutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jmoodtable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jmantratable = new javax.swing.JTable();
        radbtn = new javax.swing.JButton();
        goodbtn = new javax.swing.JButton();
        mehbtn = new javax.swing.JButton();
        badbtn = new javax.swing.JButton();
        awfulbtn = new javax.swing.JButton();
        txtcontent = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jmoodhistorytable = new javax.swing.JTable();
        moodhistorybtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mantra.setText("Mantra");
        mantra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantra(evt);
            }
        });

        jButton2.setText("Mood Tracking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodtracking(evt);
            }
        });

        jButton3.setText("Moment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moment(evt);
            }
        });

        jButton4.setText("Weather Moon Cycle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weathermoon(evt);
            }
        });

        jButton5.setText("Day/Night&Sun Position");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Daynightsun(evt);
            }
        });

        jhistorytable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jhistorytable);

        jmomenttable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jmomenttable);

        homebutton.setText("Home");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
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
        jScrollPane3.setViewportView(jmoodtable);

        jmantratable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jmantratable);

        radbtn.setText("rad");
        radbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbtnActionPerformed(evt);
            }
        });

        goodbtn.setText("good");
        goodbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodbtnActionPerformed(evt);
            }
        });

        mehbtn.setText("meh");
        mehbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mehbtnActionPerformed(evt);
            }
        });

        badbtn.setText("bad");
        badbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badbtnActionPerformed(evt);
            }
        });

        awfulbtn.setText("awful");
        awfulbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awfulbtnActionPerformed(evt);
            }
        });

        txtcontent.setText("Mood");
        txtcontent.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
        jScrollPane5.setViewportView(jmoodhistorytable);

        moodhistorybtn.setText("Mood History");
        moodhistorybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodhistorybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(mantra))
                            .addComponent(jButton2))))
                .addGap(118, 118, 118)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(awfulbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mehbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(badbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(moodhistorybtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtcontent, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(homebutton)
                        .addGap(64, 64, 64)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mantra)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(radbtn)
                        .addGap(18, 18, 18)
                        .addComponent(goodbtn)
                        .addGap(18, 18, 18)
                        .addComponent(mehbtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(badbtn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(awfulbtn)
                            .addComponent(moodhistorybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtcontent, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1036, 1036, 1036))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mantra(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantra
       getMantra();
    }//GEN-LAST:event_mantra

    private void moodtracking(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodtracking
        // TODO add your handling code here:
        getMoodTracking();
    }//GEN-LAST:event_moodtracking

    private void moment(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moment
        // TODO add your handling code here:
        getSubMenu();
    }//GEN-LAST:event_moment

    private void weathermoon(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weathermoon
        // TODO add your handling code here:
    }//GEN-LAST:event_weathermoon

    private void Daynightsun(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Daynightsun
        // TODO add your handling code here:
    }//GEN-LAST:event_Daynightsun

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
        getMenu1();
    }//GEN-LAST:event_homebuttonActionPerformed

    private void radbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbtnActionPerformed
        // TODO add your handling code here:
        int selectedrowid = 0;
        getSelectedMoodByUser(selectedrowid);
    }//GEN-LAST:event_radbtnActionPerformed

    private void goodbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodbtnActionPerformed
        // TODO add your handling code here:
        int selectedrowid = 1;
        getSelectedMoodByUser(selectedrowid);
    }//GEN-LAST:event_goodbtnActionPerformed

    private void mehbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mehbtnActionPerformed
        // TODO add your handling code here:
        int selectedrowid = 2;
        getSelectedMoodByUser(selectedrowid);
    }//GEN-LAST:event_mehbtnActionPerformed

    private void badbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badbtnActionPerformed
        // TODO add your handling code here:
        int selectedrowid = 3;
        getSelectedMoodByUser(selectedrowid);
    }//GEN-LAST:event_badbtnActionPerformed

    private void awfulbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awfulbtnActionPerformed
        // TODO add your handling code here:
        int selectedrowid = 4;
        getSelectedMoodByUser(selectedrowid);
    }//GEN-LAST:event_awfulbtnActionPerformed

    private void moodhistorybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodhistorybtnActionPerformed
        // TODO add your handling code here:
        getMoodHistory();
    }//GEN-LAST:event_moodhistorybtnActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new getMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton awfulbtn;
    private javax.swing.JButton badbtn;
    private javax.swing.JButton goodbtn;
    private javax.swing.JButton homebutton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jhistorytable;
    private javax.swing.JTable jmantratable;
    private javax.swing.JTable jmomenttable;
    private javax.swing.JTable jmoodhistorytable;
    private javax.swing.JTable jmoodtable;
    private javax.swing.JButton mantra;
    private javax.swing.JButton mehbtn;
    private javax.swing.JButton moodhistorybtn;
    private javax.swing.JButton radbtn;
    private javax.swing.JLabel txtcontent;
    // End of variables declaration//GEN-END:variables
}
