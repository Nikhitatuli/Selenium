package MapAssist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CtaButton {
	public static void main(String[] args, Object WebElement) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://mapsassist.com");
int i=0;
WebElement S;

 S = driver.findElement(By.className("btn tracker ctafunc2"));

System.out.println("S="+S);
driver.close();	
	}
}
