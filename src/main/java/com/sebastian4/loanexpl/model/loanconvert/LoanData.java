/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl.model.loanconvert;
import com.sebastian4.loanexpl.model.loanrepr.LocalPayment;

import java.util.List;

/**
 *
 * @author sebastianmac
 */
public class LoanData {
    
    protected String name;
    
    protected Integer id;
    
    protected String sector;
            
    protected String country;
    
    protected Double loanAmount;
    
    protected Double paidAmount;
    
    protected List<LocalPayment> payments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public List<LocalPayment> getPayments() {
        return payments;
    }

    public void setPayments(List<LocalPayment> payments) {
        this.payments = payments;
    }

}
