package org.customized.methods;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Rough {

	public static Properties properties;
	public static FileInputStream fileInputStream;
	public static FileWriter fileWriter;
	public static File file;
	public static WebDriver driver;
	public static TakesScreenshot screenshot;
	public static ExtentReports extentReports;
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentTest extentTest;
	
	public static void replaceFileData(String name,String urlLink,String browserName) throws IOException {
		properties = new Properties();
		String filePath = System.getProperty("user.dir")+"//src//main//java//org//utils//"+name+".properties";
		fileInputStream = new FileInputStream(filePath);
		properties.load(fileInputStream);
		fileWriter = new FileWriter(filePath);
		fileWriter.write("url:"+urlLink);
		fileWriter.write(System.lineSeparator());
		fileWriter.write("browser:"+browserName);
		fileWriter.close();
		System.out.println("Successfully Inserted!");
		
	}
	public void createPropertyFile(String fileName) throws IOException {
		file = new File(System.getProperty("user.dir")+"//src//main//java//org//utils//"+fileName+".properties");
		file.createNewFile();
		System.out.println("File Created!");
	}
	public void deleteSpecificFile(String fileName) {
		file = new File(System.getProperty("user.dir")+"//src//main//java//org//utils//"+fileName+".properties");
		file.delete();
		System.out.println("File Deleted Successfully!!");
	}
	public static ExtentReports getReports(String testName) throws IOException {
		extentReports = new ExtentReports();
		file = new File(System.getProperty("user.dir")+"//reports//Extents//"+testName+".html");
		extentSparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(extentSparkReporter);
//		createTest(testName);
//		extentTest.addScreenCaptureFromPath(System.getProperty("user.dir")+"//imagesScreenshots//one.png");
//		attachPicToTest(testName);
		extentReports.flush();
		Desktop.getDesktop().browse(file.toURI());
		return extentReports;
	}

	public static ExtentTest createTest(String text) {
		extentTest = extentReports.createTest(text);
		extentTest.log(Status.PASS, text);
		return extentTest;
	}
	public static ExtentTest attachPicToTest(String name) {
		extentTest.addScreenCaptureFromPath(System.getProperty("user.dir")+"//imagesScreenshots//"+name+".png");
		return extentTest;
	}
	
	@Test
	public void testOnes() throws Exception {
//		createPropertyFile("TestOneProp0");
//		createPropertyFile("testings");
//		deleteSpecificFile("testings");
//		getReports("Hello,World!!");
		
	}
	@Test
	public void testName() throws Exception {
//		replaceFileData("bunny","https://www.facebook.com","Firefox");
	}
}
