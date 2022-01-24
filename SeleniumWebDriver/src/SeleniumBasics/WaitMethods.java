package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
			
		
		WebDriverWait ewait = new WebDriverWait(driver, 5);
		ewait.until(ExpectedConditions.titleContains("Zero - Account Summary") );
		
		driver.close();
		
		WebDriverWait eWait = new WebDriverWait(driver, 5); 
		eWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2[text()='Make payments to your saved payees']")), "Make payments to your saved payees"));



		
		driver.quit();
		
		
		
	}

}
