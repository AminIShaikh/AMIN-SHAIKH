package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenNewWindowTab {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW); //to open the new WINDOW
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);  //to open a new TAB
	}

}
