package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseObjects.HomePage;
import baseObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test
	public void testlogin() {
		
		
		HomePage HP=new HomePage(driver);
		Assert.assertEquals(driver.getTitle(),"Automation Exercise");
		HP.signup();
		
		LoginPage LP=new LoginPage(driver);
		LP.enterusermail("r@yopmail.com");
		LP.enterpass("ZXCasd@789");
		LP.clicklogin();
		String M=LP.message();
		System.out.println(M);
		Assert.assertEquals(M,"Logged in as Test");
		
	}

}
