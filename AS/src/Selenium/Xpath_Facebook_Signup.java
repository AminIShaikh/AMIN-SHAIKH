package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Facebook_Signup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Amin");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shaikh");
		
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("8407919169");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amin@1234");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByValue("11");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByValue("1996");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
	}

}
