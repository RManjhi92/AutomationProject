package testCases;

import org.testng.annotations.Test;

import baseObjects.HomePage;
import baseObjects.LoginPage;
import baseObjects.UserRegistration;
import testBase.BaseClass;

public class TestRegistration extends BaseClass {

	
	@Test
	public void testReg() {
	HomePage HP=new HomePage(driver);
	HP.signup();
	UserRegistration Reg=new UserRegistration(driver);
	Reg.enterMail("t@yopmail.com");
	Reg.enterName("Test");
	Reg.clickSignup();
	
	
}
}