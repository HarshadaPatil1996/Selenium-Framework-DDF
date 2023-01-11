package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class 1
public class UpstoxLogin1Page 
{
	//step1
	//declaration access specifier private usign @findby() annotation
@FindBy(xpath="//input[@id='userCode']") private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement Pass;
@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement LoginBtn;

//step2
//initialize within constructor access specifier public

UpstoxLogin1Page(WebDriver driver)//-->constructor through driver accept
{
	
	PageFactory.initElements(driver, this);
	
}

//step3
//for every element we delcare different method access specifier public


public void username() 
{
	UN.sendKeys("6WB2L3");
}

public void password() 
{
	Pass.sendKeys("Tina@12896");
}

public void Loginbtn() 
{
	LoginBtn.click();
}


}
