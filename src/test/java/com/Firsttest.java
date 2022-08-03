package com;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firsttest {

	    public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://trytestingthis.netlify.app/");
        
 //This is for fill first name and Lastname textboxes.
            WebElement fn= driver.findElement(By.id("fname"));
            fn.sendKeys("Anandhu");
            WebElement ln= driver.findElement(By.id("lname"));
            ln.sendKeys("Vijayan");
          
 //This is for selecting gender radio button.
            WebElement cb= driver.findElement(By.id("male"));
            cb.click();
            
            
 //This is for Select options from drop down
            WebElement Option=driver.findElement(By.id("option"));
    		Select select=new Select(Option);
    		select.selectByIndex(3);
    		
    		
    		//driver.findElement(By.name("option2")).click();
//    	     driver.findElement(By.xpath("//input[@name ='option2']"))
//    	     .click();
    	    // WebElement fruitsdropdown = driver.findElement(By.name("Options"));
//    	     
//    	     driver.findElement(By.xpath("//input[@name='Options']")).sendKeys("s");
//    	     Thread.sleep(3000);
    	     
//    	     driver.findElement(By.xpath("//input[@name='Options']")).sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//    	     Thread.sleep(3000);
//    	     driver.findElement(By.xpath("//input[@name='Options']")).sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//    	     Thread.sleep(3000);
    		
    		//This is for choosing options from check boxes
    		 driver.findElement(By.xpath(" //*[@id='moption'][2]")).click();
    		 
    		 
 // This is for selecting suggestion keyword from drop down
    		 Robot robot = new Robot();
    	     //  Actions a = new Actions(driver);
    	     WebElement fruitsSection= driver.findElement(By.xpath("//input[@name='Options']"));
    	     // fruitsSection.sendKeys("s");
    	     Thread.sleep(1000);
    	     fruitsSection.sendKeys("s");
    	     // a.moveToElement(fruitsSection).click().perform();
    	     // a.sendKeys("s").build().perform();
    	     Thread.sleep(1000);
    	     Thread.sleep(1000);
    	     robot.keyPress(KeyEvent.VK_UP);
    	     Thread.sleep(1000);
    	     robot.keyPress(KeyEvent.VK_ENTER);
    	     Thread.sleep(1000);
//    	     a.
//    	     a.keyUp(Keys.ARROW_UP).build().perform();
////    	     a.keyUp(Keys.UP).build().perform();
//    	     Thread.sleep(2000);
//    	     a.keyDown(Keys.UP).build().perform();
//    	     a.keyDown(Keys.ENTER).build().perform();  
    	     

    	     
    	     
    	
    	     
    	     
    	     
//    	     WebElement fruitsdropdown = driver.findElement(By.name("Options"));
//    	     
//    	     Select fruits = new Select (fruitsdropdown); 
//			 fruits.selectByIndex(0); 
    	  
    	     //driver.findElement(By.name("Options")).sendKeys("s"); 
    	     //driver.findElement(By.id("datalists")).click();
    	  
    	

//    	     Thread.sleep(1000);      
//           driver.findElement(By.xpath("//input[@type='submit']")).click();
//           //sendKeys("C://Users//factweavers//OneDrive//Desktop//testfile.txt");
//           //put path to your image in a clipboard
//            StringSelection ss = new StringSelection("C://Users//factweavers//OneDrive//Desktop//testfile.txt");
//             Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//       //imitate mouse events like ENTER, CTRL+C, CTRL+V
//       // Robot robot = new Robot();
//        robot.delay(250);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.delay(90);
//        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
     
    	 
  
        Thread.sleep(1000);
        
// This is for click on the color picker    
//        driver.findElement(By.xpath("//input[@id='favcolor']")).click();
          WebElement colorelm=driver.findElement(By.xpath("//input[@id='favcolor']"));
          colorelm.click();
        
//This is for scroll down the page.        	
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1000);
        
//This is for select one color from color picker.  
          
          JavascriptExecutor jse=(JavascriptExecutor)driver;
          jse.executeScript("document.getElementByid('colorelm').value='#00ced1'");
         
          
          
         // js.executeScript("document.getElementByid('colorelm').value='#3D3D3D'");
          Thread.sleep(2000);
          driver.close();
          
          

	    }
	    }


	
    	   
    	     
    	     
 
        
        
       
	