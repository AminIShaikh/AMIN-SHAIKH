package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.OpenBrowser;
import Education.LogOut;
import Education.Login;
import Education.Progress;
import Education.Teacher;
import Utils.Utility;

public class ValidationClass extends OpenBrowser{
	WebDriver driver;
	Login login;
	Teacher teacher;
	LogOut logout;
	Progress progress;
	int testID;
	
	
	@Parameters("browser")
	
	
	
	@BeforeTest
	public void openBrowser(String browsername) {
		System.out.println(browsername);
		
		if(browsername.equals("Chrome")) {
			driver = OpenChromeBrowser();
		}
		
		if(browsername.equals("Firefox")) {
			driver = OpenFirefoxBrowser();
		}
		
		if(browsername.equals("Edge")) {
			driver = OpenEdgeBrowser();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.khanacademy.org/");
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeClass
	public void beforeclass() {
		
	    login = new Login(driver);
		teacher = new Teacher(driver);
	    progress = new Progress(driver);
		logout = new LogOut(driver);



	}
	
	@BeforeMethod
	public void beforemethod() {
		
		login.loginLink();
		login.userName();
		login.password();
		login.loginButton();
		
	}
	
	@Test
	public void To_verify_the_TeacherPage() {
		
		testID=1;
	
		teacher.teacher();
		String url = driver.getCurrentUrl();
		
		SoftAssert soft = new SoftAssert();    //soft assert
		soft.assertEquals(url, "https://www.khanacademy.org/profile/me/teachers");
		soft.assertAll();
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test
	public void To_verify_the_ProgressPage() {
		testID=2;
		
		progress.progress();
		progress.dateRange(driver);
		progress.courseType(driver);
		progress.activityType(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.khanacademy.org/profile/me/progress");   //hard assert

	}
	

	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.CaptureScreenShot(driver, testID);
		}
		
		logout.profileName();
		logout.logOut();
		
	}
	
	
	@AfterClass
	public void afterclass() {
		
	    login = null;
		teacher = null;
	    progress = null;
		logout = null;
		
	}
	
	@AfterTest
	public void aftertest() {
		
		System.gc();                   
		driver.close();
	}
	

}
