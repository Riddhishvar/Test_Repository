package com.banking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

	public WebDriver driver;
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	public void setusername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setpwd(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
	public LoginPage(WebDriver idriver)
	{
		this.driver=idriver;
		PageFactory.initElements(driver,this);
		return ;
	}
	
}
