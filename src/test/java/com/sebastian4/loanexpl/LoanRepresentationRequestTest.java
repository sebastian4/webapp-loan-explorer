/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl;

import com.sebastian4.loanexpl.model.loanrepr.LoanRepresentation;
import com.sebastian4.loanexpl.request.LoanRepresentationRequest;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sebastianmac
 */
public class LoanRepresentationRequestTest {
    
    private static LoanRepresentationRequest httpRequest = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
            httpRequest = new LoanRepresentationRequest("http://api.kivaws.org/v1/loans");
    }

    @Test
    public void testGetLoanRepresentation() {
            LoanRepresentation loanRepresentation = httpRequest.getLoanRepresentation(810881);
            assertEquals("must be the same id",810881,loanRepresentation.getLoans().get(0).getId().intValue());
    }
}
