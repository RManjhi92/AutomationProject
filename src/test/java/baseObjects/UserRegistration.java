package baseObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistration extends BasePage {


public UserRegistration(WebDriver driver) {
	super(driver);
}

@FindBy(xpath="//input[@placeholder='Name']")
WebElement enter_name;

@FindBy(xpath="//input[@data-qa='signup-email']")
WebElement enter_mail;

@FindBy(xpath="//button[@type='submit']")
WebElement click_signup;



public void enterName(String name) {
	enter_name.sendKeys(name);
}
public void enterMail(String mail) {
	enter_mail.sendKeys(mail);
}
public void clickSignup() {
	click_signup.click();
}



}
