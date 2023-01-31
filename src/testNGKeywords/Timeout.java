package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout
{
  @Test
  public void f() 
  {
	  
	  Reporter.log("TC F IS RUNNING", true);
  }
 
  @Test
  public void g() 
  {
	  Reporter.log("TC G IS RUNNING", true);
  }
  
  @Test(timeOut=100)
  public void h() throws InterruptedException 
  {
	  Reporter.log("TC H IS RUNNING", true);
	  Thread.sleep(200);
  }
  
  @Test
  public void i() 
  {
	  Reporter.log("TC I IS RUNNING", true);
  }
  
  @Test
  public void j() 
  {
	  Reporter.log("TC J IS RUNNING", true);
  }
  
  @Test
  public void k() 
  {
	  Reporter.log("TC K IS RUNNING", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
