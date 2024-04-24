package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task5 extends Basepage{

	public Task5(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//div[text()='Receive QR-code']")
	WebElement qrcode;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Generate QR code']")
	WebElement generateQRcode;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Generate new QR code']")
	WebElement generateNEWQRcode;
	
	public void payuser() {
		payuser.click();
	}
	public void ReceiveQRcode() {
		qrcode.click();
	}
	public void amount() {
		amount.sendKeys("1,00");
	}
	public void generateQRcode() {
		generateQRcode.click();;
	}
	public void generateNEWQRcode() {
		generateNEWQRcode.click();;
	}
	


}
