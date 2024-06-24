package com.automationmavenjenkins.Automationmavenjenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LaunchTest {

	static String url;
	static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		 driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void launch() {

		url = "https://www.amazon.in";

		driver.get(url);

	}
	
	
}
