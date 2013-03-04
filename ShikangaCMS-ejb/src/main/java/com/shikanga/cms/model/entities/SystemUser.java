/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author shikanga
 */
@Entity
@Table( name="system_users" )
public class SystemUser extends BaseEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @NotNull
    private Name name;
    @NotNull
    private Address address;
    @ElementCollection
    @MapKeyColumn( name="name" )
    @Column( name="value" )
    @CollectionTable( name="system_users_properties", joinColumns=@JoinColumn( name="system_users_id" ))
    private Map<String, String> properties = new HashMap<String, String>();

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
    
    
   
    

    
    
}
