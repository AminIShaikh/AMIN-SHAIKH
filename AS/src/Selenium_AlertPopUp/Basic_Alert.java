package Selenium_AlertPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	}

}
//alert is an interface 
//we need to use methods of alert interface to perform actions on alert popup