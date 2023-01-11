package testNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MultiBrowser_Testing
{
	
 @Parameters("BrowserName")
 @Test
public void OpenBrowser(String BrowserName) throws InterruptedException

{
	WebDriver driver=null;
	
	
	if(BrowserName.equals("chrome")) 
		
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
		 driver = new ChromeDriver();
		        
	}
	
	
	else if (BrowserName.equals("FireFox")) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
		
	}
	
	driver.get("https://youtube.com/");
	
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	
	js.executeScript("window.scrollBy(0,5000)");
	
	Thread.sleep(3000);
	driver.close();
	
	
}



}
