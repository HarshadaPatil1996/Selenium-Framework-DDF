package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 2
public class UpstoxLogin2Page 
{
     @FindBy(xpath="//input[@id='yob']") WebElement DOB;
     
     
     UpstoxLogin2Page(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     
     public void DateOfBirth() 
     {
		DOB.sendKeys("1996");
	 }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
