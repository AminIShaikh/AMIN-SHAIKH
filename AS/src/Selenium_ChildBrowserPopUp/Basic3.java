package Selenium_ChildBrowserPopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://qavalidation.com/");
		
		driver.findElement(By.xpath("//a[@id='default-btn-b3e6bb53916424a5f3e6a73b1e76d865']")).click();
		
		//driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[1]"));
		
		Set<String> handle = driver.getWindowHandles();
		ArrayList <String> al = new ArrayList <String> (handle);
		String cb = al.get(1);
		driver.switchTo().window(cb);	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--text yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m ']")).click();

	}
}
  