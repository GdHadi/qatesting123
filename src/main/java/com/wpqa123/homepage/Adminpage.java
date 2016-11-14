package com.wpqa123.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminpage {
	public static void main(String[] args) {
		//Initialize webdriver
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","H:\\Office\\Training\\Selenium\\Chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
						
		//Open Browser and enter URL
		driver.get("https://qatesting123.wordpress.com/wp-admin");
		
		//Find login form element
		WebElement userElement = driver.findElement(By.name("log"));
		WebElement passElement = driver.findElement(By.name("pwd"));
		WebElement logbtnElement = driver.findElement (By.id("wp-submit"));
		
				
		//Enter username and pass
		userElement.sendKeys("qatesting123");
		passElement.sendKeys("qwerty54321");
		
		//submit login form
		logbtnElement.submit();
			
		//Find and click account element
		driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']")).click();
		
		//Find and click logout element
		//driver.findElement(By.xpath("//*[@id='wp-admin-bar-user-info']/div/form/button")).click();
 			
	    //Close the driver for Team
        driver.quit();
				
	}

}
