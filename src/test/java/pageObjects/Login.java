package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Commonconstructor
{
	//	CONSTRUCTOR
	public Login(WebDriver driver)
	{
		super(driver);
	}
	
	// LOCATOR

	
	@FindBy(xpath = "//input[@id='input-email']") WebElement txt_email;
	
	@FindBy(xpath = "//input[@id='input-password']") WebElement txt_password;
	
	@FindBy(xpath = "//input[@value='Login']") WebElement btn_login;
	
	// ACTION METHODS
	
	public void loginEmail(String lemail)
	{
		txt_email.sendKeys(lemail);
	}
	
	public void loginPassword(String lpassword)
	{
		txt_password.sendKeys(lpassword);
	}
	
	public void loginbutton()
	{
		btn_login.click();	
	}
}
