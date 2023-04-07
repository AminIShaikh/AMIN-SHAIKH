package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Courses {
	
	//variable declaration
	@FindBy(xpath="//button[@class='_12iepmsr']")
	private WebElement editCourses;
	
	@FindBy(xpath="//a[@id='uid-popover-1-wb-id-anchor']")
	private WebElement start;
	
	@FindBy(xpath="//div[text()='Counting']")
	private WebElement counting;
	
	@FindBy(xpath="//div[text()='Addition and subtraction intro']")
	private WebElement addSubIntro;
	
	@FindBy(xpath="//div[text()='Place value (tens and hundreds)']")
	private WebElement placeValue;
	
	@FindBy(xpath="//div[text()='Addition and subtraction within 20']")
	private WebElement addSub20; 
	
	@FindBy(xpath="//div[text()='Addition and subtraction within 100']")
	private WebElement addSub100;
	
	@FindBy(xpath="//div[@class='_ybk80m']")
	private WebElement addCourse;
	
	
	
	
	//Variable initialization
	public Courses(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//method creation
	public void editCourses() {
		editCourses.click();
	}
	
	public void start() {
		start.click();
	}
	
	public void counting() {
		counting.click();
	}
	
	public void addSub() {
		addSubIntro.click();
	}
	
	public void placeValue() {
		placeValue.click();
	}
	
	public void addSub20() {
		addSub20.click();
	}
	
	public void addSub100() {
		addSub100.click();
	}
	
	public void addCourse() {
		addCourse.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
