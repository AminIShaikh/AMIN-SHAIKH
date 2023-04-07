package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMultipleLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//link"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getAttribute("href"));
		}
		
	}

}
