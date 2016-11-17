
package com.qatesting123.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author nurhadi
 *
 */
public class LoginPage {
	WebDriver driver;

 By username =By.xpath("//*[@id='user_login']");
 By password =By.xpath("//*[@id='user_pass']");
 By loginbutton =By.xpath("//*[@id='wp-submit']");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void typeUserName() {
		driver.findElement(username).sendKeys("qatesting123");
	}
	public void typePassword() {
		driver.findElement(password).sendKeys("qwerty54321");
	}
	public void clickLoginButton() {
		driver.findElement(loginbutton).click();
	}

}
