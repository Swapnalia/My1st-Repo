package verification_usingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertStudy {
  @Test
  public void myTest1() 
  {
	  
	  String a=null;
	  String b="abc";
	  
	  SoftAssert as=new SoftAssert();
	  as.assertNull(b, "b is not null TC failed");
	  as.assertNotNull(a, "a is null TC failed");
	  as.assertAll();
	  
	  
  }
}
