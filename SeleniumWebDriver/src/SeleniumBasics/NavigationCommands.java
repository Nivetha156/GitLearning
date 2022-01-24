package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://zero.webappsecurity.com/");
		
		//to maximize the window
		driver.manage().window().maximize();

		//backend navigation
		driver.navigate().back();
		
		//forward navigation
		driver.navigate().forward();
		
		//refresh navigation
		driver.navigate().refresh();

		//to open url
		driver.navigate().to("www.facebook.com");

	}

}
