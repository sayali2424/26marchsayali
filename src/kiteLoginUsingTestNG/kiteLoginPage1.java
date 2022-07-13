package kiteLoginUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage1 
{//1.data members
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;

	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	
	public kiteLoginPage1 (WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	//2.constructor
	public void kiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3.method
	public void sendUserName()
	{
 
	userName.sendKeys("ELR321");
	}
	public void sendpassword()
	{
		password.sendKeys("Dhana1111");
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	

}


