package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver1;		
		@Test				
		public void testEasy() {	
			driver1.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver1.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
			System.out.println(title);
			System.out.println("Success!!!");
			System.out.println("Success 2!!!");
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		    driver1 = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver1.quit();			
		}		
}	