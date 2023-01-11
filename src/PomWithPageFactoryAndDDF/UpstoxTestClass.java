package PomWithPageFactoryAndDDF;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTestClass
{
public static void main(String[] args)  throws Exception

{
	FileInputStream file=new FileInputStream("F:\\class\\velocity notes\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://login-v2.upstox.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	UpstoxLogin1Page login1=new UpstoxLogin1Page(driver);
	login1.inpUpstoxLogin1PageUsername(sh.getRow(1).getCell(0).getStringCellValue());
	login1.inpUpstoxLogin1PagePassword(sh.getRow(1).getCell(1).getStringCellValue());
	login1.clickUpstoxLogin1PageSignIntoUpstox();
	
	
	UpstoxLogin2Page login2=new UpstoxLogin2Page(driver);
	login2.inpUpstoxLogin2PageYearOfBIRTH(sh.getRow(1).getCell(2).getStringCellValue());
	
	UpstoxWelocmepage welcome=new UpstoxWelocmepage(driver);
	welcome.clickUpstoxWelocmepageNoIamGood();
	
	UpstoxLHomePage home=new UpstoxLHomePage(driver);
    home.VerifyUpstoxLHomePageUserID(sh.getRow(1).getCell(3).getStringCellValue());
	
	Thread.sleep(5000);
	driver.quit();
	
	
}
}
