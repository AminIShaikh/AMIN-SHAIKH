package Selenium_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe_Registration_page {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/iframe/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("Amin");
		driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("Shaikh");
		driver.findElement(By.xpath("//input[@id='vfb-31-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-13-address']")).sendKeys("2268 c ward");
		driver.findElement(By.xpath("//input[@id='vfb-13-address-2']")).sendKeys("somwar peth");
		driver.findElement(By.xpath("//input[@id='vfb-13-city']")).sendKeys("kolhapur");
		driver.findElement(By.xpath("//input[@id='vfb-13-state']")).sendKeys("maharashtra");
		driver.findElement(By.xpath("//input[@id='vfb-13-zip']")).sendKeys("416002");
	
		driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]")).click();
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,5000)");                //scroll down
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='vfb-14']")).sendKeys("shaikhamin1996@gmail.com");
		driver.findElement(By.xpath("//input[@id='vfb-18']")).sendKeys("14/02/2010");
		driver.findElement(By.xpath("//input[@id='vfb-18']")).click();
		
        driver.findElement(By.xpath("//span[@id='select2-vfb-16-hour-container']"));
        JavascriptExecutor scroll1 = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,500)");                //scroll down
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='select2-vfb-16-min-container']"));
	    JavascriptExecutor scroll2 = (JavascriptExecutor)driver;
	    scroll.executeScript("window.scrollBy(0,500)");                //scroll down
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='vfb-19']")).sendKeys("8407919169");
		driver.findElement(By.xpath("//input[@id='vfb-20-0']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-20-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-20-2']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-20-3']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-20-4']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-20-5']")).click();
		
		driver.findElement(By.xpath("//input[@name='vfb-3']")).sendKeys("99");
		
		driver.findElement(By.xpath("//input[@name='vfb-submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
