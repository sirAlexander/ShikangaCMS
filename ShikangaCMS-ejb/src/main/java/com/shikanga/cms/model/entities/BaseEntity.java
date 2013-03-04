/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author shikanga
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Version
    private Long version;
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date dateCreated;
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date lastModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getDateCreated() {
        if ( dateCreated == null ){
            dateCreated = new java.util.Date();
        }
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    
    
    @PrePersist
    private void prePersist(){
        if ( dateCreated == null ){
            dateCreated = new java.util.Date();
        }
        lastModified = new java.util.Date();
    }
    
    
    private void preUpdate(){
        lastModified = new java.util.Date();
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaseEntity)) {
            return false;
        }
        BaseEntity other = (BaseEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.shikanga.cms.model.entities.BaseEntity[ id=" + id + " ]";
    }
    
}
