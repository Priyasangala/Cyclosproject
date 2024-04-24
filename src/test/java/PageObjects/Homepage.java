package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage{
	public Homepage(WebDriver driver) {
		super(driver);
		
	
	}
	@FindBy (id="register-link")
	WebElement btn_registerLink;
	
	public void click_register() {
		btn_registerLink.click();
	}

	}
 

