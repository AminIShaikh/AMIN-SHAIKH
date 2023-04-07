package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login.php/");
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("8407919169");
		
		driver.findElement(By.xpath("//input[contains(@type,'password')][1]")).sendKeys("Amin@123");
		
		driver.findElement(By.xpath("//button[@value='1'][1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?'][1]")).click();		
		
		driver.findElement(By.xpath("//a[@role='button'][1]")).click();
		
		driver.findElement(By.xpath("//a[@role='button'][1]")).click();
		
		driver.close();
	}

}
