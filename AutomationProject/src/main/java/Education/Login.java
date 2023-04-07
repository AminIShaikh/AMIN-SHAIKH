package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//Step 1- to declare the element
	
	@FindBy(xpath="//a[@id='login-or-signup']")
	private WebElement loginLink;
	
	@FindBy(xpath="(//input[@class='_1azps1NaN'])[1]")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-1-wb-id-field']")
	private WebElement password;
	
	@FindBy(xpath="//button[@role='button']")
	private WebElement loginButton;
	
	//Step 2-to initialize the variable
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Step 3 - to create a method
	
	public void loginLink() {
		loginLink.click();
	}
	
	public void userName() {
		userName.sendKeys("Abhinavvelocity");                    //Abhinavvelocity //tejaskamdi05
	}
	
	public void password() {
		password.sendKeys("Abhi@1804");                       //Abhi@1804 //MH01by3938
	}
	
	public void loginButton() {
		loginButton.click();
	}
	

	

}
