package MapAssist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
public static void main(String args[]) throws IllegalStateException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver Driver= new ChromeDriver();
	Driver.get("https://mapsassist.com");
	String title= Driver.getTitle();
	System.out.println(title);
	Driver.close();
}
}
