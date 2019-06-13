package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		WebElement radio1= driver.findElement(By.id("sex-1"));
		radio1.click();
		List <WebElement> radio2 = driver.findElements(By.className("control-label"));
		for(WebElement ele :radio2) 
		System.out.println(((WebElement) radio2).getText());
		driver.close();
	}

}
