package Pom_DDF_testNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UpstoxTestClass  extends UpstoxBaseClass
{
	                 //all objects should be declared globally
	                           //--->datatype objectname;
	UpstoxLogin1Page login;       // nad then initialize them locally
	UpstoxLogin2Page login2;
	UpstoxWelcomePage welcome;
	UpstoxhomePage home;
	SoftAssert soft;
	int TCID;
@BeforeClass
public void OpenBrowser() throws Exception 
{  //all one time activities will be done in before class test method
	
    Open_Browser();  //--> this method is present in Base class
    
	login=new UpstoxLogin1Page(driver);
	
	login2=new UpstoxLogin2Page(driver);
	
	welcome=new UpstoxWelcomePage(driver);
	
	home=new UpstoxhomePage(driver);
	
	soft=new SoftAssert();
	
}
	
	@BeforeMethod
	public void Login() throws EncryptedDocumentException, Exception
	{
		login.inpUpstoxLogin1PageUsername(Upstox_UtilityClass.GetTestData("UN"));//calling mehtod from utility class
		login.inpUpstoxLogin1PagePassword(Upstox_UtilityClass.GetTestData("PWS"));
		login.ClickUpstoxLogin1PageSignInto();
		
		login2.inpUpstoxLogin2PageYearOfBirth(Upstox_UtilityClass.GetTestData("YOB"));
		
		welcome.clickUpstoxWelcomePageNoImGood();
		
	    //pre conditions before running every TC will be here 
	}
	
	
	@Test
	public void VerifyUserId() throws EncryptedDocumentException, IOException
	{
		TCID=1;
		String actualResults = home.verifyUpstoxhomePageUserId();
		
		String ExpectedResults=Upstox_UtilityClass.LoadTD(1, 3);
		
	//verifyUserId
		soft.assertEquals(actualResults, ExpectedResults, "Failed");	
		
		String act1=home.VerifyUpstoxhomePageTitle();
		
		String exp1=Upstox_UtilityClass.LoadTD(1, 4);
		
	//Verify Title
        soft.assertEquals(act1, exp1,"Failed");
		
        soft.assertAll();
		
	}
	
	
	@AfterMethod
	public void PostConditions(ITestResult re ) throws IOException 
	{
		if(re.getStatus()==ITestResult.FAILURE)
		{
			Upstox_UtilityClass.TakeScreenShot(driver, TCID);
		}

	}
	
	@AfterClass
	
	public void CloseBroswer() 
	{
		driver.quit();
	}
	
}
