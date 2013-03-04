package com.shikanga.cms.jsf.site.managedbeans;

import com.shikanga.cms.model.entities.SystemUser;
import com.shikanga.cms.model.session.SystemUserServiceBean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;

@FacesConverter("systemUserConverter")
public class SystemUserConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
            return null;
        }
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        Context ctx = null;
        SystemUserServiceBean facade = null;
        try {
            ctx = new InitialContext();
        } catch (NamingException ex) {
            Logger.getLogger(SystemUserConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ctx != null) {
            try {
                String lookupString;
                if (servletContext != null) {
                    lookupString = "java:global" + servletContext.getContextPath() + "/" + SystemUserServiceBean.class.getSimpleName();
                } else {
                    lookupString = "java:global/" + SystemUserServiceBean.class.getSimpleName();
                }
                facade = (SystemUserServiceBean) ctx.lookup(lookupString);
            } catch (NamingException ex) {
                Logger.getLogger(SystemUserConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (facade != null) {
            return facade.find(getKey(value));
        }
        return null;
    }

    java.lang.Long getKey(String value) {
        java.lang.Long key;
        key = Long.valueOf(value);
        return key;
    }

    String getStringKey(java.lang.Long value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof SystemUser) {
            SystemUser o = (SystemUser) object;
            return getStringKey(o.getId());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), SystemUser.class.getName()});
            return null;
        }
    }
}
