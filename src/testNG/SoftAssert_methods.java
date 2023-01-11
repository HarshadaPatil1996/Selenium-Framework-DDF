package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssert_methods
{
@Test

public void TC1() 
{
	SoftAssert soft=new SoftAssert();
	
	boolean act1=false;
	boolean act2=true;
	String act="tina";
	String exp="ttina";
	
	
	soft.assertTrue(act1);//-->TC will fail
	
	soft.assertTrue(act2);// -->TC will pass
	
	soft.assertEquals(act, exp);
	
	
	soft.assertAll();//used to print all verification results in console 
	//now we have 3 verification
	//even if one fails ,others after that failed one will be executed
	
}

}
