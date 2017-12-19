package com.rapidapi.automation.sandbox.web;

public class PageElement {

	private String description;
	private String xPath;
	
	public PageElement(String description, String xPath) {
		super();
		this.description = description;
		this.xPath = xPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getxPath() {
		return xPath;
	}

	public void setxPath(String xPath) {
		this.xPath = xPath;
	}
	
	
}
