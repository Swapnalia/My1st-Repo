package verification_usingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue 
{
  @Test
  public void True () 
  {
	  
	  boolean a=true;
	                     // jevha fail hoil tevhach printing statement run 
     Assert.assertTrue(a, "value of a is false TC failed");
	  
	  
  }
}
