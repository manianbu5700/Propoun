package com.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selinumpro\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");	
	    driver.manage().window().maximize();
	    
	    
	    
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    
	    
	    
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    Thread.sleep(4000);
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(5000);
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().sendKeys("alertalertalert");
	    driver.switchTo().alert().accept();
	
	
	
	}
}
