package org.bases;

import org.pages.RunnerHome;
import org.testng.annotations.Test;

public class RunnerProjectDriver extends RunnerProBase {

	@Test
	public void testOne() throws Exception {
		RunnerHome home = new RunnerHome(driver);
		home.login("Runer", "Runer");
		home.clickRefferal();
		home.clickDownload();
		home.clickActivated();
	}
	@Test
	public void testTwo() throws Exception {
		
	}
	@Test
	public void testThree() throws Exception {
		
	}
}
