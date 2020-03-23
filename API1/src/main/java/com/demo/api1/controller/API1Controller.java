package com.demo.api1.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.api1.request.model.Asset_Inquiry_Request;
import com.demo.api1.response.model.Asset_Inquiry_FS_Response;
import com.demo.api1.response.model.Asset_Inquiry_Response;


@RestController
@RequestMapping("/api")
public class API1Controller {

	Logger logger = LoggerFactory.getLogger(API1Controller.class);
	int randomServerPort=8878;
	 final String baseUrl1 = "http://localhost:"+randomServerPort+"/api/test2";
	 final String baseUrl2 = "http://localhost:"+randomServerPort+"/api/test3";
		RestTemplate rt = new RestTemplate();
		Asset_Inquiry_Response response = new Asset_Inquiry_Response();
	@PostMapping(value = "/test1")
	public Asset_Inquiry_Response assetInquiryBO(
			@RequestBody Asset_Inquiry_Request asset_Inquiry_Request)
			throws IOException {
		
		
		
		Asset_Inquiry_FS_Response responseFS =  rt.postForObject(baseUrl2,asset_Inquiry_Request,Asset_Inquiry_FS_Response.class);
		response.setAsset_inquiry_FS_response(responseFS);
		return response;
	}

	@RequestMapping(path = "/test/{serial_number}")
	public Asset_Inquiry_Response assetInquiryPV(
			@PathVariable("serial_number") String serial_number,
			HttpServletRequest request) throws IOException {
		
			Asset_Inquiry_FS_Response responseFS =  rt.postForObject(baseUrl1,serial_number,Asset_Inquiry_FS_Response.class);
			response.setAsset_inquiry_FS_response(responseFS);
		return response;
	}

}
