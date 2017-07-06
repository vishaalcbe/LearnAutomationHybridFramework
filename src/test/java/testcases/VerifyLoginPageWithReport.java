package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.Browserfactory;
import factory.DataProviderfactory;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLoginPageWithReport {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod
	public void setUP(){
		report=new ExtentReports("C:\\Users\\vishaalcbe\\workspace\\com.leanautomation.hybridframework\\Reports\\LoginPageReport.html",true);
		logger = report.startTest("Verify Login Page");
		driver = Browserfactory.getBrowser(DataProviderfactory.getConfig().getBrowser1());
		driver.get(DataProviderfactory.getConfig().getApplicationUrl1());
		logger.log(LogStatus.INFO, "Application is up and running");
		
	}
	
	@Test	
	public void testHomePage(){	
		String title = driver.getTitle();
		System.out.println("My application title is"+title);
		Assert.assertTrue(title.contains(DataProviderfactory.getConfig().getTitle()));
		logger.log(LogStatus.PASS, "Home page loaded and verified");
		//Assert.assertTrue(title.contains(DataProviderfactory.getConfig().getTitle()));
		((HomePage) driver).myAccountClick();
		LoginPage login = PageFactory.initElements(driver,LoginPage.class);
		login.loginApplication(DataProviderfactory.getConfig().getUsernameText(), DataProviderfactory.getConfig().getPasswordText());
		logger.log(LogStatus.INFO, "Login to Application");
		login.verifylogOut();
		logger.log(LogStatus.PASS, "Logout link is present");
		
	}
	
	@AfterMethod
	public void tearDown(){
		Browserfactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
	}

}
