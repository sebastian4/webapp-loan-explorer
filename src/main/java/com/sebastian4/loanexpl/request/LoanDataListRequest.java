/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl.request;

import com.sebastian4.loanexpl.model.loanconvert.LoanDataList;
import com.sebastian4.loanexpl.model.loansnew.Loan;
import com.sebastian4.loanexpl.model.loansnew.LoansNewest;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sebastianmac
 */
public class LoanDataListRequest {
    
    private static final Logger logger = LoggerFactory.getLogger(LoanDataListRequest.class);
    
    private static LoansNewestRequest loansNewestRequest = null;
    private static LoanRepresentationRequest loanRepresentationRequest = null;

    public LoanDataListRequest(String newestListUrl, String individualLoanUrl) {
        this.loansNewestRequest = new LoansNewestRequest(newestListUrl);
        this.loanRepresentationRequest = new LoanRepresentationRequest(individualLoanUrl);
    }
    
    public LoanDataList getLoanDataList(int size) {
        logger.debug("Start getLoanDataList");
        
        LoanDataList loanDataList = new LoanDataList();
        
        logger.debug("request info");
        
        LoansNewest loansNewest = loansNewestRequest.getLoansNewest(size);
        
        logger.debug("got info");
        
        loanDataList.setSize(loansNewest.getPaging().getPageSize());
        
        List<Loan> loans = loansNewest.getLoans();
        
        for (Loan loan : loans) {
            logger.debug(loan.getName());
            
            
            
        }
        
        
        
        logger.debug(loanDataList.toString());
        
        logger.debug("End getLoanDataList");

        return loanDataList;
    }
    
}
