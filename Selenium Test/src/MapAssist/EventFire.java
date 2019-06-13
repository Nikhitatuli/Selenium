package MapAssist;


 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
 
public class EventFire {
 
 public static void main(String[] args) throws IllegalStateException
 {
 // TODO Auto-generated method stub
 
         FirefoxDriver driver = new FirefoxDriver();
         EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
 
 EventHandler handler = new EventHandler();
 eventDriver.register(handler);
 eventDriver.get("https://mapsassist.com");
 WebElement element = eventDriver.findElement(By.xpath("//*[@id=\"get-directions\"]"));
 element.click();
 
 }
 
}