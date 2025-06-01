package org.bases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RunnerProBase {

	public WebDriver driver;
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://runner-react-workbees.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
	}
}
