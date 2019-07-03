
//Login to facebook and verify if logged in and compare urls
package test;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	 {
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.fb.com");
           String url1 = "https://www.facebook.com";
           String url= driver.getCurrentUrl();
           System.out.println(url);
 
        if (url.equals(url1))
         {
	         System.out.println("pass");
         }
        else
         {
	        System.out.println("fail");
         }
        boolean var=driver.getPageSource().contains("Create an account");
        if (var==true)
        {
        	System.out.println("Section present");
        }
        else
        	System.out.println("Element not found");
        
        driver.findElement(By.name("firstname")).sendKeys("Nikhita");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Tuli");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_q")).sendKeys("nikhit5854@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_t")).sendKeys("nikhit5854@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_x")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_5")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"u_0_15\"]")).click();
        Thread.sleep(2000);
        
      driver.close();

}
}