package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.facebook.com/login.php/");
        
        driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("8407919169");
        
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Amin@1234");
        
        driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//a[text()='forgotten password']")).click();
		
	}

}
