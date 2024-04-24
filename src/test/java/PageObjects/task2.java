package PageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class task2 extends Basepage {
	public task2(WebDriver Driver) {
		super(Driver);
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
	
	@FindBy(xpath="//a[text()=' Scheduled ']")
	WebElement paynow1;
	
	@FindBy(xpath="//input[@id='id_7']")
	WebElement date;
	
	@FindBy(xpath="//textarea[@id='id_6']")
	WebElement des;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//span[text()='Previous']")
	WebElement Previous;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount1;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next1;
	
	@FindBy(xpath="//*[text()='Confirm']")
	WebElement Confirm1;
	
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
	public void paynow1() {
		paynow1.click();
	}
	public void date() {
		date.sendKeys("10-04-2024");
	}
	public void des() {
		des.sendKeys("they pay know");
	}
	public void next() {
		next.click();
	}
	public void Previous() {
		Previous.click();
	}
	public void changeamount()  {
		String text="1,00";
		int n=text.length();
		for(int i=0;i<=n;i++) {
			amount.sendKeys(Keys.BACK_SPACE);
		}
		amount1.sendKeys("2");
	}
	public void next1() {
		next1.click();
	}
	public void Confirm1() {
		Confirm1.click();
	}
	public void print() {
		print.click();
	}
} 


