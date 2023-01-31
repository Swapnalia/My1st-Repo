package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
	//in this case...if i want to run one perticular test first then 
	// i put a priority to them and then it will execute among priority.
  @Test
  public void loginbutton()
  {
	  Reporter.log("login is valid", true);
  }
  
@Test(priority=3)
public void signup()
{
	  Reporter.log("sign up  is valid", true);
}

@Test(priority=5)
public void logout()
{
	  Reporter.log("log out is valid", true);
}

@Test(priority=2)
public void pagelayout()
{
	  Reporter.log("pageboarder is valid", true);
}

@Test(priority=4)
public void submitbutton()
{
	  Reporter.log("submit button is valid", true);
}

@Test(priority=1)
public void passwordfield()
{
	  Reporter.log("passwordfield  is valid", true);
}
}