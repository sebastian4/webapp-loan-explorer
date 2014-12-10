/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl.model.loanconvert;

import java.util.List;

/**
 *
 * @author sebastianmac
 */
public class LoanDataList {
    
    protected Integer size;
    
    protected List<LoanData> loanDataList;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<LoanData> getLoanDataList() {
        return loanDataList;
    }

    public void setLoanDataList(List<LoanData> loanDataList) {
        this.loanDataList = loanDataList;
    }

}
