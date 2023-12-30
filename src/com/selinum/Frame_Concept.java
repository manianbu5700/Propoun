package com.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
	
	    public static void main(String[] args) throws InterruptedException {
			
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\selinumpro\\Driver\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://letcode.in/frame");
	    	driver.manage().window().maximize();
	    	
	    	driver.switchTo().frame("firstFr");
	    	WebElement finame = driver.findElement(By.name("fname"));
	    	finame.sendKeys("poun");
	        
	    	Thread.sleep(5000);
	    	WebElement childframe= driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	    	driver.switchTo().frame(childframe);
	    	
	    	WebElement email = driver.findElement(By.name("email"));
	    	email.sendKeys("poun123@gmail.com");
	    	
	    	driver.switchTo().parentFrame();
	    	
	    	WebElement lname = driver.findElement(By.name("lname"));
	    	lname.sendKeys("kumar");
	    	
	    	driver.switchTo().defaultContent();
	    	
	    	//driver.switchTo().frame("homepage")
	    	WebElement down = driver.findElement(By.xpath("//a[text()='Watch tutorial']"));
	    	down.click();	    	
		}
	
	}
	
	
	


