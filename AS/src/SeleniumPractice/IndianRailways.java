package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IndianRailways {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]")).sendKeys("Pune");
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]")).sendKeys("Kolhapur");
		
		WebElement date = driver.findElement(By.xpath("//p-calendar[@id='jDate']"));
		Actions act = new Actions(driver);
		
	}

}
