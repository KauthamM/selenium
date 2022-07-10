package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfctask5 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
	
		WebElement txtid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		txtid.sendKeys("kauthamM123");
		
		
		
		
	}

}
