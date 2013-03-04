/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.entities;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author shikanga
 */
@Embeddable
public class Address implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String company;   
    @NotBlank
    private String line1;
    private String line2;
    private String line3;
    private String line4;
    private String line5;
    private String line6;
    private String city;
    @NotBlank
    private String postalCode;
    @NotNull
    private Country country;
    
    
    
}
