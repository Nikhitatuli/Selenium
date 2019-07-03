// Search item from ebay 

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
  WebDriver driver =new ChromeDriver();
  driver.get("https://in.ebay.com/");
  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Apple Watches");
  Select oSelect = new Select(driver.findElement(By.id("gh-cat")));
  oSelect.selectByVisibleText("Cell Phones & Accessories");
  driver.findElement(By.id("gh-btn")).click();
  Thread.sleep(2000);
  driver.close();
	}

}
