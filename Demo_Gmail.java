package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("niks9025@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		String at=driver.getTitle();
		String et= "gmail";
		driver.close();
		
          if(at.equalsIgnoreCase(et))
        	  System.out.println("Success");
           else
        	   System.out.println("fail");
	}

}
