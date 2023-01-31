package testNGannotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest 
{
  @Test
  public void validateTheUserName() 
  {Reporter.log("validating user name is going on", true);
  }
  @BeforeMethod
  public void ValidateLoginId() 
  {Reporter.log("validatin glogin id is going on", true);
  }

  @AfterMethod
  public void Logout() 
  {Reporter.log("log out from appl is contineu is going on", true);
  }

  @BeforeClass
  public void LaunchUrl() 
  {Reporter.log("Launching url is going on", true);
  }

  @AfterClass
  public void CloseUrl() 
  {Reporter.log("closing url is going on", true);
  }

}
