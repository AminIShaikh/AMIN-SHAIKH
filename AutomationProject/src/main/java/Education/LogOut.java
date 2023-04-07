package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	@FindBy(xpath="//button[@class='_1s7gp2bm']")
	private WebElement profileName;
	
	@FindBy(xpath="//a[@class='_71vn8x8']")
	private WebElement logOut;
	
	
	
	
	
	public LogOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void profileName() {
		profileName.click();
	}
	
	public void logOut() {
		logOut.click();
	}

}
