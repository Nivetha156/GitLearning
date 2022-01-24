package SeleniumWebDriverAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		driver.switchTo().frame(0);
		//identify elements
		WebElement resizer = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Thread.sleep(1000);
		
		//resizing the box 1st time (x and y axis)
		action.dragAndDropBy(resizer, 50, 30).build().perform();
		Thread.sleep(3000);
		
		//resizing 2nd time
		action.moveToElement(resizer).dragAndDropBy(resizer, 20, 25).build().perform();
		Thread.sleep(3000);
		
		
		driver.close();
		driver.quit();

	}

}
