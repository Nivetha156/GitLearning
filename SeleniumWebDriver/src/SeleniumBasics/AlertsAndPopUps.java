package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		
		//normal alert
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(1000);
		Alert jsAlert = driver.switchTo().alert();
		String alertText = jsAlert.getText();
		System.out.println(alertText);
		jsAlert.accept();
		
		String resultText1 = driver.findElement(By.id("result")).getText();
		
		assertEquals(resultText1,"You successfully clicked an alert","Failed");
		System.out.println(resultText1);
		
		
		//confirm alert
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(1000);
		Alert jsConfirm = driver.switchTo().alert();
		String confirmText = jsConfirm.getText();
		System.out.println(confirmText);
		jsConfirm.dismiss();
		String resultText2 = driver.findElement(By.id("result")).getText();
		assertEquals(resultText2,"You clicked: Cancel","Failed");
		System.out.println(resultText2);
		
		
		//prompt alert
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(1000);
		Alert jsPrompt = driver.switchTo().alert();
		Thread.sleep(1000);
		jsPrompt.sendKeys("abc");
		Thread.sleep(1000);
		String promptText = jsPrompt.getText();
		System.out.println(promptText);
		jsPrompt.accept();
		String resultText3 = driver.findElement(By.id("result")).getText();
		assertEquals(resultText3,"You entered: abc","Failed");
		System.out.println(resultText3);
		
		
		driver.close();
		driver.quit();
	}

}
