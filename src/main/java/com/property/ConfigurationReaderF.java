package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReaderF {
	Properties p;
	public ConfigurationReaderF() throws IOException {
		File f=new File("C:\\Users\\puvana\\eclipse-workspace\\Flipkart\\src\\main\\java\\com\\property\\TestDataF.properties");
	   FileInputStream fi= new FileInputStream(f);//we are letting to read the TestData.properties File
	   
	   p=new Properties();
	   p.load(fi);//will load that file into properties //property-->properties
	   }
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url=p.getProperty("url");
		return url;
	}
	public String getSheet() {
		String sheet=p.getProperty("sheet");
		return sheet;
	}
}
