/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.jsf.site.managedbeans;

import com.shikanga.cms.model.session.AppServiceBean;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;




/**
 *
 * Backing Managed-Bean - Typical Scope 'Request'
 *
 * Description: This type of managed-bean participates in the "View" concern of
 * the MVC design pattern. The purpose of a backing-bean is to support UI logic,
 * and has a 1::1 relationship with a JSF view, or a JSF form in a Facelet
 * composition. Although it typically has JavaBean-style properties with
 * associated getters/setters, these are properties of the View -- not of the
 * underlying application data model. JSF backing-beans may also have JSF
 * actionListener and valueChangeListener methods.
 *
 * @author shikanga
 * @version 1.0
 * 
 *
 */
@ViewScoped
@ManagedBean(name = "appBean")
public class AppBackingBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private static final Logger LOGGER = Logger.getLogger(AppBackingBean.class.getName());
    
    @EJB(beanName="AppFacadeBean")
    private AppServiceBean appFacadeBean;
    
    
    private String test;

    public String getTest() {
        LOGGER.log( Level.INFO, " calling getTest ");
        return test;
    }

    public void setTest(String test) {
        LOGGER.log( Level.INFO, " calling setTest ");
        this.test = test;
    }
    
    
    
    
    
    

    private void displayMessage(Severity severity, String summary, String detail) {
        displayMessage(null, severity, summary, detail);
    }

    private void displayMessage(String msgKey, Severity severity, String summary, String detail) {
        LOGGER.log(Level.INFO, " msgKey: {0} Severity: {1} Summary: {2} Detail: {3}", new Object[]{msgKey, severity, summary, detail});
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(msgKey, new FacesMessage(severity, summary, detail));
    }
}
