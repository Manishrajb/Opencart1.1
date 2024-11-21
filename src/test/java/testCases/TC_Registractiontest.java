package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.Basetest;
import pageObjects.Clickregister;
import pageObjects.Register;

public class TC_Registractiontest extends Basetest
{
	
	@Test(groups = "regression")
	public void verify_registraction()
	{
		Clickregister reg = new Clickregister(driver);
		reg.clickmyaccount();
		reg.clickregister();
		
		
		Register regone = new Register(driver);
		regone.senduname("Manish");
		regone.sendlname("Raj");
		regone.sendemail(randumstring()+"@gmail.com");
		regone.sendtelephone("9899900");
		regone.sendpassword("pass123");
		regone.sendconfpassword("pass123");
		regone.clickagree();
		regone.clickcontinue();
		
		String verify = regone.accountconfmsg();
		Assert.assertEquals(verify, "Your Account Has Been Created!");
	}
}
