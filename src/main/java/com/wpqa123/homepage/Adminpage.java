package com.wpqa123.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Adminpage {
	//"throws InterruptedException" needed to add waiting time
	public static void main(String[] args) throws InterruptedException {
		//Initialize webdriver
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","H:\\Office\\Training\\Selenium\\Chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
						
		//Open Browser and enter URL
		driver.get("https://qatesting123.wordpress.com/wp-admin");
		
        if (driver.getCurrentUrl().contains("wp-admin")) {
        	System.out.println ("Login page is opened");
        } else {
        	System.out.println ("Failed to open the login page");
        }
		
		//Find login form element
		WebElement userElement = driver.findElement(By.name("log"));
		WebElement passElement = driver.findElement(By.name("pwd"));
		WebElement logbtnElement = driver.findElement (By.id("wp-submit"));
		
		//Enter username and pass
		userElement.sendKeys("qatesting123");
		passElement.sendKeys("qwerty54321");
		
		//submit login form
		logbtnElement.submit();
		
		//Accessing Dashboard
		driver.getPageSource().contains("Dasbor");
		
		if (driver.getPageSource().contains ("Dasbor")) {
			System.out.println("Dashboard is opened");			
		}else{
			System.out.println("Failed to open Dashboard");
		}
		
		//Expand menu
		driver.findElement(By.xpath("//*[@id='collapse-button']/div")).click();
		
		if (driver.getPageSource().contains ("collapse-button")) {
			System.out.println("Menu successfully expanded");			
		}else{
			System.out.println("Failed to expand menu");
		}
				
		//Find and click post
		driver.findElement(By.xpath("//*[@id='menu-posts']/a/div[2]")).click();
		
		if (driver.getPageSource().contains ("menu-posts")) {
			System.out.println("Post menu is opened");			
		}else{
			System.out.println("Failed to open Post menu");
		}	
			
		//Find and click open account element
		driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']")).click();
		
		if (driver.getPageSource().contains ("wp-admin-bar-my-account")) {
			System.out.println("Account icon is there");			
		}else{
			System.out.println("Faied to find Account icon");
		}
		
		//wait for 2 seconds
		Thread.sleep(2000);
				
		//Find and click close button
		driver.findElement(By.xpath("//*[@id='wp-admin-bar-user-info']/div/form/button")).click();

		//Logout 
		driver.get("https://id.wordpress.com/");
		
		if (driver.getCurrentUrl().contains ("wordpress.com")) {
			System.out.println("Successfully Logout");			
		}else{
			System.out.println("Faied to logout");
		}	
		
	    //Close the driver
        driver.quit();
				
	}

}
