package Selenium_ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.manage().window().maximize();
		
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(noofrows.size());
		
		List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		System.out.println(noofcells.size());
	}
}
