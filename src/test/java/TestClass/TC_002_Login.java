package TestClass;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import TestBase.BaseClassLogin;

public class TC_002_Login extends BaseClassLogin {
	@Test
	public void LoginAccount() throws InterruptedException {
		HomePage Hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		lp.setuser();
		Thread.sleep(3000);
		lp.setpassword();
		Thread.sleep(3000);
		lp.clicksubmit();
	}	
	



}
