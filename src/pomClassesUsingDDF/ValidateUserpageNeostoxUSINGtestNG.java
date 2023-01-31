package pomClassesUsingDDF;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserpageNeostoxUSINGtestNG
	{ WebDriver driver;
	HomePageNeostox home;
	SignIn_ButtonNeostox sign;
	PasswordNeostox pass;
	Dashboard_neostox dash;
	String s= "TCID1";/////// IF I WANT TO TAKE SCEREENSHOT WHEN MY TC IS PASSED
	// I SIMPLY ONLY WRITE IT AFTER THE VALIDATION 
   @BeforeClass 
   public void LaunchBrowser() 
   {
       // we also need excel data so we use file
   
	// first we launch the browser..then reporter .log
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://neostox.com/sign-in");//first we launch the url
	 //driver.manage().window().maximize();
	 Reporter.log("launching Neostox broeser ", true);
	 // initialize all the object here
	 home= new HomePageNeostox(driver);
	 sign =new SignIn_ButtonNeostox(driver);
	 pass= new PasswordNeostox(driver);
	 dash=new Dashboard_neostox(driver); 
   }
 
	@BeforeMethod
	public void loginToNeostox() throws IOException, GeneralSecurityException, InterruptedException
	{
	 home.ClickonSignInButton();
	 GeneralMethod.implicitWait(5000, driver);
	 
	 //here i used prevoius methods and that use parameters from general method
	 sign.MobileNoField(GeneralMethod.ReadDataFromExcel(0, 0));
	 sign.SignInField();
	 
	 GeneralMethod.implicitWait(1000, driver);
	 pass.EnterPassword(GeneralMethod.ReadDataFromExcel(0, 1));
	 Thread.sleep(1000);
	 pass.ClickOnSignIn();
	 
	 //next is dashboard it have popmup so give max time
	 GeneralMethod.implicitWait(5000, driver);
	 
	 dash.PopupHandling();
	 GeneralMethod.implicitWait(5000, driver);
	}
		
	  @Test
	  public void ValidateNeostoxApp() throws IOException 
	{
	   Assert.assertEquals(dash.GetActualUserName(), GeneralMethod.ReadDataFromExcel(0, 2),"Actual And expected User names ARE NOT MATCHED TC failed");
       dash.clickOnUsername();
	   GeneralMethod.TakeScreenShot(driver, s);
	}
		 
	  @AfterMethod
	   public void logoutFromNeostox()
   {
	  GeneralMethod.implicitWait(1000, driver);
		
	 dash.ClickOnlogout();
		
	 }
	 
	 @AfterClass
	 public void closeBrowser()
	 {
		 driver.close();
	 }
}
