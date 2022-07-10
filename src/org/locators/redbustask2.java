package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbustask2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		
		WebElement txtfrom = driver.findElement(By.id("src"));
		
		txtfrom.sendKeys("chennai");
		
		WebElement txtto = driver.findElement(By.id("dest"));
		
		txtto.sendKeys("tuticorin");
		
		
		
		
		
	    
	    
		
		
		
		
	
	}

}
