/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian4.loanexpl.request;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sebastian4.loanexpl.model.loansnew.LoansNewest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sebastianmac
 */
public class LoansNewestRequest {
    
    private static final Logger logger = LoggerFactory.getLogger(LoansNewestRequest.class);
    
    protected String baseUrl;
    protected URL url;
    protected ObjectMapper mapper;

    public LoansNewestRequest(String baseUrl) {
        this.baseUrl = baseUrl;
	mapper = new ObjectMapper();
	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    
    public LoansNewest getLoansNewest(int size, int page) {
		logger.debug("Start getLoansNewest");
		
		LoansNewest loansNewest = null;
		
		try {
			url = new URL(baseUrl+"?per_page="+size+"&page="+page);
			URLConnection connection = url.openConnection(); 
			loansNewest = mapper.readValue(connection.getInputStream(), LoansNewest.class);
			logger.debug(loansNewest.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.debug("End getLoansNewest");
		
		return loansNewest;
    }

}
