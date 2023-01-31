package verification_usingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void nullcheck() 
  {
	  
	  String a=null;
	  Assert.assertNull(a, "a value is not null,TC failed");
  }
}
