package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://accounts.google.com/");
driver.findElement(By.id("identifierId")).sendKeys("niks9025@gmail.com");
driver.findElement(By.id("identifierNext")).click();
driver.findElement(By.name("password")).sendKeys("abcdef");;

driver.findElement(By.id("identifierNext")).click();
driver.close();


	}

}
