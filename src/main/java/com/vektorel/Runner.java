/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel;

import com.vektorel.models.tblcontents;
import com.vektorel.models.tblmantraHistory;
import com.vektorel.models.tblmenu;
import com.vektorel.models.tblmoodHistory;
import com.vektorel.models.tblmoodTracking;
import com.vektorel.models.tblsubMenu;
import com.vektorel.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vektorel
 */

public class Runner {
    
    static Session session = null;
    
    public static void insert(tblmantraHistory e){
    session=HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(e);
    tx.commit();   
    session.close();
    }
    public static void insert1(tblmoodTracking e){
    session=HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(e);
    tx.commit();   
    session.close();
    }
    public static void insert2(tblmoodHistory e){
    session=HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(e);
    tx.commit();   
    session.close();
    }
    public static void insert3(tblmenu e){
    session=HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(e);
    tx.commit();   
    session.close();
    }
    public static void insert4(tblsubMenu e){
    session=HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(e);
    tx.commit();   
    session.close();
    }
    public static void insert5(tblcontents e){
    session=HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(e);
    tx.commit();   
    session.close();
    }
    
 
    public static void main(String[] args) {
        // Yeni bir Oturum Açılır.
        // V.T. Bağlantı sağlanır
        tblmantraHistory mantra = new tblmantraHistory();
        mantra.setId("0");
        mantra.setUserid("0");
        mantra.setMantra("mantra0");
        
        Criteria cr1 = session.createCriteria(tblmantraHistory.class);
        List<tblmantraHistory> mantralist = cr1.list();
        for (tblmantraHistory item : mantralist) {
            System.out.println("ID = " + item.getId());
            System.out.println("USERID = " + item.getUserid());
            System.out.println("Mantra = " + item.getMantra());
        }
        insert(mantra);
        
        tblmoodTracking moodtracking = new tblmoodTracking();
        moodtracking.setId("0");
        moodtracking.setCode("0");
        moodtracking.setTitle("title0");
        moodtracking.setContent("content0");
        moodtracking.setIconUrl("iconurl0");
        insert1(moodtracking);
        
        tblmoodHistory moodhistory = new tblmoodHistory();
        moodhistory.setId("0");
        moodhistory.setUserid("0");
        moodhistory.setMoodcode("moodcode0");
        Date tarih = new Date(11/01/2001);
        moodhistory.setMoodselecteddate(tarih);
        insert2(moodhistory);
        
        tblmenu tblmenu = new tblmenu();
        tblmenu.setId("0");
        tblmenu.setCode("0");
        tblmenu.setTitle("title0");
        tblmenu.setRank(1);
        
        insert3(tblmenu);
        
        tblsubMenu tblsubmenu = new tblsubMenu();
        tblsubmenu.setId("0");
        tblsubmenu.setCode("0");
        tblsubmenu.setTitle("title0");
        tblsubmenu.setRank(1);
        tblsubmenu.setDepth(1);
        
        insert4(tblsubmenu);
        
        tblcontents tblcontent = new tblcontents();
        tblcontent.setId("0");
        tblcontent.setCodes("focus");
        tblcontent.setContenturl("contenturl0");
        
        insert5(tblcontent);
        
        
        /*TblOgrenci ogr = new TblOgrenci();
        ogr.setAd("Öğrenci -4 ");
        ogr.setSoyad("Soyad");
        ogr.setTckimlik("12324254354");
        session.save(ogr);
        TblOkul okul = new TblOkul();
        okul.setAd("1. okul");
        session.save(okul);
        transaction.commit();
        
        //Kriter Oluştur.
        Criteria cr = session.createCriteria(TblOgrenci.class);
        // Öğrenci Listessini Çek
        List<TblOgrenci> ogrencilistesi = cr.list();
        // Listeyi Dön.
        for (TblOgrenci item : ogrencilistesi) {
            System.out.println("Id.......: "+ item.getId());
            System.out.println("Ad.......: "+ item.getAd());
            System.out.println("Soyad....: "+ item.getSoyad());
            System.out.println("Tc.......: "+ item.getTckimlik());
            System.out.println("");
        }
                
        session.close();   
*/
    }
    
}
