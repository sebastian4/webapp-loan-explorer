/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl.controller;

import com.sebastian4.loanexpl.model.loanconvert.LoanDataList;
import com.sebastian4.loanexpl.request.LoanDataListRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sebastianmac
 */
public class LoanDataListController {
    
    private static final Logger logger = LoggerFactory.getLogger(LoanDataListController.class);
    
    private LoanDataListRequest httpRequest = new LoanDataListRequest("http://api.kivaws.org/v1/loans/newest.json","http://api.kivaws.org/v1/loans");
	
    @RequestMapping(value = "/{size}", method = RequestMethod.GET)
    public @ResponseBody LoanDataList getLoanDataList(@PathVariable("size") Integer size) {
            logger.debug("HTTP GET Request - Start getLoanDataList");
            LoanDataList loanDataList = httpRequest.getLoanDataList(size);
            logger.debug("HTTP GET Response - End getLoanDataList");
            return loanDataList;
    }
    
}
