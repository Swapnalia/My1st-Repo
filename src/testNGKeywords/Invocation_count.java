package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count 
{
	//when we have multiple test cases and from that i want to
	//run one test case multiple times
	// at that time we used invocation count
	
  @Test(invocationCount= 3) 
  public void TC1()
  {
	 Reporter.log("Test case 1 is running", true); 
  }
  @Test
  public void TC2()
  {
	  Reporter.log("Test case 2 is running", true); 
  }
  
  @Test
  public void TC3()
  {
	  Reporter.log("Test case 3 is running", true);  
  }
  
  @Test
  public void TC4()
  {
	  Reporter.log("Test case 4 is running", true); 
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
