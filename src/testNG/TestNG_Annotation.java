package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation 
{
/*There are different testNG annotations
 * 1)@BeforeClass
 * 2)@AfterClass
 * 3)@BeforeMethod
 * 4)@AfterMehtod
 * 5)@Test
 */

	
	@BeforeClass    //-->It is use for execution of test method before execution of test class. 
	public void pre_conditionsforclass()
	{
		Reporter.log("open browser",true);
	}
	
	@BeforeMethod//-->It is use for execution of test method before-
	               //-execution of every test method with  @Test annotation
	
	public void pre_conditionsForEachTC()//this test method will run
	{
      Reporter.log("login into google website",true);
	}
	
	
	
	@Test  //@test is used for execution of test method/TC.
	public void TC2()
	{
		Reporter.log("running test case 2",true);
	}
	

	@AfterMethod  //-->It is use for execution of test method after execution- 
	                  //-of every test method with an annotation @Test
	public void post_conditionsForEachTC()
	{
      Reporter.log("logout from google website",true);
	}
	
	@AfterClass  //-->It is use for execution of test method after execution of test class
	public void post_conditionsforclass()
	{
		Reporter.log("close browser",true);

	}
	
}
