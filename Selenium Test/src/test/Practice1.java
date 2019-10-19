//navigation and compare titles
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "Selenium Test/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		String title1= driver.getTitle();
	
		if (title1.equals("QA Automation Tools Trainings and Tutorials"))
		{
			System.out.println("pass");
		}
			System.out.println("fail");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println("url");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
	
		Thread.sleep(2000);
		driver.quit();
		
		
}
	
}
