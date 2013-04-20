/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.session;

import com.shikanga.cms.model.entities.Realm;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shikanga
 */
@Stateless(name="RealmService")
public class RealmServiceBean extends AbstractService<Realm> {
    
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

    public RealmServiceBean() {
        super(Realm.class);
    }
    
}
