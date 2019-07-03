//Number of links on flipkart page

package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Practice3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}
	public static <WebElement> void main(String[] args) throws InterruptedException {
		
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.flipkart.com/");
      
       driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
       Thread.sleep(2000);
       
      List<WebElement> links =(List<WebElement>) driver.findElements(By.xpath("//a"));
      int linkcount=links.size();
      System.out.println("Number of links are"+linkcount);
       driver.close();
       
	}

}