package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class EnterTimePage extends DriverScript {

	
	//*********Page/Object Initialization**************
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver,this);
	
	}
	
	
	//**************object initialization***************
	 @FindBy(id="logoutLink")WebElement logout;
	 
	 @FindBy(xpath="//div[text()='Tasks']")WebElement Taskmenu;
	
	 
	 //************Actions/Methods******************
	 
	 
	 public void clicklogout()
	 {
		 logout.click(); 
	 }
	 
	 public boolean verifyTaskMenuisDisplayed()
	 {
		 return Taskmenu.isDisplayed();
	 }
	 
	 public void clickTaskMenu()
	 {
		 Taskmenu.click(); 
	 }
	 
	 
}
