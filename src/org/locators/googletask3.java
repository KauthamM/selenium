package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletask3 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\eclipse-workspace\\selenium\\driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement txtsearch = driver.findElement(By.name("q"));
		
		txtsearch.sendKeys("GreensTechnology");
		
		
	}
}
