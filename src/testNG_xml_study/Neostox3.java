package testNG_xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox3 
{
	@Test(groups="reg")
	  public void a() 
	  {
		  Reporter.log("a is running", true);
	  }
	  @Test(groups = {"sanity","reg"})
	  public void b() 
	  {
		  Reporter.log("b is running", true);
	  }
	  
	  @Test
	  public void c() 
	  {
		  Reporter.log("c is running", true);
	  }
	  
	  @Test(groups = "reg")
	  public void d() 
	  {
		  Reporter.log("d is running", true);
	  }
}


