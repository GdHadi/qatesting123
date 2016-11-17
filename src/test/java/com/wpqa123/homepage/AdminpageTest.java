package com.wpqa123.homepage;
import static org.junit.Assert.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminpageTest {
WebDriver driver;

@Before
public void setup(){
	System.setProperty("webdriver.chrome.driver","H:\\Office\\Training\\Selenium\\Chrome\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://qatesting123.wordpress.com/wp-admin");
   }
@Test
public void LoginPage (){
	//WebElement aboutLink =driver.findElement(By.linkText("ABOUT"));
	//assertNotNull("About link is exist", aboutLink );
	
	WebElement logbtnElement = driver.findElement (By.id("wp-submit"));
	assertNotNull("Accessing login page", logbtnElement );
	
    }

@After
public void tearDown(){
	driver.quit();
    }
}
