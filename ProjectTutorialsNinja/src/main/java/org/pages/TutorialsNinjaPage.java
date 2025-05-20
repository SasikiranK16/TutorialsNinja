package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsNinjaPage implements TutorialsNinjaPageHome {

	public WebDriver driver;
	public TutorialsNinjaPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
	private WebElement myAccount;
	@Override
	public void clickMyAccount() {
		// TODO Auto-generated method stub
		myAccount.click();
	}
	@FindBy(css = "a[href='https://tutorialsninja.com/demo/index.php?route=account/register']")
	private WebElement register;
	@Override
	public void clickRegister() {
		// TODO Auto-generated method stub
		register.click();
	}
}
