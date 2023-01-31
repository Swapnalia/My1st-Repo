package verification_usingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void f() 
  {
	  String a="abc";
	  String b="abc";
	  Assert.assertEquals(a, b,"String not same TC failed");//we called it assertion error massage..if test fail then it shown
	  // in this i am checking that whatever 2 things i am compARING THEY ARE both matched 
	  // or not.
	  /*jya 2 goshti comp karnar tya matching aahet ki nahi he check krto*/
	  
  }
}
