package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Snapchat {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fsso%3Freferrer%3Dhttps%253A%252F%252Fweb.snapchat.com%252F%253Fref%253Dweb_nav_login_button%2526lang%253Den-US%26client_id%3Dweb-calling-corp--prod");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shaikhamin1996@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amin@1234");
		driver.findElement(By.xpath("//button[@id='loginTrigger']")).click();
	}

}
