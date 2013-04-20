package com.shikanga.cms.jsf.controllers;


import com.shikanga.cms.model.entities.View;
import com.shikanga.cms.model.session.ViewServiceBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "viewController")
@SessionScoped
public class ViewController extends AbstractController<View> implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @EJB
    private ViewServiceBean viewService;

    public ViewController() {
        super(View.class);
    }

    @PostConstruct
    public void init() {
        super.setService(viewService);
    }
}
