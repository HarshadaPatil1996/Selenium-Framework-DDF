package Pom_DDF_testNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Upstox_UtilityClass 
{
//method should be static and with return type
//need to metion auther name and method description so that
//any one can understand whats this method about
	
//Utility class contions common selenium codes like
//Capture screenshots,load test data form excel sheet,code for iframe,listbox etc.
	
public static String LoadTD(int rowIndex ,int cellindex) throws EncryptedDocumentException, IOException 
{   //need to declare method with two parameters that are required for Test Data
	//1-->Rowindex  2-->cell index
	
	FileInputStream file=new FileInputStream("C:\\Users\\Sairam\\eclipse-workspace\\Selenium framework DDF\\TestData\\Book1.xlsx");
	Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");
	
	String value = sh.getRow(rowIndex).getCell(cellindex).getStringCellValue();
	
	return value;
	//now we just need to call this mehtod in Test class to load test data 
	//using classname.methodname(a,b);
		
	
}	

//This method is to take screen shots of failed test cases
//need to pass two inputs (webdriver driver and int testcase id)

public static void TakeScreenShot(WebDriver driver,int TCID) throws IOException
{
	File local = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File desc=new File("C:\\Users\\Sairam\\eclipse-workspace\\Selenium framework DDF\\FailedTCScreenshots\\screenshotSelenium\\TestID"+TCID+".jpg");
	FileHandler.copy(local, desc);


}

//this method is to load property file containing test data
//need one parameter (String key)
public static String GetTestData(String key) throws Exception 
{
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//PropertyFile.properties");
	Properties pr=new Properties();
	
	pr.load(file);
	
	String value = pr.getProperty(key);
	
	return value;
}


























}
