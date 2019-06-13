package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_Gmail {

	  public static void main(String[] args) throws IllegalStateException, InterruptedException
	  {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://mail.google.com");
		    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("niks9025");
		    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		    Thread.sleep(2000);
		    WebElement passwordEnter = driver.findElement(By.xpath("//input[@name='password']"));
		    passwordEnter.sendKeys("password");
		    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}

}
