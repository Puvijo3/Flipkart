package com.testNGflip;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseClassflip.BaseclassFli;
import com.flipkart.Datadriven2;
import com.property.ConfigurationHelperF;
import com.web.pomflip.SdpFlip;
import com.web.pomflip.SelectProduct;

public class Flipkrtpom extends BaseclassFli{
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException, IOException {
		String browser=ConfigurationHelperF.getInstance().getBrowser();
	driver=browserLaunch(browser);
	SdpFlip sf=new SdpFlip(driver);
	String url=ConfigurationHelperF.getInstance().getUrl();
	getUrl(url);
	clickOnWE(sf.getSearchProduct().getPop());
	String sheet=ConfigurationHelperF.getInstance().getSheet();
	String namee=Datadriven2.allData(sheet, 0, 0);
	sendKeys(sf.getSearchProduct().getSearcch(), namee);
	clickOnWE(sf.getSearchProduct().getSubb());
	thread5();
	for (WebElement print:sf.getSelectProduct().getApple()) {
		String tex=print.getText();
	thread();
	System.out.println("total items"+ "="+ sf.getSelectProduct().getApple().size());
		if(tex.equals("APPLE iPhone 14 Pro Max (Silver, 1 TB)")) {
			System.out.println("Equals");
			print.click();
			break;
		}else {
			System.out.println("Not Equals");
			
		}
	}
	thread10();
	takeScreenshot("fli");

	
	}
}