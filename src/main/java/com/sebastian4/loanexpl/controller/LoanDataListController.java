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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sebastianmac
 */
@Controller
public class LoanDataListController {
    
    private static final Logger logger = LoggerFactory.getLogger(LoanDataListController.class);
    
    private LoanDataListRequest httpRequest = new LoanDataListRequest("http://api.kivaws.org/v1/loans/newest.json","http://api.kivaws.org/v1/loans");
	
    @RequestMapping(value = "/{size}/{page}", method = RequestMethod.GET)
    public @ResponseBody LoanDataList getLoanDataList(@PathVariable("size") Integer size, @PathVariable("page") Integer page) {
            logger.debug("HTTP GET Request - Start getLoanDataList: "+size+", "+page);
            LoanDataList loanDataList = httpRequest.getLoanDataList(size,page);
            logger.debug("HTTP GET Response - End getLoanDataList: "+size+", "+page);
            return loanDataList;
    }
    
    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public @ResponseBody String getVersion() {
            logger.debug("HTTP GET Request - Start getVersion");
            String version = "v.0.1";
            logger.debug("HTTP GET Response - End getVersion");
            return version;
    }
    
}
