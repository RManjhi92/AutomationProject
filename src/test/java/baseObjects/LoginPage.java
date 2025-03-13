package baseObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement Name;
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement Email;
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement signup_button;
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement enter_mail;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement enter_pass;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_button;
	@FindBy(xpath="//li[10]//a[1]")
	WebElement message;
	
	public void entername(String name) {
		Name.sendKeys(name);
	}
	public void enteremail(String mail) {
		Email.sendKeys(mail);
	}
	public void login() {
		signup_button.click();
	}
	public void enterusermail(String mail) {
		enter_mail.sendKeys(mail);
	}
	public void enterpass(String pass) {
		enter_pass.sendKeys(pass);
	}
	public void clicklogin() {
		login_button.click();
	}
	public String message() {
		return message.getText();
	}
	

}