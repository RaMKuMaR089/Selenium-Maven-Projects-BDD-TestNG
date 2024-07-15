package Sel_java_tutorial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigatePages {

	public static void main(String[] args) throws MalformedURLException 
	{
		//webdriver object declaration
		
		WebDriver driver = new ChromeDriver();
		
		//timer wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get or navigate url page
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		

		
		//URL myurl = new URL ("https://testautomationpractice.blogspot.com/");
		
		//driver.navigate().to("myurl");
		
		//maximize window 
		
		driver.manage().window().maximize();
		
		//2nd page navigatting
		
		driver.navigate().to("https://www.blogger.com/about/");
		
		//navigate to back page
		
		driver.navigate().back();
		
		//getting current url and print
		System.out.println(driver.getCurrentUrl());
		
	    String wid=driver.getWindowHandle();
		
		System.out.println( wid);
	
		
		// navigate to next page & getting current url and print
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		//set variable for windowhandles and printing
		
		Set<String> windowid = driver.getWindowHandles();
		
		//changing set to list variable to show as arraylist
		
	/*	List<String> winlist = new ArrayList<String>(windowid);
		
		System.out.println(windowid);
		
		//put variable for getting parent & child windows id
		
		String parentid = winlist.get(0);
		String childid = winlist.get(1);
		
		
		//switch to parent & child windows id
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());  */
		
		//refresh page
		driver.switchTo().window(wid);
		System.out.println(wid);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
		
		
		
		
		

	}

}
