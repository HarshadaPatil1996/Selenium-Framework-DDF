package PomWithPageFactoryAndDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UpstoxLHomePage 
{
@FindBy(xpath = "//span[text()='harshada p.']")private WebElement id;

UpstoxLHomePage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void VerifyUpstoxLHomePageUserID(String expectedresults ) 
{
	String actulresults=id.getText();
	if(actulresults.equals(expectedresults))
	{
		System.out.println("passed");
	}
	
	else
	{
		System.out.println("failed");
	}
}

}
