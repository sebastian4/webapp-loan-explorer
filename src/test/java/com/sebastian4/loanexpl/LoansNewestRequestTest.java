/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl;

import com.sebastian4.loanexpl.model.loansnew.LoansNewest;
import com.sebastian4.loanexpl.request.LoansNewestRequest;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sebastianmac
 */
public class LoansNewestRequestTest {
    
    private static LoansNewestRequest httpRequest = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
            httpRequest = new LoansNewestRequest("http://api.kivaws.org/v1/loans/newest.json");
    }

    @Test
    public void testGetLoansNewest() {
            LoansNewest loansNewest = httpRequest.getLoansNewest(5,2);
            assertEquals("must be the same size",5,loansNewest.getPaging().getPageSize().intValue());
    }
    
}
