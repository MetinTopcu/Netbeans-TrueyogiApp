/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.util;

import java.util.List;

/**
 *
 * @author vektorel
 */
public interface ICRUD {
    
    // 1. Kayıt işleminin sonucunu dönecek -> true/false
    // 2. Parametre Al-> Object
    public boolean Save(Object o);
    public boolean Update(Object o);
    // 3. long id -> 
    public boolean Delete(long id);
    public List<Object> MyList();
    //  bul(ad), bul(ad,soyad), bul(ad,soyad,adres)
    public List<Object> Find(Object... o);
    public Object Search(long id);
    
}
