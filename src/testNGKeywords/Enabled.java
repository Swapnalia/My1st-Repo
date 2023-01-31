package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled 
{
	// in this case if i want to not print or run any case
	// that time i will use enabled keyword and cancel that testcase
  @Test(enabled=false) 
  public void a()
  {
	 Reporter.log("TC a is running", true);
  }
  @Test
  public void b() 
  {
	 Reporter.log("TC b is running", true);
  }
  @Test
  public void c() 
  {
	 Reporter.log("TC c is running", true);
  }
  @Test
  public void d() 
  {
	 Reporter.log("TC d is running", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
