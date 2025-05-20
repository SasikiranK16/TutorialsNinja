package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountNinja implements RegisterAccount{

	public WebDriver driver;
	public RegisterAccountNinja(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "firstname")
	private WebElement firstNam;
	@Override
	public void setFirstName(String name) {
		// TODO Auto-generated method stub
		firstNam.sendKeys(name);
	}
	@FindBy(name = "lastname")
	private WebElement lastNam;
	@Override
	public void setLastName(String lname) {
		// TODO Auto-generated method stub
		lastNam.sendKeys(lname);
	}
	
}
