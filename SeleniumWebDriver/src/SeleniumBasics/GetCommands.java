package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to load url
		driver.get("http://zero.webappsecurity.com/");
		
		//to print title
		System.out.println(driver.getTitle());

		//to print page source
		System.out.println(driver.getPageSource());

		//to get current url
		System.out.println(driver.getCurrentUrl());

		//2 (Another way)
		// String url=driver.getCurrentUrl();
		// System.out.println(url);

		//get text
		String header = driver.findElement(By.id("money_map_link")).getText();
		System.out.println(header);
		
		driver.navigate().to("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.name("submit")).click();
		
		String errormsg = driver.findElement(By.xpath("//form[@id='login_form']/div[1]")).getText();
		System.out.println(errormsg);

		//get attribute type
		WebElement passbox = driver.findElement(By.name("user_password"));
		String typeOfBox = passbox.getAttribute("type");
		System.out.println(typeOfBox);
		
		System.out.println(passbox.getAttribute("class"));

		//to get attribute class
		System.out.println(passbox.getClass());		

		driver.close();
		driver.quit();

	}

}
