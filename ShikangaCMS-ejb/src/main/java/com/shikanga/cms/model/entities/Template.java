/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author shikanga
 */
@Entity
@Table( name="templates" )
public class Template extends BaseEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
        
    @NotEmpty
    @Column( unique=true )
    private String reference;
    @NotEmpty
    @Column( unique=true )
    private String name;
    @NotNull
    private String description;
    @Lob
    private String content;
    
    
    @ElementCollection
    @CollectionTable(
            name="template_regions",
            joinColumns=@JoinColumn( name="template_id")
    )
    private Set<TemplateRegion> regions = new HashSet<TemplateRegion>();    
    
    @OneToMany( mappedBy="template", fetch= FetchType.LAZY )
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
    

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
        

    public Set<TemplateRegion> getRegions() {
        return regions;
    }

    public void setRegions(Set<TemplateRegion> regions) {
        this.regions = regions;
    }

    public Set<View> getViews() {
        return views;
    }

    public void setViews(Set<View> views) {
        this.views = views;
    }
    
        
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.reference != null ? this.reference.hashCode() : 0);
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final Template other = (Template) obj;
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
        return "Template{" + "reference=" + reference + ", name=" + name + ", description=" + description + '}';
    }
    
      
    
}
