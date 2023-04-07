package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		
		WebElement custom = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		boolean result = custom.isDisplayed();
		System.out.println(result);
		
		if(result == true) {
			System.out.println("Custom Radio Button is Displayed");
		}
		else {
			System.out.println("Custom Radio Button is NOT Displayed");
		}
	}

}
