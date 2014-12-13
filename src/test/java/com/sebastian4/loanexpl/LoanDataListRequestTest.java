/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl;

import com.sebastian4.loanexpl.model.loanconvert.LoanDataList;
import com.sebastian4.loanexpl.request.LoanDataListRequest;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sebastianmac
 */
public class LoanDataListRequestTest {
    
    private static LoanDataListRequest request = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
            request = new LoanDataListRequest("http://api.kivaws.org/v1/loans/newest.json","http://api.kivaws.org/v1/loans");
    }

    @Test
    public void testGetLoanDataList() {
            LoanDataList loanDataList = request.getLoanDataList(8,2);
            assertEquals("must be the same size",8,loanDataList.getSize().intValue());
    }
    
}
