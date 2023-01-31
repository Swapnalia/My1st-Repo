package verification_usingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse 
{
  @Test
  public void checkfalse()
  {
	 
	  boolean b=false;
	  
	  Assert.assertFalse(b, "b is true TC is failed");
	  
	  
  }
}
