package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple_keywords {// jo depend asto to sglyat shevti run hoto......
  @Test
  public void a() 
  {
	  Reporter.log("a is runing", true);
  }
  
  @Test(dependsOnMethods ={"d","a"})
  public void b() 
  {
	  Reporter.log("b is runing", true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("c is runing", true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("d is runing", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
