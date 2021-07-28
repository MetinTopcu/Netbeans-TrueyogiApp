/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vektorel
 */
@Table
@Entity
public class tblcontents {
    
    @Id
    @SequenceGenerator(name = "sq_tblcontents_id",
                       sequenceName = "sq_tblcontents_id",
                       initialValue = 1,
                       allocationSize = 1)
    @GeneratedValue(generator = "sq_tblcontents_id")
    
    private String id;
    private String codes;
    private String contenturl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }
    
    
    
}
