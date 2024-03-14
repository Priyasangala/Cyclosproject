package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;




public class RegistrationPage extends BasePage {
	public RegistrationPage(WebDriver driver) {
		super(driver);
		
			}
			
			@FindBy (xpath="//input[@id='id_1']")
			WebElement txt_fname;
			
			@FindBy (xpath="//input[@id='id_2']")
			WebElement txt_lname;
			
			@FindBy (xpath="//input[@id='id_3']")
			WebElement txt_email;
			
			@FindBy (xpath="//input[@id='website']")
			WebElement txt_website;
			
			@FindBy (xpath="//label[text()=' Female ']")
			WebElement txt_Gender;
			
			@FindBy (xpath="//button[@id='business_type']")
			WebElement btn_drpdwn;
			
			@FindBy(xpath="//div[@role='listbox']//a[@class='select-option undefined level0 mt-1']")
			List<WebElement>drpdwn;
			
			@FindBy (xpath="//input[@id='id_4']")
			WebElement txt_Mobilephone;
			
			@FindBy (xpath="//input[@id='id_5']")
			WebElement txt_Landlinephone;
			
			 @FindBy (xpath="//span[text()='Next']")
				WebElement btn_next;
			 
			    public void setname() {
				 txt_fname.sendKeys("Bindu");
			    }
			    public void setloginName() {
			    	txt_lname.sendKeys("Priya.B");
			    }
			    public void setEmail() {
			    	txt_email.sendKeys("bindupriya5013@gmail.com");
			    }
			    	public void setwebsite() {
						txt_website.sendKeys("");
					}
					public void setGender() {
					     txt_Gender.click();
					}
					public void withoutselectFromDropdown() {

						btn_drpdwn.click();
						
						List<WebElement>options=(List<WebElement>) driver.findElements(By.xpath("//button[@id='business_type']"));
					       for(WebElement values:drpdwn) {
					    	   if(values.getText().equals("Clothing")) {
					    		   values.click();
					    		  break;
					    		  
					    	   
					    	   }}
					}
					       
						    public void setMobilephone() {
						    	txt_Mobilephone.sendKeys("8549052832");
							}
							public void setLandlinephone() {
								txt_Landlinephone.sendKeys("(201)5550514");
							}
							public void clickNext() {
								btn_next.click();
							}
					
}
