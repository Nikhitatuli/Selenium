package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhita.t\\Desktop\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) 
	 {
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.fb.com");
           String url1 = "https://www.facebook.com";
           String url= driver.getCurrentUrl();
           System.out.println(url);
 
        if (url.equals(url1))
         {
	         System.out.println("pass");
         }
        else
         {
	        System.out.println("fail");
         }
        boolean var=driver.getPageSource().contains("Create an account");
        if (var==true)
        {
        	System.out.println("Section present");
        }
        else
        	System.out.println("Element not found");
      driver.close();

}
}