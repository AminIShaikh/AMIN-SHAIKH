package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_TimeDate {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		Date d = new Date();
		//System.out.println(d);
		String datetime = d.toString();
		System.out.println(datetime);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\ScreenShot\\efg" + datetime + ".png");
		
		FileHandler.copy(source, destination);
		
		
	}

}
