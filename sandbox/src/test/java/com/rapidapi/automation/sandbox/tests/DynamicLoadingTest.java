package com.rapidapi.automation.sandbox.tests;

import org.junit.Test;

import com.rapidapi.automation.sandbox.AbstractTestCase;
import com.rapidapi.automation.sandbox.web.pages.HelloWorldPage;
import com.rapidapi.automation.sandbox.web.pages.LandingPage;

import junit.framework.Assert;

public class DynamicLoadingTest extends AbstractTestCase{

	@Test
	public void validateHelloWordlPositive(){
		
		System.out.println("*** Starting Test: Validate the Finish Content is equal to 'Hello World!' ***");
		browseToUrl("http://the-internet.herokuapp.com/dynamic_loading/2");
		
		LandingPage landingPage = new LandingPage(driver);
		HelloWorldPage helloWorldPage = landingPage.clickStartButton();
		String contentText = helloWorldPage.getFinishContent();
		Assert.assertEquals("Hello World!", contentText);
		System.out.println("*** Test completed ***");
	}
	
	@Test
	public void validateHelloWordlNegative(){

		System.out.println("*** Starting Test: Validate the Finish Content is NOT equal to 'Hey World!' ***");
		browseToUrl("http://the-internet.herokuapp.com/dynamic_loading/2");
		
		LandingPage landingPage = new LandingPage(driver);
		HelloWorldPage helloWorldPage = landingPage.clickStartButton();
		String contentText = helloWorldPage.getFinishContent();
		Assert.assertEquals("Hey World!", contentText);
		System.out.println("*** Test completed ***");
	}
}
