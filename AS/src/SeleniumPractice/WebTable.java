package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		
		 List<WebElement> noofrows = driver.findElements(By.xpath("//table[@cellspacing='1']//tr"));
		
		for(int i=1; i<noofrows.size(); i++) {
			
			 List<WebElement> noofcells = driver.findElements(By.xpath("(//table[@cellspacing='1']//tr//td)[1]"));
			 
			 for(int j=1; j<noofcells.size(); j++) {
				 System.out.print(noofcells.get(j).getText()+" ");
			 }
			 System.out.println();
		}
	}
}
