package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// Frames
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(1000);
		WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iframe);
		
		WebElement textarea = driver.findElement(By.id("tinymce"));
		textarea.clear();
		textarea.sendKeys("This is text to enter into iframe");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//Windows
		
		driver.get("https://the-internet.herokuapp.com/windows");
		String pHandle = driver.getWindowHandle();
		System.out.println(pHandle);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println(handles);
					
		//method1
		for(String h: handles)
		{
			System.out.println(h);
			driver.switchTo().window(h);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		
		//method2
		for(String h: handles) {
			System.out.println(h);
			if(h != pHandle) {
				driver.switchTo().window(h);
				System.out.println(driver.getTitle());
			}
		}
		
		
		//to handle multiple windows
		driver.findElement(By.linkText("Click Here")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		//to switch to parent window
		driver.switchTo().window(pHandle);
		
		driver.close();
		driver.quit();
		
			
	}

}
