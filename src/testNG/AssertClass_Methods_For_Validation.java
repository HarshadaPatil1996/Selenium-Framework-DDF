package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertClass_Methods_For_Validation 
{
    //1) Assert.assertEquals(act, exp);
	//2) Assert.assertNotEquals(act, exp);
	//3) Assert.assertTrue(act);
	//4) Assert.assertFalse(act);
	 
@Test
public void TC1()
{
	// case 1) where actual results are same as expected (+tive Test case)
	
	String act="tina";
	String exp="Tina";
	
	//we need to validate that actual is same as expected results using assert class static methods
     // Assert.assertEquals(act, exp);--->this mehtod is case sensitive  (TC will pass)
	
	//for failed test case where act is not equal to exp then we can mention failer msg
      
//	Assert.assertEquals(act, exp,"failed : both results are different : ");(TC will fail)
	
	
	

	// case 2) where actual results is diff from  expected (-tive Test case) TC will pass
	
//	String actual="tinu";
//	
//	String expected="tinu";
//	
//	Assert.assertNotEquals(actual, expected);
//	
	//if act==exp in this case TC will fail
	
	
	// case 3) to check boolean conditional results 
	 boolean a = true;
	 boolean b = false;
	Assert.assertTrue(a);// if act is true TC will pass otherwise fail
	
	Assert.assertFalse(b);//if act is false TC will pass otherwise fail
	
	
}
}
