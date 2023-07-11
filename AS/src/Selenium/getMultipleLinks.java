package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getMultipleLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int size = links.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++) {
			System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
			//System.out.println(links.get(i).getAttribute("href"));

		}
		
	}
}
//this is the common program to get multiple links