package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hoteltask9 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement txtlogin = driver.findElement(By.id("username"));
		
		txtlogin.sendKeys("kautham");
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		
		txtpassword.sendKeys("8072553758");
		
		
		
		
		
		

	}

}
