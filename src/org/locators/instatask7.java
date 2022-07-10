package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instatask7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91807\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");

		WebElement txtloginid = driver.findElement(By.xpath("//input[@type='text']"));
		
		txtloginid.sendKeys("8072553758");
		
	}

}
