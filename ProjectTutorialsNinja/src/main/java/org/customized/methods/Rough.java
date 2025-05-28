package org.customized.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Rough {

	public static Properties properties;
	public static FileInputStream fileInputStream;
	public static FileWriter fileWriter;
	public File file;
	
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
	@Test
	public void testOnes() throws Exception {
//		createPropertyFile("TestOneProp0");
//		createPropertyFile("testings");
//		deleteSpecificFile("testings");
		
	}
	@Test
	public void testName() throws Exception {
//		replaceFileData("bunny","https://www.facebook.com","Firefox");
	}
}
