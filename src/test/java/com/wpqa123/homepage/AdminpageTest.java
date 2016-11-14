package com.wpqa123.homepage;

//import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminpageTest {
WebDriver driver;

@Before
public void setup(){
	driver = new FirefoxDriver ();
	driver.get("https://qatesting123.wordpress.com/wp-admin");
   }

@Test


}
