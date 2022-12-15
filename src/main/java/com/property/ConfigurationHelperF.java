package com.property;

import java.io.IOException;

public class ConfigurationHelperF {
	public static ConfigurationReaderF getInstance() throws IOException {
		ConfigurationReaderF cr=new ConfigurationReaderF();
		return cr;
	} 
	private ConfigurationHelperF() {
		
	}
}
