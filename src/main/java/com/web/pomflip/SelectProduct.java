package com.web.pomflip;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
	public WebDriver driver;
	
    @FindBy(xpath="//div[@class='col col-7-12']/div[@class='_4rR01T']")
    private List<WebElement> apple;
    public SelectProduct(WebDriver driver1) {
    	this.driver=driver1;
    	PageFactory.initElements(driver, this);
    }
   
	public List<WebElement> getApple() {
		return apple;
	}

}
