package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithTestNG {
	
	public WebDriver driver;
	
	//clean up
	@AfterTest
	public void cleanUp() {
		driver.close();
		driver.quit();
	}

	//set up
	@BeforeTest
	public void setUp() {
		//set system path browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//open browser
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testCases(){		
		//open url
		driver.get("http://zero.webappsecurity.com/");
		
		//login test cases
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.cssSelector("[value='Sign in']")).click();
	}
}

