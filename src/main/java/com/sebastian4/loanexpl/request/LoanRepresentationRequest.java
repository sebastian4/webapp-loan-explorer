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
import com.sebastian4.loanexpl.model.loanrepr.LoanRepresentation;
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
public class LoanRepresentationRequest {
    
    private static final Logger logger = LoggerFactory.getLogger(LoanRepresentationRequest.class);
    
    protected String baseUrl;
    protected URL url;
    protected ObjectMapper mapper;

    public LoanRepresentationRequest(String baseUrl) {
        this.baseUrl = baseUrl;
	mapper = new ObjectMapper();
	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    
    public LoanRepresentation getLoanRepresentation(int id) {
		logger.debug("Start getLoanRepresentation");
		
		LoanRepresentation loanRepresentation = null;
		
		try {
			url = new URL(baseUrl+"/"+id+".json");
			URLConnection connection = url.openConnection(); 
			loanRepresentation = mapper.readValue(connection.getInputStream(), LoanRepresentation.class);
			logger.debug(loanRepresentation.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.debug("End getLoanRepresentation");
		
		return loanRepresentation;
    }
    
}
