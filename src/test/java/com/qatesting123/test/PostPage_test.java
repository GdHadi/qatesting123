package com.qatesting123.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qatesting123.page.AdminPage;
import com.qatesting123.page.LoginPage;
import com.qatesting123.page.PostPage;

public class PostPage_test {

	@Test
	public void PostPagetest() throws InterruptedException {
	//intiate webdriver
	System.setProperty("webdriver.chrome.driver","H:\\Office\\Training\\Selenium\\Chrome\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();	
	
	driver.manage().window().maximize();
	driver.get("https://qatesting123.wordpress.com/wp-login.php");
	
	//login to dashboard
	LoginPage login = new LoginPage(driver); 
	login.typeUserName();
	login.typePassword();
	login.clickLoginButton();
	
    //accesing post page
	AdminPage click = new AdminPage (driver);
	click.clickExpand();
	click.clickPostIcon();
	click.clickPostPage();

	//checking post button
	PostPage post=new PostPage(driver);	
	post.PostButton();
    System.out.println("Post button is there");
	
	//checking search post
    post.SearchPost();
    System.out.println("Search button is there");
    
    //checking action button
    post.ActionButton();
    System.out.println("Action button is there");
    
    //checking grid title
    post.GridTitle();
    System.out.println("Grid Title is there");
       
    //checking grid title
    post.ActionButton();
    System.out.println("Grid Author is there");
    
    equals(driver.findElement(By.xpath("//*[@id='author']")));
    System.out.println("Postpage successfully test");
    
    //close driver
    driver.quit();
    
	}
	
}
