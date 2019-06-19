package Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenConsole {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}
	public static void main(String[] args) {
		  ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.addArguments("--disable-extensions");
	        options.addArguments("--auto-open-devtools-for-tabs");
	        
	        WebDriver driver = new ChromeDriver(options);
	        driver.switchTo();
	        driver.get("https://www.gmail.com/");
	        driver.close();
	    

	}

}
