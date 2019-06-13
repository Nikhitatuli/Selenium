package MapAssist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
public static void main(String args[]) throws IllegalStateException, IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver Driver= new ChromeDriver();
	Driver.get("https://mapsassist.com");
	String title= Driver.getTitle();
	System.out.println(title);
	Driver.close();
}
}
