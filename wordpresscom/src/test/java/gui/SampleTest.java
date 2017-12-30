package gui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SampleTest extends TestBase{

	@Test
	public void simpleTrue() throws Exception {
		assertTrue(true);
		webDriver.get(websiteUrl);
		Thread.sleep(5000);
	}
}
