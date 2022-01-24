package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxsRadioButtonsAndSelectboxs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");

		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//CheckBox
		
		//WebElement rememberMeCheckbox = driver.findElement(By.id("user_remember_me"));
		//boolean rmcIsSelected= rememberCheckbox.isSelected();
		
		//click on a check box
		WebElement rememberMeCheckbox = driver.findElement(By.id("user_remember_me"));
		boolean rmcIsSelected = rememberMeCheckbox.isSelected();
		boolean rmcIsdisplyed = rememberMeCheckbox.isDisplayed();
		boolean rmcIsEnabled = rememberMeCheckbox.isEnabled();
		if (rmcIsdisplyed) {
			System.out.println("Checkbox is displyed!");
			if (rmcIsEnabled) {
				System.out.println("Checkbox is Enabled");
				if (rmcIsSelected) {
					System.out.println("Checkbox is Selected");
				} else {
					rememberMeCheckbox.click();
					System.out.println("Checkbox was not checked. I have checked it now!");
				}
			} else {
				System.out.println("Checkbox is not Enabled. Cannot do anything further!");
			}
		} else {
			System.out.println("Checkbox is NOT displyed!!!");
		}
		
		// if (!rmcIsSelected) {
		// rememberCheckbox.click();
		// System.out.println("not selected");
		// }
		// else {
		// System.out.println("selected already");
		// }

		//Radio button
		
		// log into the application
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(1000);

		// navigate to pay bill and Purchase Foreign Currency
		driver.findElement(By.linkText("Pay Bills")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Purchase Foreign Currency")).click();
		
		// ########### working with Radio buttons ##############
		WebElement radiobutton = driver.findElement(By.id("pc_inDollars_false"));
		boolean drbIsSelected = radiobutton.isSelected();
		if(!drbIsSelected) {
			radiobutton.click();
			System.out.println("Selected currency Redio button was not selected. I have selected now!");
		}
		
		
		//Select Box		
		
		WebElement currency=driver.findElement(By.id("pc_currency"));
		Select sel = new Select (currency);
		
		// Select sel1 = new Select(driver.findElement(By.id("pc_currency")));
		// new Select(driver.findElement(By.id("pc_currency"))).selectByVisibleText("Switzerland (franc)");
		
		sel.selectByVisibleText("Hong Kong (dollar)");
		sel.selectByValue("CAD");
		sel.selectByIndex(3);
		
		
		
		
		
		driver.close();
		driver.quit();

	}

}