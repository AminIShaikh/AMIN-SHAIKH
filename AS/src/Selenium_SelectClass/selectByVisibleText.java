package Selenium_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select m = new Select(month);
		//m.selectByIndex(7);
		//m.selectByValue("8");
		m.selectByVisibleText("Aug");
		
		

	}

}
//select by visible text method is used to select from list box using visible text