package Weather;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WeatherWaves {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		System.out.println("Enter url");
		String url=br.readLine();
		
		Thread.sleep(3000);
		
		WebDriver driver= new ChromeDriver();
		
		//driver.switchTo().frame(url);
		
		driver.get(url);
		
		
		
		String at=driver.getTitle();
		String et= "weather waves search";
		driver.close();
		
          if(at.equalsIgnoreCase(et))
        	  System.out.println("Success");
           else
        	   System.out.println("fail");
	}

}
