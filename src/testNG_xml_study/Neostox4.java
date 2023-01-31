package testNG_xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox4 
{
	@Test(groups = "reg")
       public void f() 
	  {
		  Reporter.log("f is running", true);
	  }
	  @Test(groups = "sanity")
	  public void g() 
	  {
		  Reporter.log("g is running", true);
	  }
	  
	  @Test(groups = {"reg","sanity"})
	  public void e() 
	  {
		  Reporter.log("e is running", true);
	  }
	  
	  @Test
	  public void h() 
	  {
		  Reporter.log("h is running", true);
	  }
}
