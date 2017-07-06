package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.Browserfactory;
import factory.DataProviderfactory;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLoginPage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP(){
		driver = Browserfactory.getBrowser(DataProviderfactory.getConfig().getBrowser1());
		driver.get(DataProviderfactory.getConfig().getApplicationUrl1());	
		
	}
	
	@Test	
	public void testHomePage(){	
		String title = driver.getTitle();
		System.out.println("My application title is"+title);
		Assert.assertTrue(title.contains(DataProviderfactory.getConfig().getTitle()));
		//Assert.assertTrue(title.contains(DataProviderfactory.getConfig().getTitle()));
		((HomePage) driver).myAccountClick();
		LoginPage login = PageFactory.initElements(driver,LoginPage.class);
		login.loginApplication(DataProviderfactory.getConfig().getUsernameText(), DataProviderfactory.getConfig().getPasswordText());
		login.verifylogOut();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Browserfactory.closeBrowser(driver);
	}

}
