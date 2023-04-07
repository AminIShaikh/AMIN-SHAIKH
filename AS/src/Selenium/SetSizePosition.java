package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSizePosition {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.instagram.com/");
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(3000);
		
		Dimension d = new Dimension(300, 300);
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		Point p = new Point(500, 500);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.close();
	}

}
