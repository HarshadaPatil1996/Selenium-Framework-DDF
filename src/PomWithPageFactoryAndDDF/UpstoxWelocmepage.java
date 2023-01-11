package PomWithPageFactoryAndDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelocmepage 
{
@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement NO;
  
UpstoxWelocmepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickUpstoxWelocmepageNoIamGood()
{
	NO.click();
}



}
