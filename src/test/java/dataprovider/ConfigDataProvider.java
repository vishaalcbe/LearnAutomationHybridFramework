package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider(){
		
		File file = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
		 pro = new Properties();
			
			try {
				pro.load(fis);
				
			} catch (IOException e) {
				
				System.out.println("The exception is"+e.getMessage());
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("The exception is"+e.getMessage());
		}
		
		
	}
	
public String getBrowser1(){
		
		String browser1 = pro.getProperty("browser1");
		
		return browser1;
	}
	
public String getFirefoxpath(){
	
	String firefoxpath = pro.getProperty("firefoxpath");
	
	return firefoxpath;
}

	
	public String getApplicationUrl1(){
		
		String url1 = pro.getProperty("url1");
		
		return url1;
	}
	
public String getTitle(){
		
		String title = pro.getProperty("title");
		
		return title;
	}
	
public String getMyAccountButton(){
		
		String myaccountbutton = pro.getProperty("myaccountbutton");
		
		return myaccountbutton;
	}	
	
	
public String getApplicationUrl2(){
		
		String url2 = pro.getProperty("url2");
		
		return url2;
	}
	
	  
   public String getUsername(){
		
		String username = pro.getProperty("username");
		
		return username;
	}
   
   public String getUsernameText(){
		
		String usernametext = pro.getProperty("usernametext");
		
		return usernametext;
	}
  
   
   public String getPassword(){
		
		String password = pro.getProperty("password");
		
		return password;
	}
   
   public String getPasswordText(){
		
		String passwordtext = pro.getProperty("passwordtext");
		
		return passwordtext;
	}

   public String getLoginbutton(){
		
		String loginbutton = pro.getProperty("loginbutton");
		
		return loginbutton;
	}
   
   public String getLogOutbutton(){
		
		String logoutbutton = pro.getProperty("logoutbutton");
		
		return logoutbutton;
	}
   
   public String getLogOutbuttontext(){
		
		String logouttext = pro.getProperty("logouttext");
		
		return logouttext;
	}
}
