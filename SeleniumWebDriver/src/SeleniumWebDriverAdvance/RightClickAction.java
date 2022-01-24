package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		//############   mouse right click   ##############
		
		//create objects of actions class 
		Actions action = new Actions(driver);
		
		//identify element
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		//right click on button
		action.contextClick(button).build().perform();
		
		//select the option - copy
        //driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
        //Thread.sleep(1000);
      
		//click quit
        driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[7]")).click();
        Thread.sleep(1000);
        

        //switch to alert and get the text
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);

        //close alert
        driver.switchTo().alert().accept();
		
		
		
		
		driver.close();
		driver.quit();

	}

}
