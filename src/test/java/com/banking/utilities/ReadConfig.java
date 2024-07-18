package com.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig()
	{
		File src=new File("./configrationfiles/config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	public String geturl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getusername()
	{
		String username=pro.getProperty("uname");
		return username;
	}
	 public String getpwd()
	 {
		 String pwd=pro.getProperty("pwd");
		 return pwd;
	 }
	
	public String getpath1() {
		// TODO Auto-generated method stub
		 String path=pro.getProperty("chromepath");
		 return path;
		
	}

	}
	

