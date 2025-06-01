package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RunnerHome {

	public WebDriver driver;

	public RunnerHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input css-9jacqo']")
	private WebElement userNameFiled;
	@FindBy(xpath = "//*[@type='password']")
	private WebElement passwordFiled;
	@FindBy(xpath = "(//*[@type='button'])[2]")
	private WebElement signIn;
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-10vyf6v']")
	private WebElement visible;
	@FindBy(xpath = "//*[@alt='Referrals']")
	private WebElement refferal;
	@FindBy(xpath = "(//*[@type='button'])[5]")
	private WebElement activated;
	@FindBy(xpath = "(//*[@type='button'])[6]")
	private WebElement downloaded;
	
	public void login(String uname, String passcode) {
		userNameFiled.sendKeys(uname);
		passwordFiled.sendKeys(passcode);
		for(int i=1;i<=4;i++) {
		visible.click();	
		}
		signIn.click();
	}
	public void clickActivated() {
		activated.click();
	}
	public void clickDownload() {
		downloaded.click();
	}
	public void clickRefferal() {
		refferal.click();
	}
}
