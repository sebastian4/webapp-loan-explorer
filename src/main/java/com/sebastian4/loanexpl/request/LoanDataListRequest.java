/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl.request;

import com.sebastian4.loanexpl.model.loanconvert.LoanData;
import com.sebastian4.loanexpl.model.loanconvert.LoanDataList;
import com.sebastian4.loanexpl.model.loanrepr.LoanRepresentation;
import com.sebastian4.loanexpl.model.loanrepr.LocalPayment;
import com.sebastian4.loanexpl.model.loanrepr.ScheduledPayment;
import com.sebastian4.loanexpl.model.loansnew.Loan;
import com.sebastian4.loanexpl.model.loansnew.LoansNewest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sebastianmac
 */
public class LoanDataListRequest {
    
    private static final Logger logger = LoggerFactory.getLogger(LoanDataListRequest.class);
    
    private LoansNewestRequest loansNewestRequest = null;
    private LoanRepresentationRequest loanRepresentationRequest = null;

    public LoanDataListRequest(String newestListUrl, String individualLoanUrl) {
        this.loansNewestRequest = new LoansNewestRequest(newestListUrl);
        this.loanRepresentationRequest = new LoanRepresentationRequest(individualLoanUrl);
    }
    
    public LoanDataList getLoanDataList(int size, int page) {
        logger.debug("Start getLoanDataList: "+size+", "+page);
        
        LoanDataList loanDataList = new LoanDataList();
        
        //logger.debug("request info");
        
        LoansNewest loansNewest = loansNewestRequest.getLoansNewest(size,page);
        
        //logger.debug("got info");
        
        loanDataList.setSize(loansNewest.getPaging().getPageSize());
        
        List<LoanData> loanDatas = new ArrayList<LoanData>();
        
        List<Loan> loans = loansNewest.getLoans();
        
        for (Loan loan : loans) {
            
            LoanData loanData = new LoanData();
            
            loanData.setName(loan.getName());
            loanData.setId(loan.getId());
            loanData.setSector(loan.getSector());
            loanData.setCountry(loan.getLocation().getCountry());

            LoanRepresentation loanRepresentation = loanRepresentationRequest.getLoanRepresentation(loanData.getId());

            if (loanRepresentation.getLoans().size() > 0) {
            	
            	List<LocalPayment> payments = loanRepresentation.getLoans().get(0).getTerms().getLocalPayments();
                loanData.setPayments(payments);

                List<ScheduledPayment> scheduledPayments = loanRepresentation.getLoans().get(0).getTerms().getScheduledPayments();
                
                double paidAmount = 0.0;

                for (LocalPayment payment : payments) {
                    paidAmount+=payment.getAmount();
                }
                
                double loanAmount = paidAmount;
                
                for (ScheduledPayment scheduledPayment : scheduledPayments) {
                	loanAmount+=scheduledPayment.getAmount();
                }
                
                loanData.setPaidAmount(paidAmount);
                
                loanData.setLoanAmount(loanAmount);

            }

            logger.debug("id="+loanData.getId()+", paidAmount="+loanData.getPaidAmount()+", loanAmount="+loanData.getLoanAmount());
            
            loanDatas.add(loanData);

        }
        
        loanDataList.setLoanDataList(loanDatas);
        
        logger.debug(loanDataList.toString());
        
        logger.debug("End getLoanDataList: "+size+", "+page);

        return loanDataList;
    }
    
}
