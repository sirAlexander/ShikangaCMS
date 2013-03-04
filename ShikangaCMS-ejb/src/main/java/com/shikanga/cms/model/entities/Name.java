/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.entities;

import java.io.Serializable;
import javax.persistence.Embeddable;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author shikanga
 */
@Embeddable
public class Name implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @NotBlank
    private String title;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
    
    
}
