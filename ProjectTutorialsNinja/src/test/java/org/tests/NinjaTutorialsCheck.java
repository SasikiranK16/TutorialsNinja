package org.tests;

import java.io.IOException;

import org.bases.BaseTutorialsNinja;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NinjaTutorialsCheck extends BaseTutorialsNinja {

	@Test
	public void checkOne() throws Exception {
		ninjaPage.clickMyAccount();
		ninjaPage.clickRegister();
		accountNinja.setFirstName("Hello");
//		takeScreenshot("testOne");
//		takeFullScreenshot("FullScreenOne");
		accountNinja.setLastName("World");
		extentReports();
		
	}
	
	@BeforeSuite
	public void launch() throws IOException {
		getPropertyDetails();
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		optBrowser(properties.getProperty("browser"));
		getUrl(properties.getProperty("url"));
		commonDeclares(driver);
		screenMaximize();
	}
	
}
