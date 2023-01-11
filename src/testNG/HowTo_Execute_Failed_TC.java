package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HowTo_Execute_Failed_TC

{
//using failed.xml file
//create test suite and run it, then if any test cases failed refresh the project
// failed.xml will be created which will enclude only failed TC from that test suite
	
	@Test()
	public void TC1()
	{
		Reporter.log("running tc 1");
	}


	@Test()
	public void TC2()
	{
		Reporter.log("running tc 2");
	}


	@Test(timeOut = 5000)
	public void TC3() throws Exception
	{
		Thread.sleep(6000);
		Reporter.log("running tc 3");
	}

	@Test()
	public void TC4()
	{
		Reporter.log("running tc 4");
	}

	@Test()
	public void TC5()
	{
		Reporter.log("running tc 5");
	}

}
