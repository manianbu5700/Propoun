package com.selinum;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Short {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selinumpro\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.instagram.com/");
	     driver.manage().window().maximize();
	     
	     TakesScreenshot conf= (TakesScreenshot) driver;
	     File reso = conf.getScreenshotAs(OutputType.FILE);
	     File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\selinumpro\\Screenshort\\IG.png");
	     
	     FileHandler.copy(reso, des);
	
	
	
	
	
	}
	
	
	

}
