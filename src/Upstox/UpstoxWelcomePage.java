package Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePage 
{
@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement good;


UpstoxWelcomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



public void clickUpstoxWelcomePageNoImGood() 
{
	good.click();
}

}
