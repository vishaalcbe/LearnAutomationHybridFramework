package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DataProviderfactory;
import org.testng.Assert;

public class LoginPage {

WebDriver driver;
WebElement username = driver.findElement(By.xpath(DataProviderfactory.getConfig().getUsername()));
WebElement password = driver.findElement(By.xpath(DataProviderfactory.getConfig().getPassword()));
WebElement login = driver.findElement(By.xpath(DataProviderfactory.getConfig().getLoginbutton()));

	
By signout = By.xpath(DataProviderfactory.getConfig().getLogOutbutton());
	
public LoginPage(WebDriver ffdriver){
		
		this.driver=ffdriver;		
	}


public void loginApplication(String user, String pass){
	
	username.sendKeys(user);
	password.sendKeys(pass);
	login.click();	
}

public void verifylogOut(){
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(signout));
	
	String text = ele.getText();
	
	Assert.assertEquals(text, DataProviderfactory.getConfig().getLogOutbuttontext());
	
}

}
