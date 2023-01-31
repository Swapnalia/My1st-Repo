package testNG_xml_study;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox1 {
  @Test
  public void a() 
  {
	  Reporter.log("a is running", true);
  }
  @Test 
  public void b() 
  {
	  //Assert.fail();
	  Reporter.log("b is running", true);
  }
  
  @Test
  public void c() 
  { Assert.fail();
	  Reporter.log("c is running", true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("d is running", true);
  }
}

