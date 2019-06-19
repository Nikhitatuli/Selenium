package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		

WebDriver driver= new ChromeDriver();
driver.get("https://accounts.google.com/");
driver.findElement(By.id("identifierId")).sendKeys("nikhita.t@media.net");
Thread.sleep(2000);
driver.findElement(By.id("identifierNext")).click();
Thread.sleep(2000);
 driver.findElement(By.name("password")).sendKeys("Nikhita@2590");
 Thread.sleep(2000);

driver.findElement(By.id("passwordNext")).click();
Thread.sleep(2000);
driver.close();


	}

}
