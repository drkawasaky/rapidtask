package com.rapidapi.automation.sandbox.web.pages;

import org.openqa.selenium.WebDriver;

import com.rapidapi.automation.sandbox.web.PageElement;

public class HelloWorldPage extends BasePage {

	private static PageElement finishContent = new PageElement("Page Finish content", "//div[@id='finish']/h4");
	
	public HelloWorldPage(WebDriver driver) {
		super(driver);
	}

	public String getFinishContent(){
		System.out.println("Getting the text from the Finish content");
		String finishContentText = ops.getPageElementText(finishContent);
		System.out.println("The text from the content is: " + finishContentText);
		return finishContentText;
	}
	
}
