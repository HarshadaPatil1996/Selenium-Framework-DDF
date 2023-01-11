package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Of_TestCases
{
//now i have divided TC's into 2 groups (niki,tina)
//i only want to execute niki 
//include that group in test suite 
	
	@Test(groups = "niki")
	public void TC1()
	{
		Reporter.log("running tc 1");
	}


	@Test(groups = "tina")
	public void TC2()
	{
		Reporter.log("running tc 2");
	}


	@Test(groups = "niki")
	public void TC3() throws Exception
	{
		
		Reporter.log("running tc 3");
	}

	@Test(groups = "tina")
	public void TC4()
	{
		Reporter.log("running tc 4");
	}

	@Test(groups = "tina")
	public void TC5()
	{
		Reporter.log("running tc 5");
	}

}


