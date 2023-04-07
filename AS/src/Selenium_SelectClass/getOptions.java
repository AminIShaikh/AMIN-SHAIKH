package Selenium_SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='month']"));
		
		//System.out.println(day.getText());
		
		Select s = new Select(day);
		List<WebElement> option = s.getOptions();
		int size = option.size();
		System.out.println(size);
		
		
		
		
		//System.out.println(s.getOptions().size());
		
	}

}

//getOptions is a select class method
//getOptions will show all the elements present in the list box