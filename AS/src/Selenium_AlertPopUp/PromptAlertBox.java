package Selenium_AlertPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		
		Thread.sleep(3000);
	
        driver.switchTo().alert().sendKeys("Yes");
        
		Thread.sleep(3000);

        driver.switchTo().alert().accept();
        
        
//		
//        Alert alt = driver.switchTo().alert();
//		alt.sendKeys("yes");
//		alt.accept();
		
	}

}
