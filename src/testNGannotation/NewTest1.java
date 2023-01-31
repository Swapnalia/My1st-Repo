package testNGannotation;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void addtocart()//this is a method 
  {
	  Reporter.log("add to cart is running", true);
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("log in is going on", true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logging out ", true);
	  Reporter.log("========================", true);
  }
  
  @Test
  public void shop()//this is a method 
  {
	  Reporter.log("shopping method is running", true);
  }
  
  //so execution will be like 
  //1st before method will be run
  // then test or my method
  // then after method will be run.
  // after and before methods will run everytime of execution of each testcase
  
}
