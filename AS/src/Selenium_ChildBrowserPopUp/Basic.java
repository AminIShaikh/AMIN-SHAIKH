package Selenium_ChildBrowserPopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
         Set<String> handles = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(handles);
		
		String cbadd = al.get(1);// child browser address
		
		driver.switchTo().window(cbadd);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
	
		
	}

}
