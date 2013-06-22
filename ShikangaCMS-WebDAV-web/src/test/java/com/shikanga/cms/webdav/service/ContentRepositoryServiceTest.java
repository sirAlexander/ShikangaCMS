/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.webdav.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shikanga
 */
public class ContentRepositoryServiceTest {
    
    public ContentRepositoryServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of list method, of class ContentRepositoryService.
     */
    @Test
    public void testList() {
        System.out.println("list");
        ContentRepositoryService instance = new ContentRepositoryService();
        instance.list();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}