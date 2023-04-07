package Education;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress {
	
	@FindBy(xpath="//a[@data-test-id='side-nav-progress']")
	private WebElement progress;

	@FindBy(xpath="//button[@data-test-id='date-range-filter']")
	private WebElement dateRange;
	
	@FindBy(xpath="//button[@data-test-id='course-type-filter']")
	private WebElement courseType;
	
	@FindBy(xpath="//button[@data-test-id='activity-type-filter']")
	private WebElement activityType;
	
	
	
	
	public Progress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void progress() {
		progress.click();
	}
	
	public void dateRange(WebDriver driver) {
		dateRange.click();
		Actions act =new Actions(driver);
		WebElement date = driver.findElement(By.xpath("//span[text()='Last 30 days']"));
		act.click(date).perform();
	}
	
	public void courseType(WebDriver driver) {
		courseType.click();
		Actions act =new Actions(driver);
		WebElement content = driver.findElement(By.xpath("//span[text()='Course mastery goals']"));
		act.click(content).perform();
	}
	
	public void activityType(WebDriver driver) {
		activityType.click();
		Actions act =new Actions(driver);
		WebElement activity = driver.findElement(By.xpath("//span[text()='Quizzes']"));
		act.click(activity).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

