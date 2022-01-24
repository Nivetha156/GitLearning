package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		//add login code 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions action = new Actions(driver);
		
		//identify elements
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement usermgt = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement users = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		//per actions on elements on one by one
		action.moveToElement(admin).build().perform();
		Thread.sleep(2000);
		
		action.moveToElement(usermgt).build().perform();
		Thread.sleep(2000);
		
		action.moveToElement(users).click().build().perform();
		Thread.sleep(2000);
		
		//method 2
	    //action.moveToElement(admin).moveToElement(usermgt).moveToElement(users).click().build().perform();
		
		driver.close();
		driver.quit();
		
	}

}
