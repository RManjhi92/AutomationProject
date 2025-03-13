package baseObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
	WebElement signup_login;

	public void signup() {
		signup_login.click();
	}
	

}
