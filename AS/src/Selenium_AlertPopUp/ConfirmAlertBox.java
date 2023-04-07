package Selenium_AlertPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertBox {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();

}
}
//for confirm alert box we can accept or dismiss which depends upon the users
