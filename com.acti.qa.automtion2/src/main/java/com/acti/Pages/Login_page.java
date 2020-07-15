package com.acti.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class Login_page extends DriverScript{

	//*********Object Identification********
	@FindBy(id="username")WebElement usernameTB;
	@FindBy(name="pwd")WebElement passwordTB;
	@FindBy(id="loginButton")WebElement loginBT;
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement actilogo;
	@FindBy(id="toPasswordRecoveryPageLink")WebElement forgotpassword;
	
	
	//********page/object Initialization*********
	public Login_page()
	{
		PageFactory.initElements(driver,this);
	}
	
	//**********Actions/Methods********************
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public  boolean verifylogoisdisplayed()
	{
		return actilogo.isDisplayed();
	}
	
	public   void verifyLoginFunctions(String username,String Password)
	{
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(Password);
		loginBT.click();
	}
}
