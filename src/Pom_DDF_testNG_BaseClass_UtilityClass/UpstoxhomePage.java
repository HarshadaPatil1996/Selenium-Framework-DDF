package Pom_DDF_testNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxhomePage 
{
	WebDriver driver1;
	
@FindBy(xpath = "//span[text()='harshada p.']")private WebElement veri;



UpstoxhomePage(WebDriver driver)
{
	 driver1=driver;
	PageFactory.initElements(driver, this);
	
}


public String verifyUpstoxhomePageUserId() 
{
	String text=veri.getText();
	
	return text;
}

public String  VerifyUpstoxhomePageTitle() 
{
	String actTitle=driver1.getTitle();
	return actTitle;
}




}
