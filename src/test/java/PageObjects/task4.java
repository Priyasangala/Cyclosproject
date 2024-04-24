package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class task4 extends Basepage{

	public task4(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//input[@placeholder='Type to search']")
	WebElement book;
	
	@FindBy(xpath="//a[@class='select-option autocomplete-option-0']")
	WebElement Emma;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount;
	
	@FindBy(xpath="(//button [@type='button'])[3]")
	WebElement paynow;
	
	@FindBy(xpath="//a[text()=' Recurring payments ']")
	WebElement Recurring;

	@FindBy(xpath="//label[text()=\" Future date \"] ")
	WebElement Firstoccurance;
	
	@FindBy(xpath="//input[@id=\"id_11\"]")
	WebElement Firstoccurancedate;
	
	@FindBy(xpath="//label[text()=\" Fixed number of occurrences \"]")
	WebElement  Fixednumberofoccurrences ;
	
	@FindBy(xpath="//input[@class=\"form-control w-100 text-right ng-untouched ng-pristine ng-invalid\"]")
	WebElement  Numberofoccurences ;
	
	@FindBy(xpath="//div[text()='Months']")
	WebElement months;
	
	@FindBy(xpath="//a[text()=' Weeks ']")
			
	WebElement weeks;
	
	
	
	@FindBy(xpath="//textarea[@id='id_6']")
	WebElement des;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//*[text()='Confirm']")
	WebElement Confirm;
	
	@FindBy(xpath="//div[text()='Print']")
	WebElement print;
	
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
		amount.sendKeys("1,00");
	}
	public void paynow() {
		paynow.click();
	}
	public void Recurring() {
		Recurring.click();
	}
	public void futuredate() {
		Firstoccurance.click();
	}
	public void date() {
		Firstoccurancedate.sendKeys("20-04-2024");
	}
	public void Fixednumberofoccurrences () {
		Fixednumberofoccurrences .click();
	}
	
	public void  Numberofoccurences() {
		 Numberofoccurences.sendKeys("5");
	}
	public void months() {
		months.click();
	}
	public void weeks() {
		weeks.click();
	}
	
	public void des() {
		des.sendKeys("they pay know");
	}
	public void next() {
		next.click();
	}
	public void Confirm() {
		Confirm.click();
	}
	public void print() {
		print.click();
	}
}


