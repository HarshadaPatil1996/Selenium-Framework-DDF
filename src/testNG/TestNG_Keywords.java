package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNG_Keywords 
{
	/*
	 * TestNG Keywords
	 * 1) invocationCount
	 * 2) enabled
	 * 3) priority
	 * 4) TimeOut
	 * 5)dependsOnMethod
	 */
	
	@Test(invocationCount = 2)  //to run atest case multiple times
	public void TC1() 
	{
		Reporter.log("running TC1",true);

	}
	
	@Test(priority = 1)  //order of execution will be done by priority lowest 1st and highest last
	public void TC2() 
	{
		
		Reporter.log("running TC2",true);	}
	
	@Test(priority =2 )
	public void TC3() 
	{
		
		Reporter.log("running TC3",true);	}
	
	@Test(enabled = false)  //when we dont want to execute a perticular TC use enable=false
	public void TC4() 
	{
		Reporter.log("running TC4",true);
	}
	
	@Test(timeOut = 10000,priority = 3)  //if the TC didnt get executed within given timeout,it'll fail and nest TC will be executed
	public void TC5() throws InterruptedException 
	{
	    Thread.sleep(10000);
	    Reporter.log("running TC5",true);
	}
	
	@Test(dependsOnMethods = {"TC4"} ,enabled = false)  //now TC6 execution will depend on TC4
	public void TC6() 
	{
		Reporter.log("running TC6",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
