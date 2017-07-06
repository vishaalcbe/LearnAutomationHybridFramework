package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.DataProviderfactory;

public class HomePage {
	
    WebDriver driver;
	
	WebElement myaccount = driver.findElement(By.xpath(DataProviderfactory.getConfig().getMyAccountButton()));
	
	
	public HomePage(WebDriver ffdriver){
		
		this.driver=ffdriver;		
	}

	 public String giveTitle(){
		 
		 return driver.getTitle();
		    }
	 
	 public void myAccountClick(){			
		 myaccount.click();	
		 
		}
	 
}
