package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Actions action = new Actions(driver);
		
		//identify elements
		WebElement search =  driver.findElement(By.name("q"));
		
		//press enter button on keyboard
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);
		action.build().perform();
				
		//press tab using action class
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		 //multiple actions of key storks
        Action kbEvents = action.keyDown(search, Keys.SHIFT).sendKeys("Java Code Geeks")
                .keyUp(search, Keys.SHIFT).doubleClick().contextClick().build(); // keyDown is for holding the key and keyUp is to release
        kbEvents.perform();
		
		
		
		
		
		driver.close();
		driver.quit();

	}

}
