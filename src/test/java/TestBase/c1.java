package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	public WebDriver driver;
	@Test
	public void setup() {
		driver=new ChromeDriver();
		//driver=new EdgeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
