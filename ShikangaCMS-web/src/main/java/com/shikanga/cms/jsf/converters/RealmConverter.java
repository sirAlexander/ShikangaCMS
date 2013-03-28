package com.shikanga.cms.jsf.converters;

import com.shikanga.cms.model.entities.Realm;
import com.shikanga.cms.model.session.RealmServiceBean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;



@Named("realmConverter")
public class RealmConverter implements Converter {
    
    @EJB
    private RealmServiceBean realmService;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || value.trim().equals("")) {
            return null;
        }  
        //Realm r = realmService.find(getKey(value));
        return (Realm)realmService.find(getKey(value));
    }

    java.lang.Long getKey(String value) {
        java.lang.Long key;
        try {
             key = Long.valueOf(value);
        } catch(NumberFormatException ex) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Please Select A Valid Realm", "Conversion Error"));            
        }       
        return key;
    }

    String getStringKey(java.lang.Long value) {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Realm) {
            Realm o = (Realm) object;
            return getStringKey(o.getId());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Realm.class.getName()});
            return null;
        }
    }
}
