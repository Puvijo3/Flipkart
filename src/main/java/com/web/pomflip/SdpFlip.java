package com.web.pomflip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SdpFlip {
	public WebDriver driver;
	public SearchProduct sp;
	public SelectProduct sep;
	
	public SearchProduct getSearchProduct() {
		if(sp==null) {
			sp=new SearchProduct(driver);
		}
		return sp;
	}
	public SelectProduct getSelectProduct() {
		if(sep==null) {
			sep=new SelectProduct(driver);
			}
		return sep;
	}
	public SdpFlip(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

}
