package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class AssertionsAndVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");

		//############## Assertion #################
		// Validation
		String expectedTitle = "Zero - Personal Banking - Loans - Credit Cards";
		String actualTitle = driver.getTitle();

		//
		// if(actualTitle == expectedTitle) {
		// System.out.println("Pass");
		// } else {
		// System.out.println("Fail");
		// System.out.println(actualTitle);
		// }

		assertEquals(actualTitle, expectedTitle);

		// ############ Verification ################
		
		try {
			String brand = driver.findElement(By.className("brand")).getText();
			assertEquals(brand, "Zero Bank +1");
		}
		catch (AssertionError e) {	
			e.printStackTrace();
		}
		driver.findElement(By.id("searchterm")).sendKeys("fund transfer");
		
		SoftAssert sa = new SoftAssert();
		String brand = driver.findElement(By.className("brand")).getText();
		sa.assertEquals(brand, "Zero Bank +1", "Test failed!\n");
		
		
		sa.assertAll();
		driver.close();
		driver.quit();
		
	}

}
