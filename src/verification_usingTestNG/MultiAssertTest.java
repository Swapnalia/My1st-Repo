package verification_usingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiAssertTest 
{
	  String a=null;
	  String b="ABC";
	  String c="ABC";
  @Test
  public void checkNotnull() 
  {
	 Assert.assertNotNull(b, "b value is null TC is failed"); 
	 Assert.assertNotNull(a, "a value is null TC is failed"); 
  }
  
  public void Equals()
  {
	  Assert.assertEquals(a,b,"a and b are are not equals, TC failed");
	  Assert.assertEquals(b,c,"b and c are not equals,TC failed");
	  
  }
  
  
  
  
  
}
