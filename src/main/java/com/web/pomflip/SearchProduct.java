package com.web.pomflip;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	public static WebDriver driver;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement pop;
	@FindBy(name="q")
	private WebElement searcch;
	@FindBy(css="[type=\"submit\"]")
	private WebElement subb;
    public SearchProduct(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	public WebElement getPop() {
		return pop;
	}
	public WebElement getSearcch() {
		return searcch;
	}
	 public WebElement getSubb() {
			return subb;
		}
}
