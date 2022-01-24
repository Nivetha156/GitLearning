package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		
		//class name
		driver.findElement(By.className("search-query")).sendKeys("mano banking");
		
		//id
		driver.findElement(By.id("signin_button")).click();
		
		//name
		driver.findElement(By.name("user_login")).sendKeys("username");
		
		//link Text
		//driver.findElement(By.linkText("Forgot your password ?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.linkText("Zero Bank")).click();
		
		
		//$$$$$$$$$$ CSS Selector$$$$$$$$$$$
		
		// by id css = #idvalue
		driver.findElement(By.cssSelector("#user_login")).sendKeys("username");
		
		
		//by attribute css=[attribute=value]
		driver.findElement(By.cssSelector("[type = 'password']")).sendKeys("password");
		
		//by class css = .classname
		driver.findElement(By.cssSelector(".search-query")).sendKeys("fund transfer");
		
		// by tag CSS= tag
		driver.findElement(By.cssSelector("button")).click();
		
		
		
		//by tag id-- css=tag#id
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("username");
		
		//by tag+class-- css= tag.classname
		driver.findElement(By.cssSelector("i.icon-question-sign")).click();
		
		//tag and attribute= tag[attribute=value]
		driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys("password");
		
		
		//================by tag+id+attribute-------tag#id[attribute=value]
		driver.findElement(By.cssSelector("input#user_remember_me[name='user_remember_me']")).click();
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("details-buton")).click();
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Pay Bills")).click();
		
		//======== By tag+class+attribute --- css = tag.classname[attribute=value]
        driver.findElement(By.cssSelector("input.span1[required='required']")).sendKeys("90");
		
		//========= by tag+class+id---- css=tag.classname#id
		driver.findElement(By.cssSelector("input.span4#sp_description")).sendKeys("pay bill for electriity");
		
		//======== By tag+class+id+attribute --- css = tag.classname#id[attribute=value]
        WebElement amountbox = driver.findElement(By.cssSelector("input.span1#sp_amount[type='text']"));
        amountbox.clear();
        amountbox.sendKeys("50");
		
		//---------============================--------------------------------------========================
		// XPATH
		
        //Absolute path
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]"));
		
		//tag+attribute = //tag[@attribute='value']
		driver.findElement(By.xpath("//imput[@name='user_login']")).sendKeys("username");
		
		//relative path from chropath
		driver.findElement(By.xpath("//button[@id='signin_button']")).click();
		
		//xpath with *sign attribute value
		driver.findElement(By.xpath("//*@[type='text']")).clear();
		
		//xpath with .(dot)
		driver.findElement(By.xpath(".//input[@name='user_login']")).sendKeys("username");
		
		// xpath with contains() with attribute value
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("password");
		
		// xpath with contains with href and index
		driver.findElement(By.xpath("//a[contains(@href, 'about/legal/#privacy')]2]")).click();
		
		//xpath with contains with text
		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		
		//xpath with contains with image
		driver.findElement(By.xpath("//img[contains(@src,'main_carousel_1.jpg')]")).click();
		
		driver.close();
		driver.quit();
	}
}
		
		
