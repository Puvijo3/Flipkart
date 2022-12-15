package com.runnerClass2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseClassflip.BaseclassFli;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature//Flipkart.feature", glue="com.stepdefinition2",monochrome=true,plugin= {"pretty",
        "html:Reports/htmlReport.html",
        "json:Reports/jsonreport.json",
        "junit:Reports/junitReport.xml",
        //"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
        })

public class RunnerClass2 extends BaseclassFli{


	public static WebDriver driver=null;
	@BeforeClass
	public static void setUp() {
		driver=browserLaunch("chrome");		
		

	}
	@AfterClass
	public static void tearDown() {
close();
	}



}
