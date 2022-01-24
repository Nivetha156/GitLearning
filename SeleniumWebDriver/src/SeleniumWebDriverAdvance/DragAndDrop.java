package SeleniumWebDriverAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		//method1
		
		//action.dragAndDrop(source, target).build().perform();
		
		
		//method2
		
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		
		//action.clickAndHold(source).moveToElement(target).release(target).build().perform();
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		
	}

}
