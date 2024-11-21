package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends Commonconstructor
{
	//CONSTRUCTOR
	public Register(WebDriver driver)
	{
		super(driver);
	}
	
	//LOCATOR
	
	@FindBy(xpath = "//input[@id='input-firstname']") WebElement txtfirstname;
	@FindBy(xpath = "//input[@id='input-lastname']") WebElement txtlastname;
	@FindBy(xpath = "//input[@id='input-email']") WebElement txtemail;
	@FindBy(xpath = "(//input[@id='input-telephone'])[1]") WebElement txttelephone;
	@FindBy(xpath = "//input[@id='input-password']") WebElement txtpassword;
	@FindBy(xpath = "//input[@id='input-confirm']") WebElement txtconfpassword;
	@FindBy(xpath = "//input[@name='agree']") WebElement txtagree;
	@FindBy(xpath = "//input[@value='Continue']") WebElement txtcontinue;
	@FindBy(xpath = "//h1[normalize-space() = 'Your Account Has Been Created!']") WebElement accountconfirm;
		
	//ACTION METHODS
	
	public void senduname(String uname)
	{
		txtfirstname.sendKeys(uname);
	}
	
	public void sendlname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void sendemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void sendtelephone(String telephone)
	{
		txttelephone.sendKeys(telephone);
	}
	
	public void sendpassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void sendconfpassword(String confpassword)
	{
		txtconfpassword.sendKeys(confpassword);
	}
	
	public void clickagree()
	{
		txtagree.click();
	}
	
	public void clickcontinue()
	{
		txtcontinue.click();
	}
	
	public String accountconfmsg()
	{
		try
		{
			return (accountconfirm.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
}
