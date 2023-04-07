package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");     //use to open the url
		
		Thread.sleep(5000);   //use to pause or stop the next action that is going to be performed
		
		//driver.close();     //use to close current TAB only
		
		//driver.quit();     //use to close the BROWSER 
		
		String title = driver.getTitle();   //use to get the title of the 
		
		System.out.println(title);
		
		String expectedtitle ="Instagram";
		
		if(title.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Navigated page is correct");
		}
		else {
			System.out.println("Navigated page is incorrect");
		}
		
		System.out.println(driver.getCurrentUrl());    //to get the url of the current page
		Thread.sleep(3000);
		
		driver.manage().window().minimize();      //use to minimize the window
		Thread.sleep(3000);
		
		driver.manage().window().maximize();    //use to maximize the window
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.snapchat.com/");  //use to open the url
		Thread.sleep(3000);
		
		driver.navigate().back();      //use to go to earlier tab
		Thread.sleep(3000);
		
		driver.navigate().forward();   //use to go to forward tab
		Thread.sleep(3000);
		
		driver.navigate().refresh();   //use to refresh the current tab
		Thread.sleep(3000);
		
//		driver.switchTo().newWindow(WindowType.WINDOW);    //use to open a new WINDOW
//		Thread.sleep(3000);
//		
//		driver.switchTo().newWindow(WindowType.TAB);      //use to open the new TAB
//		Thread.sleep(3000);
		
		Dimension d = new Dimension(500, 500);    //object created
		driver.manage().window().setSize(d);      //used to set the SIZE
		
		Thread.sleep(3000);
		
		Point p = new Point(100, 100);             //object created
		driver.manage().window().setPosition(p);   //used to set the POSITION
		
		
	}

}
















