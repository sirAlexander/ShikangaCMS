package com.shikanga.cms.jsf.controllers;


import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "authenticationController")
@ViewScoped
public class AuthenticationController implements Serializable {  
    
    private static final long serialVersionUID = 1L;
    
    
    private String username;
    private String password;

    private static String result = "index";
    
    private static final Logger log = Logger.getLogger( AuthenticationController.class.getName() );

    public AuthenticationController() {       
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    public String logIn(){        
        if ( username.equals("Admin") && password.equals("Admin")){
            return "/secure/admin-manager/index?faces-redirect=true";
        }     
         log.info(" Action Event"); 
        
        return result;        
    }
    

    

    public String logOut(){        
        result = "login";        
        return result;        
    }
    
    
    
    
    
    
}
