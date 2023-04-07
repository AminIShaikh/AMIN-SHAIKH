package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select s = new Select(day);
		//s.selectByIndex(10);
		s.selectByValue("11");
		//s.selectByVisibleText("11");
		
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select m = new Select(month);
		//m.selectByIndex(7);
		//m.selectByValue("8");
		m.selectByVisibleText("Aug");
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select y = new Select(year);
		//y.selectByValue("1996");
		y.selectByValue("1996");
		
	}

}
