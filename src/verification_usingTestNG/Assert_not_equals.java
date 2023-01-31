package verification_usingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_not_equals {
  @Test
  public void f() 
  { //1***********
	  String a= "selenium";
	  String b="java";
	                               // this is assertion error message
	  Assert.assertNotEquals(a, b,"a and b are not matching TC passed");
	  
	  /* whenever we want to check that 2 strings are not matched that 
	   * time we used not matched*/
	   
	  //2****************
	  
	  String c= "pune";
	  String d="pune";
	  Assert.assertNotEquals(c,d,"c and d are matched so TC failed");
	  
	  
	  
  }
}
