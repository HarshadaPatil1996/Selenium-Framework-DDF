package Pom_DDF_testNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2Page 
{

	@FindBy(xpath = "//input[@name='yob']")private WebElement yob;
	
	
	UpstoxLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void inpUpstoxLogin2PageYearOfBirth(String YOB) 
	{
		yob.sendKeys(YOB);
	}
	
	
	
}
