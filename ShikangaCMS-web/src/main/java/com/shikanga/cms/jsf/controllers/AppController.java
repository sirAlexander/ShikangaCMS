package com.shikanga.cms.jsf.controllers;


import com.shikanga.cms.model.entities.App;
import com.shikanga.cms.model.session.AppServiceBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "appController")
@SessionScoped
public class AppController extends AbstractController<App> implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @EJB
    private AppServiceBean appService;

    public AppController() {
        super(App.class);
    }

    @PostConstruct
    public void init() {
        super.setService(appService);
    }
}
