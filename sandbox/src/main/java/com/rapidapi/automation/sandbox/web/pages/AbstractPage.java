package com.rapidapi.automation.sandbox.web.pages;

import org.openqa.selenium.WebDriver;

import com.rapidapi.automation.sandbox.web.Operations;

public abstract class AbstractPage {

	protected WebDriver driver;
	protected Operations ops;
	
	public AbstractPage(WebDriver driver) {
		
		this.driver = driver;
		this.ops = new Operations(driver);
	}
	
	public void refreshPage() throws Exception{
		ops.refreshPage();
	}

	public void browserBack(){
		ops.browseBack();
	}
}
