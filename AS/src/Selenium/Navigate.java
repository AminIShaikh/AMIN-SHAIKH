package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.instagram.com/");     //used to open the URL that is entered
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.jio.com/");          //used to open the URL that is entered
		Thread.sleep(5000);
		
		driver.navigate().back();         //used to navigate backward
		Thread.sleep(5000);
		
		driver.navigate().forward();      //used to navigate backward
		Thread.sleep(5000);
		
		driver.navigate().refresh();      //used to refresh the current web page
	}

}
