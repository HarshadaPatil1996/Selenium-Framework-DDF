package Pom_DDF_testNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page
{
@FindBy(xpath = "//input[@id='userCode']") private WebElement UN;

@FindBy(xpath = "//input[@id='password']") private WebElement PS;

@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement SG;



UpstoxLogin1Page (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void inpUpstoxLogin1PageUsername(String un)

{
	UN.sendKeys(un);
}

public void inpUpstoxLogin1PagePassword(String pass)

{
	PS.sendKeys(pass);
}

public void ClickUpstoxLogin1PageSignInto()

{
	SG.click();  
}


}
