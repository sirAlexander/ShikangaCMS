package com.shikanga.cms.jsf.controllers;


import com.shikanga.cms.model.entities.Template;
import com.shikanga.cms.model.session.TemplateServiceBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "templateController")
@SessionScoped
public class TemplateController extends AbstractController<Template> implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @EJB
    private TemplateServiceBean templateService;

    public TemplateController() {
        super(Template.class);
    }

    @PostConstruct
    public void init() {
        super.setService(templateService);
    }
}
