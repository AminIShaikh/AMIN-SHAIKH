package Selenium_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);
		WebElement option = s.getFirstSelectedOption();
		String text = option.getText();
		System.out.println(text);
		
		
		
		
		//System.out.println(s.getFirstSelectedOption().getText());
	}

}

//getFirstSelectedOption is a select class method 
//getFirstSelectedOption is used to show which element is first selected 
