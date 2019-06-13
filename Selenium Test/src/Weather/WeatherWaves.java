package Weather;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WeatherWaves {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		System.out.println("Enter url");
		String url=br.readLine();
		driver.get("url");
		driver.manage().window().maximize();
		
		String at=driver.getTitle();
		String et= "weather waves search";
		driver.close();
		
          if(at.equalsIgnoreCase(et))
        	  System.out.println("Success");
           else
        	   System.out.println("fail");
	}

}
