package Selenium_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     //implicitly wait
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8407919169");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amin@12345");
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
