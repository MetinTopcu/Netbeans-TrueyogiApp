/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Table
@Entity
public class tblmantraHistory {
    
    @Id
    @SequenceGenerator(name = "sq_tblmantraHistory_id",
                       sequenceName = "sq_tblmantraHistory_id",
                       initialValue = 1,
                       allocationSize = 1)
    @GeneratedValue(generator = "sq_tblmantraHistory_id")
    
    private String id;
    private String userid;
    private String Mantra;
    private String[] codes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }


    
    
    public String getMantra(){
        return Mantra; 
    }
    
    public void setMantra(String Mantra)
    {
        this.Mantra = Mantra;
    }

    public String[] getCodes() {
        return codes;
    }

    public void setCodes(String[] codes) {
        this.codes = codes;
    }
    
    
   
}
