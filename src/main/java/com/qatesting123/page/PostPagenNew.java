package com.qatesting123.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostPagenNew {
	WebDriver driver;
	
	public PostPagenNew (WebDriver driver){
		this.driver = driver;
		}
		public void titlefield(){
			driver.findElement(By.xpath("//*[@id='title']")).sendKeys("Post Title 1");
		}
		public void postfield(){
			driver.findElement(By.xpath("//*[@id='content_ifr']")).sendKeys("Post Description 1");
		}
		public void cat(){
			driver.findElement(By.xpath("//*[@id='in-category-54']")).click();;
		}
		public void postbutton (){
			driver.findElement(By.xpath("//*[@id='publish']"));
		}
		public void notif (){
			driver.findElement(By.xpath("//*[@id='message']/p"));
		}
        public void clickpostbutton(){
        	driver.findElement(By.xpath("//*[@id='publish']")).click();
        }
        
}
