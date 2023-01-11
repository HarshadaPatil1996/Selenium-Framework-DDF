package POM_with_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//pom test class containing main method
public class UpstoxLoginTest
{
public static void main(String[] args) throws InterruptedException


{

    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	//go to the wesite
	
	driver.get("https://login-v2.upstox.com/");
	
	
	UpstoxLogin1Page login1=new UpstoxLogin1Page(driver);
	
	login1.username();
	login1.password();
	login1.Loginbtn();
	
	
	UpstoxLogin2Page login2=new UpstoxLogin2Page(driver);
	login2.DateOfBirth();
	
	UpstoxWelcomePage welcome=new UpstoxWelcomePage(driver);
	welcome.NoIamGood();
	
	UpstoxHomePage home=new UpstoxHomePage(driver);
	home.VarifyUN();
	
	Thread.sleep(3000);
	driver.close();
}
}
