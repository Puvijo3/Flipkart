package com.flipkart;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
			static void screen() throws InterruptedException, IOException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\puvana\\eclipse-workspace\\Miniproject\\chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(1000);
			WebElement name = driver.findElement(By.name("q"));
			String namee=Datadriven2.allData("Flipkart", 1, 0);
			name.sendKeys(namee);
			driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
			Thread.sleep(1000);
			List<WebElement> apple=driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']"));
			for (WebElement print : apple) {
				Thread.sleep(1000);
				String text=print.getText();
				//System.out.println(text);
			Thread.sleep(1000);
			print.click();
				if(text.equals("APPLE iPhone 14 Pro Max (Silver, 1 TB)")) {
					System.out.println("Equals");
					
					break;
				}else {
					System.out.println("Not Equals");
				}
				
				
				}
			System.out.println("total items"+ "="+ apple.size());

			TakesScreenshot tc=(TakesScreenshot) driver;
			File src=tc.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\puvana\\eclipse-workspace\\Flipkart\\screen\\flipkart.png");
			FileUtils.copyFile(src, des);
				 
			Thread.sleep(5000);
			
			
			
//			Thread.sleep(1000);
//			driver.quit();

	}
			public static void main(String[] args) throws InterruptedException, IOException {
				screen();
			}  

}
