/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.errors;

import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class HataBildirimleri {
    
    /**
     * Bu Değişken Dil İçin kullanılır
     * TR - Türkçe
     * EN - İngilizce
     * v.s.
     */
    public static String Language="TR";
    
    public static void OpenConnectionErrorMessage(String ErrorCode){
        JOptionPane.showMessageDialog(null,GetErrorMessage("001")
                +"\n Hata Kodu...: "+ErrorCode);
    }
    public static void AllreadyCloseConnectionErrorMessage(String ErrorCode){
        JOptionPane.showMessageDialog(null,GetErrorMessage("002")
                +"\n Hata Kodu...: "+ErrorCode);
    }
    public static void CloseConnectionErrorMessage(String ErrorCode){
        JOptionPane.showMessageDialog(null,GetErrorMessage("003")
                +"\n Hata Kodu...: "+ErrorCode);
    }
    public static void SaveErrorMessage(String ErrorCode){
        JOptionPane.showMessageDialog(null,GetErrorMessage("004")
                +"\n Hata Kodu...: "+ErrorCode);
    }
    public static void UpdateErrorMessage(String ErrorCode){
        JOptionPane.showMessageDialog(null,GetErrorMessage("005")
                +"\n Hata Kodu...: "+ErrorCode);
    }
    private static String GetErrorMessage(String code){
        if(code.equals("001"))
            return "Bağlantı Hatası Lütfen Tekrar Deneyiniz";
        else if(code.equals("002"))
            return "Bağlantı Zaten Kapalı";
        else if(code.equals("003"))
            return "Bağlantı Kapatma Hatası Lütfen Tekrar Deneyiniz";
        else if(code.equals("004"))
            return "Kayıt İşlemi Tamamlanamadı,";
        else if(code.equals("005"))
            return "Güncelleme İşlemi Tamamlanamadı,";
        else
            return "";
    }
    
}
