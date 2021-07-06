package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      
	      System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );

	      WebDriver driver = new ChromeDriver();
	      
	      String url = "https://www.facebook.com/";
	      driver.get(url);
	      
	driver.findElement(By.name("email")).sendKeys("zamankabir@yahoo.com");      
	driver.findElement(By.name("pass")).sendKeys("Tanishatayma1");   
	
    //Thread.sleep(10000);	
	
    driver.findElement(By.name("login")).click(); 
	}

}
