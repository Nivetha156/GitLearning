package SeleniumWebDriverAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		//create objects of actions class
		Actions act = new Actions(driver);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//identify the elements
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		Thread.sleep(2000);
		
		
		//move the slider
		act.dragAndDropBy(slider, 300, 0);
		Thread.sleep(3000);
		
		
		driver.close();
		driver.quit();

	}

}
