package com.qatesting123.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author nurhadi
 *
 */

public class AdminPage {
	WebDriver driver;
	
    public AdminPage (WebDriver driver){
    	this.driver=driver;
    }
    //public void clickExpand(){
    //driver.findElement(By.xpath("//*[@id='collapse-button']/div")).click(); 	
    //}
    public void clickPostIcon(){
       driver.findElement (By.xpath("//*[@id='menu-posts']/a/div[2]")).click();
    }
    public void clickPageIcon(){
        driver.findElement (By.xpath("//*[@id='menu-pages']/a/div[3]")).click();
     }
    public void clickAvatar(){
        driver.findElement (By.xpath("//*[@id='wp-admin-bar-my-account']/a/img")).click();
     }
    public void clickOut(){
        driver.findElement (By.xpath("//*[@id='wp-admin-bar-user-info']/div/form/button")).click();
     }

}
