package Upstox;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxTestClass 
{
	Sheet sh;                  //all objects should be declared globally
	WebDriver driver;             //--->datatype objectname;
	UpstoxLogin1Page login;       // nad then initialize them locally
	UpstoxLogin2Page login2;
	UpstoxWelcomePage welcome;
	UpstoxhomePage home;
	
@BeforeClass
public void OpenBrowser() throws Exception
{  //all one time activities will be done in before class test method
	
	FileInputStream file=new FileInputStream("F:\\class\\velocity notes\\Book1.xlsx");
	
	 sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://login-v2.upstox.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	login=new UpstoxLogin1Page(driver);
	
	login2=new UpstoxLogin2Page(driver);
	
	welcome=new UpstoxWelcomePage(driver);
	
	home=new UpstoxhomePage(driver);
	
}
	
	@BeforeMethod
	public void Login()
	{
		login.inpUpstoxLogin1PageUsername(sh.getRow(1).getCell(0).getStringCellValue());
		login.inpUpstoxLogin1PagePassword(sh.getRow(1).getCell(1).getStringCellValue());
		login.ClickUpstoxLogin1PageSignInto();
		
		login2.inpUpstoxLogin2PageYearOfBirth(sh.getRow(1).getCell(2).getStringCellValue());
		
		welcome.clickUpstoxWelcomePageNoImGood();
	
	}
	
	
	@Test
	public void VerifyUserId()
	{
		String actualResult = home.verifyUpstoxhomePageUserId();
		
		String ExpectedResults=sh.getRow(1).getCell(3).getStringCellValue();
		
		Assert.assertEquals(actualResult, ExpectedResults,"Failed");		
				
	}
	
	
	@AfterMethod
	public void Logout() 
	{
		
	}
	
	@AfterClass
	
	public void CloseBroswer() 
	{
		driver.quit();
	}
	
}
