package org.customized.methods;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class CustomizedMethods extends Rough {

	public Properties properties;
	public FileInputStream fileInputStream;
	public File file;

	public Properties selectPropertyName(String textName) throws IOException {
		properties = new Properties();
		fileInputStream = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//org//utils//" + textName + ".properties");
		properties.load(fileInputStream);
		return properties;
	}

	public String getInformation(String name) {
		return properties.getProperty(name);
	}

	public Properties retriveInfoFromMultipleFiles(String textName, String reqName) throws IOException {
		properties = new Properties();
		fileInputStream = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//org//utils//" + textName + ".properties");
		properties.load(fileInputStream);
		System.out.println(getInformation(reqName));
		return properties;
	}

	@Test
	public void testName() throws Exception {
		selectPropertyName("Prop");
		System.out.println(getInformation("url"));
		System.out.println(getInformation("browser"));
		retriveInfoFromMultipleFiles("bunny", "url");
		replaceFileData("Prop", "https://www.atozmp3.com","msedge");
		retriveInfoFromMultipleFiles("Prop","browser");
	}
}
