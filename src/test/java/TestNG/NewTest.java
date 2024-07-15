package TestNG;

import org.testng.annotations.Test;

public class NewTest
{
 
	@Test(priority=2)
  public void welcome() 
  {
	  System.out.println("Welcome to testng");
  }
  
	@Test (priority=1)
  public void hello()
  {
	  System.out.println("Hello there");
	  
  }
}
