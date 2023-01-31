package verification_usingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertStudy2 
{
	SoftAssert as=new SoftAssert();
  @Test
  public void myTest1() 
  {// all methods are nonstatic
	  
	  String a=null;
	  String b="abc";
	  
	  SoftAssert as=new SoftAssert();
	  as.assertNull(b, "b is not null TC failed");
	  as.assertNotNull(a, "a is null TC failed");
	  as.assertAll();
  }
	  // jevha 2 methods astil and aaplyala same object use karaycha asen tr tyala
      // to object globally declaired karaycha.
	  
  @Test
  public void myTest2() 
  {
	   boolean a= true;
	   boolean b=false;
	  as.assertTrue(b,"b is false so TC is failed");
	  as.assertFalse(a,"a is true so TC failed");
	  as.assertAll();
  }
	  
	  
  }

