package verification_usingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void checkfail() 
  {
	  Assert.fail();
	 
	  Reporter.log("hii", true);
  }
}
