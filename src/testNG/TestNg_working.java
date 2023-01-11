package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_working
{
  @Test
  public void TC1()
  {
	  
	Reporter.log("running test case 1");
	  
  }
  
  @Test
  public void TC2()
  {
	  
		Reporter.log("running test case 2");
	  
  }
  
  @Test
  public void TC3()
  {
	  
		Reporter.log("running test case 3");
	  
  }
}
