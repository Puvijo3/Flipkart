package com.baseClassflip;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseclassFli{
	public static WebDriver driver=null;
	public static WebDriver browserLaunch(String value) {
		if(value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\puvana\\eclipse-workspace\\AdactinPro\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\puvana\\\\eclipse-workspace\\\\AdactinPro\\\\driver\\\\edgedriver.exe");
		driver=new EdgeDriver();
		}
		else if(value.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\puvana\\eclipse-workspace\\AdactinPro\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void getUrl(String value) {
		driver.get(value);
		
	}
	public static void implicity() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static String getTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void takeScreenshot(String filename) throws IOException {
		TakesScreenshot tc=(TakesScreenshot) driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\puvana\\eclipse-workspace\\Flipkart\\screen\\"+filename+".png");
		FileUtils.copyFile(src, des);
	}
	public static void sendKeys(WebElement element,String value) {
		element.sendKeys(value);
		
	}
 public static void clickOnWE(WebElement element) {
	 element.click();
	 
 }
 public static void cleartext(WebElement element) {
	 element.clear();
 }
 public static void thread() throws InterruptedException {
	 Thread.sleep(1000);
 }
 public static void thread5() throws InterruptedException {
	 Thread.sleep(5000);
 }
 public static void thread3() throws InterruptedException {
	 Thread.sleep(3000);
 }
 public static void thread10() throws InterruptedException {
	 Thread.sleep(10000);
 }
 public static void isEnabled(WebElement element) {
	 boolean enabled = element.isEnabled();
	 System.out.println("element status"+ enabled);
 }
 public static void selectValue(WebElement element ,String value) {
	 Select sel=new Select(element);
	 sel.selectByValue(value);
 }
 public static void getText(WebElement element) {
	 String texx = element.getText();
	 System.out.println(texx);
	 
 }
}
