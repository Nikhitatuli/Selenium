package SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_Test {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
	
	
	 String text= driver.findElement(By.id("idOfDiv")).getText();
	 System.out.println(text);
	 Thread.sleep(2000);
	driver.findElement(By.linkText("This is a link")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("firstName")).sendKeys("Hello");
	 Thread.sleep(2000);
	 driver.findElement(By.id("idOfButton")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("male")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.className("Automation")).click();
	 driver.findElement(By.className("Performance")).click();
	 Thread.sleep(3000);
	 Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
		Thread.sleep(3000);
	 driver.close();
}
}
