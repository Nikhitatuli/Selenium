
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwitchFrames {
	  public static void main(String[] args) throws InterruptedException {
		  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");  
		  	WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        Thread.sleep(60);
	        driver.findElement(By.linkText("Deprecated")).click();
	        Thread.sleep(120);
	        driver.close(); 
	    }
}