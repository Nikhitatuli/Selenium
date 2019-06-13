package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://accounts.google.com/");
driver.findElement(By.id("identifierId")).sendKeys("niks9025@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("identifierNext")).click();
Thread.sleep(2000);
 driver.findElement(By.name("password")).sendKeys("password");
 Thread.sleep(2000);

driver.findElement(By.id("passwordNext")).click();
driver.close();


	}

}
