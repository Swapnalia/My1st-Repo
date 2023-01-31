package verification_usingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void nullcheck() 
  {
	  
	  String a="abs";
	  Assert.assertNull(a, "a value is null,TC passed");
  }
}
