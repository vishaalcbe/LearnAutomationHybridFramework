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

public class VerifyHomePage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP(){
		driver = Browserfactory.getBrowser(DataProviderfactory.getConfig().getBrowser1());
		driver.get(DataProviderfactory.getConfig().getApplicationUrl1());	
		
	}
	
	@Test	
	public void testHomePage(){	
		
		//HomePage home=PageFactory.initElements(driver,HomePage.class);
		String title = driver.getTitle();
		System.out.println("My application title is"+title);
		Assert.assertTrue(title.contains(DataProviderfactory.getConfig().getTitle()));
		
	}
	
	@AfterMethod
	public void tearDown(){
		Browserfactory.closeBrowser(driver);
	}

}
