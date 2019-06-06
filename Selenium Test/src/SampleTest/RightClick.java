package SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Launching Sample site
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		//Right click in the TextBox
		Actions action = new Actions(driver);
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
		
		WebElement btn = driver.findElement(By.id("idOfButton"));
		action.moveToElement(btn).perform();
		
		Thread.sleep(3000);
		
		
		WebElement searchBox = driver.findElement(By.id("fname"));
		action.contextClick(searchBox).perform();
		
		//Closing the driver instance
		driver.quit();
	}
	
	
}