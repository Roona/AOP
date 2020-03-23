package com.demo.api1;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.api1.request.model.Asset_Inquiry_Model;
import com.demo.api1.request.model.Asset_Inquiry_Request;
import com.demo.api1.response.model.Asset_Inquiry_Response;



@Aspect
@Component

public class API1Aspect {
//get request path variable	
	private Logger mylog = Logger.getLogger(this.getClass());
	Asset_Inquiry_Model asset_inquiry_model = new Asset_Inquiry_Model();
	
	int randomServerPort=8979;
	 final String baseUrl = "http://localhost:"+randomServerPort+"/validateData/test1";
		RestTemplate rt = new RestTemplate();

		
	 
	 @Before("execution(* com.demo.api1.controller.API1Controller.*(..)) && args(request)")
		public void beforeAdvice( JoinPoint joinPoint,Object request) {
		 if(request instanceof  String){
			 mylog.info("PDSM gateway captured request workflow for 'PDSM asset inquiry'  for serial number " +request.toString());
		
			 asset_inquiry_model.setSerial_number(request.toString());
		 }
		 if(request instanceof  Asset_Inquiry_Request){
			 Asset_Inquiry_Request asset_inquiry_request = (Asset_Inquiry_Request) request;
			 asset_inquiry_model.setAsset_inquiry_request(asset_inquiry_request);
			 mylog.info("PDSM Gateway captured request wokflow for 'PDSM Asset Inquiry' for serial number " +asset_inquiry_request.getSerial_number());
		
			 
		 }
		}

		
		
	 @AfterReturning(value="execution(* com.demo.api1.controller.API1Controller.*(..))",returning = "result")
		public void afterAdvice( JoinPoint joinPoint,Object result) {
		 Asset_Inquiry_Response asset_inquiry_response = (Asset_Inquiry_Response) result;
		 if(result instanceof  String){
			 mylog.info("PDSM Gateway captured  response workflow for 'PDSM asset inquiry' for serial number " +asset_inquiry_response.getAsset_inquiry_FS_response().getSerial_number());
			
			 asset_inquiry_model.setSerial_number(result.toString());
		 }
		 if(result instanceof  Asset_Inquiry_Response){
			 mylog.info("PDSM Gateway captured  response workflow 'PDSM asset inquiry' for serial number " +asset_inquiry_response.getAsset_inquiry_FS_response().getSerial_number());
			 asset_inquiry_model.setAsset_inquiry_response(asset_inquiry_response);
			 
		 }
		
		 validateAndSendData();
		 asset_inquiry_model = new Asset_Inquiry_Model();
		}
	 public void validateAndSendData(){
		 
		 asset_inquiry_model.setApiname("PDSM Asset Inquiry");
		 asset_inquiry_model.setIfname("PdsmInquireAsset");
		 asset_inquiry_model.setStatus("Completed");
		 asset_inquiry_model.setVersion("1.0");
		  ResponseEntity<String> response =  rt.postForEntity(baseUrl,asset_inquiry_model,String.class);
		  mylog.info("validation successful for PDSM API ");
		
		 
	 }
	 
	 
}
