package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void main(String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\ScreenShot\\Basic.jpeg");
		
		FileHandler.copy(source, destination);
		
			
		//to take multiple screenshot we use for loop
//		for(int i = 1;i<=10;i++) {
//			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File destination = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\ScreenShot\\Basic.jpeg");
//			FileHandler.copy(source, destination);
//		}
		
	}

}
