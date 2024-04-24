package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepagepayuser  extends Basepage{
	public Homepagepayuser(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath="//a[@id='login-link']")
	WebElement login;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	
	public void click_register() {
		login.click();

	}
	public void username() {
		username.sendKeys("demo ");
	}
	public void password() {
		password.sendKeys("1234");
	}
	public void submit() {
		submit.click();
	}

}
