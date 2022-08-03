package com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rahulshettyacademy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement userName= driver.findElement(By.id("inputUsername"));
        userName.sendKeys("ANANDHU");
        WebElement pass= driver.findElement(By.name("inputPassword"));
        pass.sendKeys("Anandhu");
        driver.findElement(By.className("signInBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String error= driver.findElement(By.cssSelector(".error")).getText();
        System.out.println("error is :" + error);
        driver.findElement(By.linkText("Forgot your password?")).click();
        WebElement nm= driver.findElement(By.xpath("//input[@placeholder='Name']"));
        nm.sendKeys("ANANDHU");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("anandhuvijayan010@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8281222908");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//button[@class='reset-pwd-btn']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//button[@class='go-to-login-btn']")).click();
        WebElement un= driver.findElement(By.id("inputUsername"));
        un.sendKeys("ANANDHU");
        WebElement pw= driver.findElement(By.name("inputPassword"));
        pw.sendKeys("rahulshettyacademy");
        
        Thread.sleep(3000);
        driver.findElement(By.className("signInBtn")).click();
        
        
        Thread.sleep(5000);
        driver.close();
        

        
        	
       
	}

}
