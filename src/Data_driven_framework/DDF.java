package Data_driven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class DDF 
{
public static void main(String[] args) throws Exception

{
	//load the excel sheet
	
	FileInputStream file=new FileInputStream("F:\\class\\velocity notes\\Book1.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("ddf");//--->ddf sheet is opened
	
	
	//set the browser name and path
	
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	//go to the wesite
	
	driver.get("https://www.saucedemo.com/");
	
	//we need valid user name and password for login ,we get that from excel sheet 
	
	 String un = sh.getRow(1).getCell(0).getStringCellValue();//-->fetching data from specific row and cell
	 
	 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(un);
	
	String pass=sh.getRow(1).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	
	//click on login button
	
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	Thread.sleep(3000);
	
	//verify that the company logo is present on home page
	
	boolean logo = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
	
	
	if(logo==true)
	{
		System.out.println("company logo is displayed on home page");
	}
	
	else
	{
		System.out.println("company logo is NOT displayed on home page");
	}
	

	//take screen shot of home page showing logo
	
	File local = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String a = RandomString.make(2);
	File desc=new File("F:\\class\\velocity notes\\progarm srshot\\logo"+a+".jpg");
	FileHandler.copy(local, desc);
	
	
	//click on menu button 
	driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
	
	//click on logout button
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	//close the browser
	
	Thread.sleep(2000);
	
	driver.quit();

    }
}
