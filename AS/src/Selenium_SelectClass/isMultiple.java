package Selenium_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);
		boolean multiselected = s.isMultiple();
		
		if (multiselected == true) {
			System.out.println("Multiple options are selected");
		}
		else {
			System.out.println("Single option is selected");
		}
		
	}

}
//is Multiple method is used to validate whether multiple options are selected or a single option is selected