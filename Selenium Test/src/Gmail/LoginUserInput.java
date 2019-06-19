package Gmail;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUserInput {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		

	    WebDriver driver= new ChromeDriver();
	    driver.get("https://accounts.google.com/");
	    String winHandleBefore = driver.getWindowHandle();
	    
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    String userName = myObj.nextLine();
	    
	    driver.manage().window().maximize();
	    
	    
	   driver.findElement(By.id("identifierId")).sendKeys(userName);
	    
	    Thread.sleep(2000);
	   
	    driver.findElement(By.id("identifierNext")).click();
	    
	    Thread.sleep(3000);
	    driver.close();
	}

}
