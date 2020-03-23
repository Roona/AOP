package com.demo.api1.response.model;

import java.io.Serializable;

public class Asset_Inquiry_Response implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String status;
	private String serial_number;
	private String  asset_tag;
	private Asset_Inquiry_FS_Response asset_inquiry_FS_response;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public Asset_Inquiry_FS_Response getAsset_inquiry_FS_response() {
		return asset_inquiry_FS_response;
	}
	public void setAsset_inquiry_FS_response(
			Asset_Inquiry_FS_Response asset_inquiry_FS_response) {
		this.asset_inquiry_FS_response = asset_inquiry_FS_response;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public String getAsset_tag() {
		return asset_tag;
	}
	public void setAsset_tag(String asset_tag) {
		this.asset_tag = asset_tag;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
