package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shaikhamin1996@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amin@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		driver.findElement(By.xpath("//div[text()='log in to facebook']"));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='forgotten account']"));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='sign up for facebook'"));
	}

}
