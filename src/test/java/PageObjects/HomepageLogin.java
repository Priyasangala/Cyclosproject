package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HomepageLogin extends Basepage {
	public HomepageLogin(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (id="login-link")
	WebElement btn_loginlink;
	
	public void click_login() {
		btn_loginlink.click();
	}


}
