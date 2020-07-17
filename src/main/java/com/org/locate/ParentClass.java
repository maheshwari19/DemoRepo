package com.org.locate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentClass {
public static WebDriver driver;
static String url="https://www.facebook.com/";
public static WebDriver getDriver(String browser){
	if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();//launch chrome
	}
	else if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\chromedriver.exe");
		driver=new FirefoxDriver();//launch mozilla firefox
	}
	else{
		System.out.println("Please pass correct browser property");
	}
	driver.get(url);
	return driver;
}
public void buttonclick(WebElement btnclick){
	btnclick.click();
}
}
