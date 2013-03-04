/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;


/**
 *
 * @author shikanga
 */
@Entity
@Table( name="realm" )
public class Realm extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
        
    @NotBlank
    @Column( unique=true )
    private String reference;
    @NotBlank
    @Column( unique=true )
    private String name;
    @NotBlank
    private String description;
    
    @OneToMany( mappedBy="realm", fetch= FetchType.LAZY )
    private Set<App> apps = new HashSet<App>();
        

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<App> getApps() {
        return apps;
    }

    public void setApps(Set<App> apps) {
        this.apps = apps;
    }

    

    
        

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.reference != null ? this.reference.hashCode() : 0);
        hash = 67 * hash + (this.name != null ? this.name.hashCode() : 0);        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Realm other = (Realm) obj;
        if ((this.reference == null) ? (other.reference != null) : !this.reference.equals(other.reference)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }        
        return true;
    }

    @Override
    public String toString() {
        return "Realm{" + "reference=" + reference + ", name=" + name + ", description=" + description + '}';
    }
    
    
        
}
