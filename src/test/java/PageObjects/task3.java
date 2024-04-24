package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class task3 extends Basepage{

	public task3(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//input[@placeholder='Type to search']")
	WebElement book;
	
	@FindBy(xpath="//a[@class='select-option autocomplete-option-0']")
	WebElement Emma;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement amount;
	
	@FindBy(xpath="(//button [@type='button'])[3]")
	WebElement paynow;
	
	@FindBy(xpath="//a[text()=' Monthly installments ']")
	WebElement paynow1;
	
	@FindBy(xpath="//input[@type='number']")
	WebElement instalement;
	
	@FindBy(xpath="//textarea[@id='id_6']")
	WebElement des;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//*[text()='Confirm']")
	WebElement Confirm;
	
	
	
	public void payuser() {
		payuser.click();
	}
	public void book() {
		book.sendKeys("an");
	}
	public void Emma() {
		Emma.click();
	}
	public void amount() {
		amount.sendKeys("200,00");
	}
	public void paynow() {
		paynow.click();
	}
	public void paynow1() {
		paynow1.click();
	}
	
	public void instalements() { 
		instalement.sendKeys("5");
	}
	public void des() {
		des.sendKeys("amount paid");
	} 
	public void next() {
		next.click();
	}
	public void Confirm() {
		Confirm.click();
	} 
}
