package Sel_java_tutorial;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertBoxes 
{
	public static void main (String args[]) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		//Explicit wait declaration		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//get url
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		//find xpath
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//using switch to condition for alert
		Alert myalert= driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		myalert.accept();		
		Thread.sleep(2000); 
		
		//using explicit wait instead of using switchTo statements
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		//using explicit wait instead of using switchTo statements
		Alert mialert = wait.until(ExpectedConditions.alertIsPresent());
	
		System.out.println(mialert.getText());
		Thread.sleep(2000);
		//mialert.accept();
		mialert.dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		System.out.println(mialert.getText());
		Thread.sleep(2000);
		mialert.sendKeys("HII BUDDY");
		Thread.sleep(2000);
		mialert.accept();
		//mialert.dismiss();	
		driver.close();
	}}
