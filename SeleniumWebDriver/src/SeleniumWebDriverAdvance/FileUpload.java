package SeleniumWebDriverAdvance;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/upload");
		
		WebElement uploadButton = driver.findElement(By.id("file-upload"));
		
		Thread.sleep(2000);
		
		//add a file
		uploadButton.sendKeys("C:\\Users\\Administrator\\Desktop\\Sample.txt");
		
		Thread.sleep(2000);
		
        // click on upload button
        driver.findElement(By.id("file-submit")).click();
        assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "Sample.txt");
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();

	}

}
