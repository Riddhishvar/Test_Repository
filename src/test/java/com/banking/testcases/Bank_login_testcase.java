package com.banking.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageobjects.LoginPage;

public class Bank_login_testcase extends Baseclass {

	@Test public void logintest()
	{
		driver.get(url);
	LoginPage lp=new LoginPage(driver);
	lp.setusername(uname);
	lp.setpwd(pwd);
	lp.clicklogin();
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
		else
		{
			Assert.assertTrue(false);
		}
	}
	}
	

