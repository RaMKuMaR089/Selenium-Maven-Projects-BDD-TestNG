package Sel_java_tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown 
{
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select selecting = new Select(drpdown);
		
		//selecting.selectByVisibleText("India"); //using selectByVisibleText()
		
		//selecting.selectByValue("japan");  //using selectByValue()
		
		selecting.selectByIndex(5);  //using selectByIndex()
		
		
		
		
		
		
		
	}
	}
