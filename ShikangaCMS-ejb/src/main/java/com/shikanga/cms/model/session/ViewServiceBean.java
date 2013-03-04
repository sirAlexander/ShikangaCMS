/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.session;

import com.shikanga.cms.model.entities.View;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shikanga
 */
@Stateless(name="ViewService")
public class ViewServiceBean extends AbstractService<View> {
    
    @PersistenceContext(unitName = "ShikangaCMSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViewServiceBean() {
        super(View.class);
    }
    
}
