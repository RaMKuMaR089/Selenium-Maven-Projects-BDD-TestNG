package Sel_java_tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Browser {

	public static void main(String[] args) 
	{
		//1.Launch Webdriver...
		
		// For Chrome Driver
		
		//ChromeDriver driver = new ChromeDriver();
		
		     // WebDriver driver = new ChromeDriver();
		      
		   // For Edge Driver 
		      WebDriver driver = new EdgeDriver();
		      
		  
		  //2. Open URL https://demo.opencart.com/
		  
		      driver.get("https://demo.opencart.com/");
		      
		 //3. Validate Title
		      
		      String act_title = driver.getTitle();
		      
		      if(act_title.equals("Your Store"))
		    	  
		      {
		    	  System.out.println("Test Passed");
		      }
		      
		  //4. Close WebDriver
		      
		     // driver.close();
		        driver.quit();		     
		      
		      
		

	}

}
