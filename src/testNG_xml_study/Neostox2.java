package testNG_xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox2 {

	@Test
	  public void f() 
	  {
		  Reporter.log("f is running", true);
	  }
	  @Test
	  public void g() 
	  {
		  Reporter.log("g is running", true);
	  }
	  
	  @Test
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
