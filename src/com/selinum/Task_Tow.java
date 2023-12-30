
package com.selinum;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Tow {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\selinumpro\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("email")).sendKeys("dfjbehv");
	    driver.findElement(By.id("pass")).sendKeys("847484");
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(3000);
	    
	    Thread.sleep(3000);
	    TakesScreenshot conf= (TakesScreenshot) driver;
	     File reso = conf.getScreenshotAs(OutputType.FILE);
	     File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\selinumpro\\Screenshort\\FB.png");
	     
	     FileHandler.copy(reso, des);
	     
	     Navigation navig = driver.navigate();
	     navig.back();
	     Thread.sleep(3000);
	     
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	     Thread.sleep(3000);
	     
	     
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("lkpoun");
	     driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("fgr8fg");
	     driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567899");
	     driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Pj@12345");
	     
	     Thread.sleep(2000);
	     WebElement day = driver.findElement(By.id("day"));
	     Select s1= new Select(day);
	     s1.selectByIndex(3);
	     
	     WebElement month = driver.findElement(By.id("month"));
	     Select s2= new Select(month);
	     s2.selectByVisibleText("Feb");
	     
	     
	     WebElement year = driver.findElement(By.id("year"));
	     Select s3= new Select(year);
	     s3.selectByValue("2016");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	     Thread.sleep(3000);
	     
	     Thread.sleep(3000);
	     WebElement sigin = driver.findElement(By.xpath("//button[@name='websubmit']"));
	     sigin.click();
	     Thread.sleep(20000);
	
	     Thread.sleep(2000);
		 TakesScreenshot conf1= (TakesScreenshot) driver;
		 File reso1 = conf.getScreenshotAs(OutputType.FILE);
		 File des1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\selinumpro\\Screenshort\\FBS.png");
		 FileHandler.copy(reso1, des1); 
		 Thread.sleep(3000);
		    
		 
		 Navigation navig1 = driver.navigate();
		    navig1.back();
		    
		    Thread.sleep(3000);
		   Thread.sleep(1000);
		   driver.close();
	
	
	}

}
