package Selenium_ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableElement {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.manage().window().maximize();
		
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		for(int i=1; i<noofrows.size(); i++) {
		List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
		
		for(int j=0; j<noofcells.size(); j++) {
			System.out.print(noofcells.get(j).getText()+" ");
		}
		System.out.println();
		}
	} 
}
