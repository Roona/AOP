package com.demo.api1.request.model;

import java.io.Serializable;

import com.demo.api1.response.model.Asset_Inquiry_Response;

public class Asset_Inquiry_Model implements Serializable{
	private static final long serialVersionUID = 1L;
	private String version;
	private String status;
	private String apiname;
	private String serial_number;
	private String ifname;
	public String getIfname() {
		return ifname;
	}
	public void setIfname(String ifname) {
		this.ifname = ifname;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	private Asset_Inquiry_Request asset_inquiry_request;
	private Asset_Inquiry_Response asset_inquiry_response ;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApiname() {
		return apiname;
	}
	public void setApiname(String apiname) {
		this.apiname = apiname;
	}
	public Asset_Inquiry_Request getAsset_inquiry_request() {
		return asset_inquiry_request;
	}
	public void setAsset_inquiry_request(Asset_Inquiry_Request asset_inquiry_request) {
		this.asset_inquiry_request = asset_inquiry_request;
	}
	public Asset_Inquiry_Response getAsset_inquiry_response() {
		return asset_inquiry_response;
	}
	public void setAsset_inquiry_response(
			Asset_Inquiry_Response asset_inquiry_response) {
		this.asset_inquiry_response = asset_inquiry_response;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
