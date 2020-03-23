package com.demo.api1.request.model;

import java.io.Serializable;

public class Asset_Inquiry_Request implements Serializable{
	private static final long serialVersionUID = 1L;
	private String serial_number;
	private String fedex_part_number;
	private String model;
	private String model_category;
	private String comments ;
	private String location_code;
	private String asset_tag;
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public String getFedex_part_number() {
		return fedex_part_number;
	}
	public void setFedex_part_number(String fedex_part_number) {
		this.fedex_part_number = fedex_part_number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel_category() {
		return model_category;
	}
	public void setModel_category(String model_category) {
		this.model_category = model_category;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getLocation_code() {
		return location_code;
	}
	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}
	public String getAsset_tag() {
		return asset_tag;
	}
	public void setAsset_tag(String asset_tag) {
		this.asset_tag = asset_tag;
	}
	
}
