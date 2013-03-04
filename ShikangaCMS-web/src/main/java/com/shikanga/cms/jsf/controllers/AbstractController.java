package com.shikanga.cms.jsf.controllers;


import com.shikanga.cms.model.session.AbstractService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

/**
 * Represents an abstract shell of to be used as JSF Controller to be used in
 * AJAX-enabled applications. No outcomes will be generated from its methods
 * since handling is designed to be done inside one page.
 */
public abstract class AbstractController<T> {

    private AbstractService<T> service;
    private Class<T> itemClass;
    private T selected;
    private List<T> items;

    public AbstractController() {
    }

    public AbstractController(Class<T> itemClass) {
        this.itemClass = itemClass;
    }

    
    protected AbstractService<T> getService() {
        return service;
    }

    protected void setService(AbstractService<T> service) {
        this.service = service;
    }

    public T getSelected() {
        return selected;
    }

    public void setSelected(T selected) {
        this.selected = selected;
    }

    /**
     * Returns all items in a List object
     *
     * @return
     */
    public List<T> getItems() {
        if (items == null) {
            items = this.service.findAll();
        }
        return items;
    }

    public void save(ActionEvent event) {
        if (selected != null) {
            this.service.edit(selected);
        }
    }

    public void saveNew(ActionEvent event) {
        if (selected != null) {
            this.service.create(selected);
            items = null; // Invalidate list of items to trigger requery.
        }
    }

    public void delete(ActionEvent event) {
        if (selected != null) {
            this.service.remove(selected);
            items = null; // Invalidate list of items to trigger requery.
        }
    }

    /**
     * Creates a new instance of an underlying entity and assigns it to Selected
     * property.
     *
     * @return
     */
    public T prepareCreate(ActionEvent event) {
        T newItem;
        try {
            newItem = itemClass.newInstance();
            this.selected = newItem;
            return newItem;
        } catch (InstantiationException ex) {
            Logger.getLogger(AbstractController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AbstractController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return getSelectItems(service.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return getSelectItems(service.findAll(), true);
    }

    private SelectItem[] getSelectItems(List<T> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "---");
            i++;
        }
        for (Object x : entities) {
            items[i++] = new SelectItem(x, x.toString());
        }
        return items;
    }
}
