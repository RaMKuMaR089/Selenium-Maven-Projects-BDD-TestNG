package Sel_java_tutorial;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AirTicketBooking_UsingWebTable
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://blazedemo.com/reserve.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		

	}

}
