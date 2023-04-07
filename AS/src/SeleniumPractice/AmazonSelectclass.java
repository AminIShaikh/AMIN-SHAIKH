package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSelectclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://advertising.amazon.com/register?ref_=a20m_us_hnav_rgstr");
		driver.manage().window().maximize();
		
		WebElement select = driver.findElement(By.xpath("//select[@id='da5134a7-4979-49ae-9254-1f3b06d4ec6b']"));
		//Select s = new Select(select);
		//Thread.sleep(5000);
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		Select s = new Select(select);
		s.selectByVisibleText("India");
	}
	

}
