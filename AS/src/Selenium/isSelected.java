package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		
		male.click();
		
		boolean result = male.isSelected();
		System.out.println(result);
		
		if (result == true) {
			System.out.println("Radio button is selected");
		}
		else {
			System.out.println("Radio button is NOT selected");
		}
		
	}

}
