package com.banking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.banking.utilities.ReadConfig;

public class Baseclass  {
	ReadConfig readconfig=new ReadConfig();
	
//public String url="https://demo.guru99.com/V4/";
//public String uname="mngr571914";
//public String pwd="mYgAren";
//public static WebDriver driver;
	public String url= readconfig.geturl();
	public String uname=readconfig.getusername();
	public String pwd=readconfig.getpwd();
	public static WebDriver driver;
@BeforeClass
public void LaunchBrowser()
{
	System.setProperty("Webdriver.chrome.driver", readconfig.getpath1());
	//System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chrome.exe");
	driver=new ChromeDriver();
	}

@AfterClass
public void tearDown()
{
driver.close();	
}
}
