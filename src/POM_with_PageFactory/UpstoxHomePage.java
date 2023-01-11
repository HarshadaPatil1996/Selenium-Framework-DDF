package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 4 
public class UpstoxHomePage
{
@FindBy(xpath = "//span[text()='harshada p.']") private WebElement name;


UpstoxHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void VarifyUN() 
{
	String expResult="Harshada P.";
	String actResult = name.getText();
	
	if (actResult.equals(expResult))
	{
		System.out.println("Test Script Passed");
	} 
	else 
	{
		System.out.println("Test Script Failed");
	}
	
}

}
