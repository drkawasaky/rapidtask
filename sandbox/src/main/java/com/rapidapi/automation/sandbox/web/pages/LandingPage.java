package com.rapidapi.automation.sandbox.web.pages;

import org.openqa.selenium.WebDriver;

import com.rapidapi.automation.sandbox.web.PageElement;

public class LandingPage extends BasePage {

	private static PageElement startButton = new PageElement("Start button", "//div[@id='start']/button");
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public HelloWorldPage clickStartButton(){
		ops.clickOnPageElement(startButton);
		waitLoading();
		return new HelloWorldPage(driver);
	}
	
	public HelloWorldPage clickStartButtonWaitAjax(){
		ops.clickOnPageElement(startButton);
		if(isAjaxCompleted()) {
			return new HelloWorldPage(driver);			
		}
		System.out.println("Failed to load AJAX on page");
		return null;
	}
	
}
