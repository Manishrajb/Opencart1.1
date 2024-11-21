package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Clickregister extends Commonconstructor
{
	//CONSTRUCTOR
	public Clickregister(WebDriver driver)
	{
		super(driver);
	}
	
	//LOCATOR
	
	@FindBy(xpath = "//span[normalize-space()='My Account']") WebElement myaccount;
	
	@FindBy(xpath = "//a[normalize-space() = 'Register']") WebElement register;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") WebElement login;
		
	//ACTION METHODS
	
	public void clickmyaccount()
	{
		myaccount.click();
	}
	
	public void clickregister()
	{
		register.click();
	}
	
	public void clicklogin()
	{
		login.click();
	}
}
