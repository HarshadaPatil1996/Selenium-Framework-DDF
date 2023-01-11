package Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxhomePage 
{
@FindBy(xpath = "//span[text()='harshada p.']")private WebElement veri;

UpstoxhomePage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
	
}


public String verifyUpstoxhomePageUserId() 
{
	String text=veri.getText();
	
	return text;
}








}
