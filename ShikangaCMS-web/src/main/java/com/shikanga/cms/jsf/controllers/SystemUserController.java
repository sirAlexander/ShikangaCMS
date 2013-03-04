package com.shikanga.cms.jsf.controllers;


import com.shikanga.cms.model.entities.SystemUser;
import com.shikanga.cms.model.session.SystemUserServiceBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "systemUserController")
@SessionScoped
public class SystemUserController extends AbstractController<SystemUser> implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @EJB
    private SystemUserServiceBean systemUserService;

    public SystemUserController() {
        super(SystemUser.class);
    }

    @PostConstruct
    public void init() {
        super.setService(systemUserService);
    }
    
    
    
    
    
}
