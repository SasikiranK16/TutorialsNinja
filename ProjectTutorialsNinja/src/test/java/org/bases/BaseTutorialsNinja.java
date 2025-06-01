package org.bases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.customized.methods.CustomizedMethods;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pages.RegisterAccountNinja;
import org.pages.TutorialsNinjaPage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseTutorialsNinja extends CustomizedMethods {
	public TutorialsNinjaPage ninjaPage;
	public Properties properties;
	public FileInputStream fileInputStream;
	public static WebDriver driver;
	public RegisterAccountNinja accountNinja;
	public static ExtentReports extentReports;
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentTest extentTest;
	public static File fs;
	public Properties getPropertyDetails(String name) throws IOException {
		properties = new Properties();
		fileInputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\org\\utils\\"+name+".properties");
		properties.load(fileInputStream);
		return properties;
	}

	public WebDriver optBrowser(String browserName) {
		if (browserName.toLowerCase().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.toLowerCase().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}
		return driver;
	}

	public WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}

	public WebDriver screenMaximize() {
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver commonDeclares(WebDriver driver) throws IOException {
		ninjaPage = new TutorialsNinjaPage(driver);
		accountNinja = new RegisterAccountNinja(driver);
		ExtentReports extentReports = getReports("God");
		
		return driver;
	}

	public static void takeScreenshot(String name) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsrc = new File(System.getProperty("user.dir") + "//imagesScreenshots//"+name+".png");
		FileUtils.copyFile(src, dsrc);
	}

	public void takeFullScreenshot(String name) throws IOException {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "JPEG", new File(System.getProperty("user.dir")
				+ "\\scrennShots\\"+name+".jpeg"));
	}
	

}
