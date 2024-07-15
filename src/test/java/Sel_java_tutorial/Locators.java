package Sel_java_tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//Maximize Window Screen
		
		driver.manage().window().maximize();
		
		//find element using locators-name
			
		driver.findElement(By.name("search")).sendKeys("iphone");
		
		//find element using locators-id
		
		boolean logo_element =driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo_element);
		
		//find elements using locators-linktext
		
		driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();  //not recommended mostly 
		
		//class Name
		List <WebElement>headerslinks = driver.findElements(By.className(""));
		System.out.println(headerslinks.size());
		
		//tagname
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		driver.quit();

	}

}
