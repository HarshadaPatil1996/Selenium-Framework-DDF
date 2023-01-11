package PomWithPageFactoryAndDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UpstoxLogin1Page 
{
	//no of data membars depend upon the no of elements we have to handle on that webpage
	
	@FindBy(xpath = "//input[@name='userId']") private WebElement UN;
	
	@FindBy(xpath ="//input[@name='password']") private WebElement pass;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signBtn;
	
	//basic/early initialization
	
	UpstoxLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpUpstoxLogin1PageUsername(String UN1) 
	{
		UN.sendKeys(UN1);
	}
	
	public void inpUpstoxLogin1PagePassword(String pass1) 
	{
		pass.sendKeys(pass1);
	}
	
	public void clickUpstoxLogin1PageSignIntoUpstox() 
	{
		signBtn.click();
	}
	
	
}
