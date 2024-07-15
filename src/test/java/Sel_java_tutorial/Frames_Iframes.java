package Sel_java_tutorial;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames_Iframes
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//open web url
		driver.navigate().to(" https://ui.vision/demo/webtest/frames/");
		//maximize page
		driver.manage().window().maximize();
		//switch to frame 1 by getting xpath
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
	    driver.switchTo().defaultContent();
	    
	    //Switch to next frame2
	    WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
	    driver.switchTo().defaultContent();
	    
	    //Switch to frame3
	    	   
	    WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	    driver.switchTo().frame(frame3);
	    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
	    
	    //Switch to iframe
	     //before we have exit from every frame   
	     driver.switchTo().frame(0);
	     //driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	     
	     //or using javascript executor for clicking radiobuttons
	     
	    WebElement rbutton = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",rbutton);
	    
	    
	}

}
