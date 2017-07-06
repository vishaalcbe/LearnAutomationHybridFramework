package factory;

import dataprovider.ApplicationDataProvider;
import dataprovider.ConfigDataProvider;

public class DataProviderfactory {
	
	public static ConfigDataProvider getConfig(){
		
		ConfigDataProvider config = new ConfigDataProvider();		
		
		return config;
		
		
	}
	
public static ApplicationDataProvider getExcel(){
		
		ApplicationDataProvider app = new ApplicationDataProvider();		
		
		return app;
		
		
	}

}
