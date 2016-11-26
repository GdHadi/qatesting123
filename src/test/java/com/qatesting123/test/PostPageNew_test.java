package com.qatesting123.test;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qatesting123.page.AdminPage;
import com.qatesting123.page.LoginPage;
import com.qatesting123.page.PostPage;
import com.qatesting123.page.PostPagenNew;

public class PostPageNew_test {

	@Test
	public void test() {
		//intiate webdriver
		System.setProperty("webdriver.chrome.driver", "H:\\Office\\Training\\Selenium\\Chrome\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		
	    //maxize window
		driver.manage().window().maximize();
		driver.get("https://qatesting123.wordpress.com/wp-login.php");
		System.out.println("Accessing login page");
		
		//login to dashboard
		LoginPage login = new LoginPage (driver);
		login.typeUserName();
		login.typePassword();
		login.clickLoginButton();
		System.out.println("Login to Dashboard");
		
	    //accesing post page
		AdminPage click = new AdminPage (driver);
		click.clickExpand();
		click.clickPostIcon();
		click.clickPostPage();
		System.out.println("Accessing post page");
		
		//opening new post
		PostPage newpost = new PostPage (driver);
		newpost.clickPostButton();
		System.out.println("Opening new post page");
			
	   //posting new post
		PostPagenNew posting = new PostPagenNew(driver);
		posting.titlefield();
	    posting.postfield();
        posting.cat();
		posting.clickpostbutton();
		System.out.println("Successfully posting");
		
	  //message
	    //posting.notif();
	  
	  //quit driver
		driver.quit();
		
	}

}
