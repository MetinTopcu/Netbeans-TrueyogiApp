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
//
public interface IGENERICCRUD<T> {    
    public boolean Save(T t);
    public boolean Update(T t);   
    public boolean Delete(long id, T t);
    public List<T> MyList(T t);
    public List<T> Find(T t);
    public T Search(String ColumName, Object FindKey, T t);
    
}


