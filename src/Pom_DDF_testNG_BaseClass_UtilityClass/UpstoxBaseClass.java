package Pom_DDF_testNG_BaseClass_UtilityClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxBaseClass
{
	   WebDriver driver;   //declare globally
	   
     public void Open_Browser() throws Exception
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\Selenium framework DDF\\Browser\\chromedriver.exe");
		
	    driver=new ChromeDriver();  //initialize locally
	    
		driver.manage().window().maximize();
		
		driver.get(Upstox_UtilityClass.GetTestData("URL"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
}
     
    /*Base class contains code for opening browser only.
     * then we will extend that in other Test classes.(inheritance concept used here)
     *i.e, we don't need to mention browser opening code in every Test class.
     *just extend Base class into every Test class 
     * So, now if we need to make any changes in url we can do that in base class 
     * saves time,and efforts
     *
     */
     
     
     
     
     
     
     
}
