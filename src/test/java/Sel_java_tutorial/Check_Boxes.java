package Sel_java_tutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Boxes {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//checkboxes.get(0).click(); //getting single check box click
		
		/* for (int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
			
	    }  */
		
		/* //for selecting checkboxes using enhanced for loop
		
		for (WebElement checkbox1:checkboxes)
		{
			checkbox1.click();
		}  
		
		Thread.sleep(200);
		
		//for unselecting checkboxes
		
		for (WebElement checkbox1:checkboxes)
		{
			checkbox1.click();
		}  */
		
		////for selecting only last 3 checkboxes using  for loop
		
		 for (int i=3;i<checkboxes.size();i++)
			{
				checkboxes.get(i).click();				
				
		    }  
		 
		 Thread.sleep(200);
		 
	      //Unselecting check boxes
		 for (int i=3;i<checkboxes.size();i++)
			{
				if(checkboxes.get(i).isSelected())
				{
					checkboxes.get(i).click();	
				}
				
		    }  
	
		
		
		

	}}
