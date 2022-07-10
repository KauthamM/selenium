package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktask1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		
		txtusername.sendKeys("kautham");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		
		txtpassword.sendKeys("80725537588");
		
		driver.quit();
		
		
	}

}
