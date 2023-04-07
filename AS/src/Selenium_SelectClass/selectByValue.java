package Selenium_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByValue {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select s = new Select(day);
		//s.selectByIndex(10);
		s.selectByValue("11");
		//s.selectByVisibleText("11");
		
		
	
		
	}

}
//select by value method is used to select from list box using  value