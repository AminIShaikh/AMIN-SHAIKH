package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Code {
	
	@FindBy(xpath="//input[@class='_q92ef6']")
	private WebElement enter;
	
	@FindBy(xpath="//button[@class='_1f0fvyce']")
	private WebElement continues;
	
	@FindBy(xpath="//a[@class='_1mwdd64y']")
	private WebElement back;
	
	
	
	public Code(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void enter() {
		enter.sendKeys("Amin1108");
	}
	
	public void continues() {
		continues.click();
	}
	
	public void back() {
		back.click();
	}
	
	

}
