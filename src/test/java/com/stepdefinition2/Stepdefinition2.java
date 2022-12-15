package com.stepdefinition2;

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

import com.baseClassflip.BaseclassFli;
import com.flipkart.Datadriven2;
import com.runnerClass2.RunnerClass2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition2 extends BaseclassFli{
	public static WebDriver driver=RunnerClass2.driver;
	@Given("user Launch The Application")
	public void user_launch_the_application() {
		getUrl("https://www.flipkart.com/");
		implicity();
	  
	}

	@When("user Enter The \"iphone 14 pro max\" In Search Box")
	public void user_enter_the_product_in_search_box() throws InterruptedException, IOException {
		WebElement searchb = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clickOnWE(searchb);
		thread();
		WebElement name = driver.findElement(By.name("q"));
//		String namee=Datadriven2.allData("Flipkart", 1, 0);
//		name.sendKeys(namee);
		sendKeys(name, "iphone 14 pro max");
		WebElement sub = driver.findElement(By.cssSelector("[type=\"submit\"]"));
		clickOnWE(sub);
		thread();
	   
	}

	@When("user Click The Required Product")
	public void user_click_the_required_product() throws InterruptedException {
		List<WebElement> apple=driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']"));
		for (WebElement print : apple) {
			Thread.sleep(1000);
			String text=print.getText();
			System.out.println(text);
		thread();
	
			if(text.equals("APPLE iPhone 14 Pro Max (Silver, 1 TB)")) {
				System.out.println("Equals");
				clickOnWE(print);
				break;
			}else {
				System.out.println("Not Equals");
				
			}
			
			
			}
	
		System.out.println("total items"+ "="+ apple.size());

		
	}
	
	
	@Then("user Get The Screenshot Of The Current Page")
	public void user_get_the_screenshot_of_the_current_page() throws IOException {
		TakesScreenshot tc=(TakesScreenshot) driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\puvana\\eclipse-workspace\\Flipkart\\screen\\flipkart.png");
		FileUtils.copyFile(src, des);
			 
		//Thread.sleep(5000);

	}
}

	