package com.rapidapi.automation.sandbox.web.pages;

import org.openqa.selenium.WebDriver;

import com.rapidapi.automation.sandbox.web.PageElement;

public class BasePage extends AbstractPage {

	private static PageElement loadingWidget = new PageElement("Loading widget for AJAX process", "//div[@id='loading']");
	
	public BasePage(WebDriver driver) {
		super(driver);
	}

	public void waitLoading(){
		System.out.println("Waiting the Loading widget to disappear");
		ops.waitForElementInvisibility(loadingWidget);
	}
	
	
}
