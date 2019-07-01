package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		String title1= driver.getTitle();
	
		if (title1.equals("QA Automation Tools Trainings and Tutorials"))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		driver.get("www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println("url");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
		
		driver.quit();
	}
	
}
