package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationtask9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 
		
		txtname.sendKeys("kautham");
		  
		  
		

	}

}
