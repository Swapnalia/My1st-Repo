package neostoxTESTclasses2;

import org.testng.annotations.Test;
import neostoxBase.Base;
import neostoxUtility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateNeostoxLogin extends Base 

{  neostoxPOMclass1.Dashboard_neostox dash;
	neostoxPOMclass1.HomePageNeostox home;
	neostoxPOMclass1.PasswordNeostox pass;
	neostoxPOMclass1.SignIn_ButtonNeostox sign;
	String s="TCID-1234";
  
  @BeforeClass
  public void LaunchNeostox() 
  {
	 launchBrowser(); 
	home = new neostoxPOMclass1.HomePageNeostox(driver);
	sign =new neostoxPOMclass1.SignIn_ButtonNeostox(driver);
	pass = new neostoxPOMclass1.PasswordNeostox(driver);
	dash =new neostoxPOMclass1.Dashboard_neostox(driver);
	
	
  }
  
  
  @BeforeMethod
  public void LoginToNeostox() throws IOException, InterruptedException
  {   
	  home.ClickonSignInButton();
	  Thread.sleep(2000);
	  sign.MobileNoField(Utility.ReadDataFromExcel(0, 0));
	  Thread.sleep(1000);
	  sign.SignInField();
	  Utility.implicitWait(1000, driver);
	  pass.EnterPassword(Utility.ReadDataFromExcel(0, 1));
	  pass.ClickOnSignIn();
	  Utility.implicitWait(1000, driver);
	  dash.PopupHandling(driver);
	  
  }
  @Test
  public void ValidateUserName() throws IOException 
  {
	  Assert.assertEquals(dash.GetActualUserName(), Utility.ReadDataFromExcel(0, 2),"actual and expected result not match assert failed");
	 Utility.TakeScreenShot(driver, s); 
	  
  }
  

  @AfterMethod
  public void LogoutFromNeostox() throws InterruptedException 
  {
	  dash.ClickOnlogout();
  }


  @AfterClass
  public void CloseNeostoxBrowser() throws InterruptedException 
  {
	  driver.close();
	  Thread.sleep(1000);

  }

}
