package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn 
{
	//in this case 3 will depend upon case 1...
	// if case 1 is execute then 3 execute.
  @Test
  public void tc1() 
  {
	  Reporter.log("tc 1 is running", true);
  }
  
  @Test(enabled=false)
  public void tc2() 
  {
	  Reporter.log("tc 2 is running", true);
  }
  
  @Test(dependsOnMethods= {"tc1"})
  public void tc3() 
  {
	  Reporter.log("tc 3 is running", true);
  }
  
  @Test
  public void tc4() 
  {
	  Reporter.log("tc 4 is running", true);
  }
  
  @Test
  public void tc5() 
  {
	  Reporter.log("tc 5 is running", true);
  }
}
