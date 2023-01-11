package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 3
public class UpstoxWelcomePage
{
@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement noAMgood;


UpstoxWelcomePage(WebDriver driver)

{
	PageFactory.initElements(driver, this);
}


public void NoIamGood()
{
	noAMgood.click();
}


}
