package com.test.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginpage {
	
	
public WebDriver driver;
 
 
@BeforeClass
public void setup(){
	
	  System.setProperty("webdriver.chrome.driver", "C:\\java automation\\chromedriver.exe");
	  driver=new ChromeDriver();
		String url="https://wynisco-proshop.netlify.app/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	
}

@Test
public void title(){
	//driver.navigate().to("https://wynisco-proshop.netlify.app/");
	System.out.println(driver.getTitle());
}

@Test
public void login(){
	System.out.println("click on sign in" );
	//driver.get("https://wynisco-proshop.netlify.app/login/");
	driver.findElement(By.xpath("//a[contains(text(),' Sign In')]")).click();
	System.out.println("enter email" );
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
	 System.out.println("enter password");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Wynisco@123");
	System.out.println("click on sign in ");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
}
	  
@AfterClass

	  public void close(){
			 driver.close();
	  }
  }
	
	
	
	
	
	


