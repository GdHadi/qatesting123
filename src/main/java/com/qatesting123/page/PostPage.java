package com.qatesting123.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostPage {
	WebDriver driver;
	
	public PostPage (WebDriver driver){
	   this.driver=driver;
	}
	
	public void PostButton (){
		driver.findElement(By.xpath("//*[@id='wpbody-content']/div[3]/h1/a"));
	}
	public void SearchPost (){
		driver.findElement(By.xpath("//*[@id='post-search-input']"));
	}
	public void ActionButton (){
		driver.findElement(By.xpath("//*[@id='doaction']"));
	}
	public void GridTitle(){
		driver.findElement(By.xpath("//*[@id='title']/a/span[1]"));
	}
	public void GridAuthor(){
		driver.findElement(By.xpath("//*[@id='author']"));
	}

	public void clickPostButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id='wpbody-content']/div[3]/h1/a")).click();
	}
}
