package org.tests;

import java.io.IOException;

import org.bases.BaseTutorialsNinja;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NinjaTutorialsCheck extends BaseTutorialsNinja {

	@Test
	public void checkOne() throws Exception {
		ninjaPage.clickMyAccount();
		ninjaPage.clickRegister();
		accountNinja.setFirstName("Hello");
		takeScreenshot();
		takeFullScreenshot();
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
