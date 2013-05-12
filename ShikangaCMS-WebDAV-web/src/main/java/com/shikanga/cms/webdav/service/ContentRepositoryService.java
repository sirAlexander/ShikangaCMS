/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.webdav.service;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shikanga
 */
public class ContentRepositoryService {
    
    private static final String CONTENT_REPOSITORY_URL = "http://localhost:8080/ShikangaCMS-WebDAV-web/webdav";

    public void list() {
        try {
            Sardine sardine = SardineFactory.begin();
            List<DavResource> resources = sardine.list(CONTENT_REPOSITORY_URL);
            for (DavResource res : resources) {
                System.out.println(res); // calls the .toString() method.
            }
        } catch (IOException ex) {
            Logger.getLogger(ContentRepositoryService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
