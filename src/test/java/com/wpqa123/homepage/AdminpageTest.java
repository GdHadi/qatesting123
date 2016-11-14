package com.wpqa123.homepage;

//import static org.junit.Assert.*;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminpageTest {

WebDriver driver;

    public void setup(){
	driver = new ChromeDriver();
	driver.get("http://www.yahoo.com");
    }


}
