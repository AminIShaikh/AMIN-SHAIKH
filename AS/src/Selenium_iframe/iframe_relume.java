package Selenium_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframe_relume {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
        driver.get("https://webflow.com/made-in-webflow/website/relume-cloneable");
		
        WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Relume Website Cloneable']"));
        
        driver.switchTo().frame(iframe);
        
       
     //   driver.findElement(By.xpath("//a[@class='fixed-cta migration w-inline-block']")).click();
        

        driver.findElement(By.xpath("//a[@class='button secondary small w-button']")).click();
        driver.switchTo().defaultContent();
}
}