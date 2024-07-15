package TestNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Param_series_parallel //cross browser testing using parameterization with series/sequential and parallel testing
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"Browser","url"})
	void setup(String br,String url) throws InterruptedException // br is a variable which is getting from value from xml file
	{
		switch (br.toLowerCase())// select browser type from xml file
		{
			case "chrome" :driver =new ChromeDriver();break;
			
			case "edge" :driver =new EdgeDriver();break;
			
			default : System.out.println("Invalid Browser...!!!"); return;		//return will terminates remain statements	
		}		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	@Test(priority=1)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
	}
	@Test(priority=2)
	void menucheck()
	{
		boolean status = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
	    Assert.assertEquals(status,true);
	    System.out.println("status verified ok");
	}
	@AfterClass
	void teardown()   // Closing driver...
	{
		
			driver.quit();
		
	}
	
	
}
