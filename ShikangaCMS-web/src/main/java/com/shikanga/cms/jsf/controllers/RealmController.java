package com.shikanga.cms.jsf.controllers;


import com.shikanga.cms.model.entities.Realm;
import com.shikanga.cms.model.session.RealmServiceBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "realmController")
@SessionScoped
public class RealmController extends AbstractController<Realm> implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @EJB
    private RealmServiceBean realmService;

    public RealmController() {
        super(Realm.class);
    }

    @PostConstruct
    public void init() {
        super.setService(realmService);
    }
}
