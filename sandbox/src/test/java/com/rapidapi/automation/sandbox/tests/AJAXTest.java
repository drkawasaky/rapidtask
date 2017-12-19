package com.rapidapi.automation.sandbox.tests;

import org.junit.Test;

import com.rapidapi.automation.sandbox.AbstractTestCase;
import com.rapidapi.automation.sandbox.web.pages.LandingPage;

public class AJAXTest extends AbstractTestCase {
	
	@Test
	public void IsAjaxCompletedTest() {
		System.out.println("*** Starting Test: Validate the Finish Content is equal to 'Hello World!' ***");
		browseToUrl("http://the-internet.herokuapp.com/dynamic_loading/2");
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickStartButtonWaitAjax();
	}
}
