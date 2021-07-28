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
public class tblmoodHistory {
    
    @Id
    @SequenceGenerator(name = "sq_tblmoodHistory_id",
                       sequenceName = "sq_tblmoodHistory_id",
                       initialValue = 1,
                       allocationSize = 1)
    @GeneratedValue(generator = "sq_tblmoodHistory_id")
    
    private String id;
    private String userid;
    private String moodcode;
    private Date moodselecteddate;

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


    

    public String getMoodcode() {
        return moodcode;
    }

    public void setMoodcode(String moodcode) {
        this.moodcode = moodcode;
    }

    public Date getMoodselecteddate() {
        return moodselecteddate;
    }

    public void setMoodselecteddate(Date moodselecteddate) {
        this.moodselecteddate = moodselecteddate;
    }

   
    
}
