package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.Basetest;
import pageObjects.Clickregister;
import pageObjects.Login;
import pageObjects.Myaccount;
import utilities.Dataprovider;

public class TC_LoginDDT extends Basetest
{
	@Test(dataProvider = "LoginInData", dataProviderClass = Dataprovider.class)
	public void verifyLogin_DDT(String email, String pwd, String exp)
	{
		Clickregister cr = new Clickregister(driver);
		cr.clickmyaccount();
		cr.clicklogin();
		
		Login lg = new Login(driver);
		lg.loginEmail(email);
		lg.loginPassword(pwd);
		lg.loginbutton();
		
		Myaccount myacc = new Myaccount(driver);
		Boolean accverify = myacc.Checklogin();
		
		if(exp.equalsIgnoreCase("valid"))
		{
			if(accverify == true)
			{
				myacc.clicklogout();
				Assert.assertTrue(true);
			}
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(accverify == true)
			{
				myacc.clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(false);	
			}
		}
		
	}
}
