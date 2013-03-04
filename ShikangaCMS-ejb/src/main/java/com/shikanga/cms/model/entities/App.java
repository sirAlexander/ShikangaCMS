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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;


/**
 *
 * @author shikanga
 * 
 */
@Entity
@Table( name="app" )
public class App extends BaseEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;    
    
    @NotBlank
    @Column( unique=true )
    private String reference;
    @NotBlank
    @Column( unique=true )
    private String name;
    @NotBlank
    private String description;
    
    @NotNull
    @ManyToOne( fetch= FetchType.LAZY )
    @JoinColumn( name="realm_id" )
    private Realm realm;
    
    @OneToMany
    private Set<View> views = new HashSet<View>();
    

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

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }
    
    
    public Set<View> getViews() {
        return views;
    }

    public void setViews(Set<View> views) {
        this.views = views;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.reference != null ? this.reference.hashCode() : 0);
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);        
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
        final App other = (App) obj;
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
        return "Site{" + "reference=" + reference + ", name=" + name + ", description=" + description + '}';
    }
    
    
    
    
    

    


    
}
