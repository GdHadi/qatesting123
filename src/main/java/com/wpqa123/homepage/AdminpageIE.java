package com.wpqa123.homepage;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AdminpageIE {
	public static void main(String[] args) {
		//Initialize webdriver
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver","H:\\Office\\Training\\Selenium\\IE\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		//Open Browser and enter URL
		driver.get("http://www.yahoo.com");
		
	    //Close the driver for Team
        driver.quit();
				
	}

}
