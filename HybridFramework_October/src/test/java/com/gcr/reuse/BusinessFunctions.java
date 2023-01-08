package com.gcr.reuse;

import org.openqa.selenium.WebDriver;
import com.gcr.commands.ActionDriver;
import com.gcr.config.StartBrowser;
import com.gcr.or.WebShopLoginpage;
import com.gcr.or.WebshopHomepage;

public class BusinessFunctions {
	
	public WebDriver driver;
	public ActionDriver ad;
	
	public BusinessFunctions()
	{
		driver = StartBrowser.driver;
		ad = new ActionDriver();
	}
		
	public void loginWebshop() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to webshop application");
		ad.navigateToApplication("https://demowebshop.tricentis.com/");
		ad.click(WebshopHomepage.lnkLogin, "Login link");
		ad.type(WebShopLoginpage.txtEmail, "abhinavrevu16@gmail.com", "email text box");
		ad.type(WebShopLoginpage.txtpassword, "Abhi@123", "passwprd text box");
		ad.click(WebShopLoginpage.btnlogin, "login button");
		
	}
}

