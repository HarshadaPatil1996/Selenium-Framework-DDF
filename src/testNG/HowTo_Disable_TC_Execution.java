package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HowTo_Disable_TC_Execution
{
	//two ways 1-->using testng keyword @test(enabld=false)
	//2-->using test suite keywords include/exclude
	
@Test(enabled = false)
public void TC1()
{
	Reporter.log("running tc 1");
}


//now using test suite ....create test suite and then exclude/include  the tc names you want to  exclude/include 
@Test()
public void TC2()
{
	Reporter.log("running tc 2");
}


@Test()
public void TC3()
{
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
