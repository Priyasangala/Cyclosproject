package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
		
		@FindBy (xpath="//input[@placeholder='User']")
		WebElement txt_User;
		
		@FindBy (xpath="//input[@placeholder='Password']")
		WebElement txt_password;
		
		@FindBy (xpath="//span[text()='Submit']")
		WebElement btn_Submit;
		
		public void setuser() {
			txt_User.sendKeys("demo");
		}
		public void setpassword() {
			txt_password.sendKeys("1234");
		}
		public void clicksubmit() {
			btn_Submit.click();
		}
			
  
{

	
		

		}
			
			
		}
			
 


