package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider
{
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException  //Initializing driver...
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	
	@Test(dataProvider="dp") //mention here dataprovider and its declared name...
	void test_source(String user, String pass) //statements for testing source...
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean status = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
		
		if(status==true)
		{
			System.out.println("Test Passed.....");
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Assert.assertTrue(true); //if validation true means rest of code will executes
		}
		else
		{
			System.out.println("Test failed.....");
			Assert.assertTrue(false); //if validation fail...
		}
	}
	
	@AfterClass
	void teardown()   // Closing driver...
	{
		
			driver.quit();
		
	}
	
	@org.testng.annotations.DataProvider(name="dp",indices= {0,4}) //annotation of dataprovider....
	Object[][] LoginData()  // method for logindata ...why Object means array can hold different kinds of data...
	{
		Object data[][] = {
				
				{"Admin","admin123"}, //valid
				{"Admin1","admin1"},  //Invalid
				{"Admin2","admin13"}, //Invalid
				{"Admin","admin1234"},  //Invalid
				{"Admin","admin123"}  //valid
	                     	};
		return data;
		
	}

}
