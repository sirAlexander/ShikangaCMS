/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.session;

import com.shikanga.cms.model.entities.Template;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;


/**
 *
 * @author shikanga
 */
@Stateless(name="TemplateService")
public class TemplateServiceBean extends AbstractService<Template> {
    
    @Inject
    private Logger log;
    
    @Inject
    private EntityManager em;    
    
    
    @Override
    protected Logger getLog() {
        return log;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }    
    

    public TemplateServiceBean() {
        super(Template.class);
    }

    
    
}
