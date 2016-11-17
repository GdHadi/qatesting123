package com.qatesting123.test;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qatesting123.page.LoginPage;

public class LoginPage_test {

	@Test
	public void verifyValidLogin() {
		//initiate driver
		System.setProperty("webdriver.chrome.driver","H:\\Office\\Training\\Selenium\\Chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://qatesting123.wordpress.com/wp-login.php");
		//login process
		LoginPage login=new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		login.clickLoginButton();
		
		if (driver.getPageSource().contains ("Dasbor")) {
			System.out.println("Dashboard is opened");			
		}else{
			System.out.println("Failed to open Dashboard");
		}
		
		driver.quit();
		
	}
}
