package Selenium_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));         //object of webdriverwait
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8407919169");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("Amin@012345");
		
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amin@12345");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
