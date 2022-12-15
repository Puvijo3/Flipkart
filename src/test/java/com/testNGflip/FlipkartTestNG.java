package com.testNGflip;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.baseClassflip.BaseclassFli;

public class FlipkartTestNG extends BaseclassFli {
public WebDriver driver=null;
@Test(priority = 1)
public void browserLaunch() {
	driver=browserLaunch("chrome");
	getUrl("https://www.flipkart.com/");
}
@Test(priority = 2)
public void dismissPopup() {
	WebElement pop = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	clickOnWE(pop);
}
@Test(priority = 3)
public void searchProduct() {
	WebElement searcch = driver.findElement(By.name("q"));
	sendKeys(searcch, "iphone 14 pro max");
	}
@Test(priority = 4)
public void clickSearchButton() {
	WebElement subb = driver.findElement(By.cssSelector("[type=\"submit\"]"));
	clickOnWE(subb);
}
@Test(priority = 5,timeOut = 15000)
public void getTextOfProducts() throws InterruptedException {
	thread3();
	List<WebElement> apple=driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']"));
	for (WebElement print : apple) {
		String tex=print.getText();
	thread();
		if(tex.equals("APPLE iPhone 14 Pro Max (Silver, 1 TB)")) {
			System.out.println("Equals");
			print.click();
			break;
		}else {
			System.out.println("Not Equals");
			
		}
	}
	
	System.out.println("total items"+ "="+ apple.size());

}

@Test(enabled=false)
public void takeScreenshot() throws IOException {
	takeScreenshot("flipp");
		 
	
}
}
