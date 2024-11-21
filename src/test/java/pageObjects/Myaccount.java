package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccount extends Commonconstructor
{
	
	//CONSTRUCTOR
	
	public Myaccount(WebDriver driver)
	{
		super(driver);
	}
	
	//LOCATOR
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']") WebElement Myacc;
	
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']") WebElement btn_logout;
	
	//ACTION METHODS
	
	public Boolean Checklogin()
	{
		try
		{
			return Myacc.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clicklogout()
	{
		btn_logout.click();
	}
}
