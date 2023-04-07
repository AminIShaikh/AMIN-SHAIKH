package Selenium_ActionsClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.album.alexflueras.ro/index.php");
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,500)");                //scroll down
		Thread.sleep(3000);
		
		scroll.executeScript("window.scrollBy(0,-500)");               //scroll up
		Thread.sleep(3000);
		
		scroll.executeScript("window.scrollBy(1000,0)");               //scroll right
		Thread.sleep(3000);
		
		scroll.executeScript("window.scrollBy(-1000,0)");              //scroll left
		Thread.sleep(3000);
	}

}
