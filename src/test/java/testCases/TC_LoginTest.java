package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.Basetest;
import pageObjects.Clickregister;
import pageObjects.Login;
import pageObjects.Myaccount;

public class TC_LoginTest extends Basetest
{
	@Test(groups = "sanity")
	public void verifyLogin()
	{
		Clickregister cr = new Clickregister(driver);
		cr.clickmyaccount();
		cr.clicklogin();
		
		Login lg = new Login(driver);
		lg.loginEmail(pr.getProperty("email"));
		lg.loginPassword(pr.getProperty("password"));
		lg.loginbutton();
		
		Myaccount myacc = new Myaccount(driver);
		Boolean accverify = myacc.Checklogin();
		
		Assert.assertEquals(accverify, true);
	}
}
