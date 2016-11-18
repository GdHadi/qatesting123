package com.qatesting123.test;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qatesting123.page.AdminPage;
import com.qatesting123.page.LoginPage;

public class AdminPage_test {

	@Test
	public void verifyAdminPage() {
	//initiate driver
	System.setProperty("webdriver.chrome.driver","H:\\Office\\Training\\Selenium\\Chrome\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	//login to Admin page
	driver.manage().window().maximize();
	driver.get("https://qatesting123.wordpress.com/wp-login.php");
	
	LoginPage login = new LoginPage(driver); 
	login.typeUserName();
	login.typePassword();
	login.clickLoginButton();

	if (driver.getPageSource().contains("Dasbor")){
		System.out.println("Dashboard is opened");
		}else{
		System.out.println("Failed to open Dashboard");
		}
	
	AdminPage click = new AdminPage (driver);

	//click.clickExpand();
	//if (driver.getPageSource().contains("collapse-button")) {
	//	System.out.println("Expand icon is there");
	//	}else{
	//	System.out.println("Failed to found Expand icon");	
	//	}
	
	click.clickPostIcon();
	if (driver.getPageSource().contains("menu-posts")) {
	System.out.println("Post icon is there");
	}else{
	System.out.println("Failed to found Post icon");	
	}
	
	click.clickPageIcon();
	if (driver.getPageSource().contains("menu-pages")) {
		System.out.println("Page icon is there");
		}else{
		System.out.println("Failed to found Page icon");	
		}	
	//click.clickPostPage();
	
	click.clickAvatar();
	if (driver.getPageSource().contains("wp-admin-bar-my-account")) {
		System.out.println("Avatar icon is there");
		}else{
		System.out.println("Failed to found Avatar icon");	
		}
	//validate click and logout from admin
	click.clickOut();
	
	//Validate click log out and successfully logout from admin site
	driver.get("https://id.wordpress.com/");

	if (driver.getCurrentUrl().contains ("https://wordpress.com")) {
		System.out.println("Successfully Logout");			
	}else{
		System.out.println("Failed to logout");
	}	

	//close driver
	driver.quit();
	
	}
  } 

