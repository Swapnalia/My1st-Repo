package pomClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class ValidateNeostoxUserName
{
		WebDriver driver;
		HomePageNeostox home;
		SignIn_ButtonNeostox sign;
		PasswordNeostox pass;
		Dashboard_neostox dash;    // we also need excel data so we use file
		File myfile;
		Sheet mysheet;
		@BeforeClass
		public void launchNeostox() throws EncryptedDocumentException, IOException
{
	// first we launch the browser..then reporter .log
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://neostox.com/sign-in");//first we launch the url
		 driver.manage().window().maximize();
		 Reporter.log("launching Neostox broeser ", true);
		 // initialize all the object here
		 home= new HomePageNeostox(driver);
		 sign =new SignIn_ButtonNeostox(driver);
		 pass= new PasswordNeostox(driver);
		 dash=new Dashboard_neostox(driver); 
		 myfile=new File("C:\\Users\\SWAPNALI\\OneDrive\\Documents\\Automation\\Excel\\Book1.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	
	
	
}
	
	@BeforeMethod
		public void loginNeostox() throws InterruptedException
		{Reporter.log("ClickinOn Sign In Button ", true);
		home.ClickonSignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Reporter.log("Enter Mobile Number ", true);
		sign.MobileNoField(mysheet.getRow(0).getCell(0).getStringCellValue());
		
		Reporter.log("Click On Sign In Button ", true);
		sign.SignInField();
		
		Reporter.log("Enter Password ", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pass.EnterPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(100);
		
		Reporter.log("Click On Sign In Button ", true);
		pass.ClickOnSignIn();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Popup Handle", true);
		dash.PopupHandling();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
	
  @Test
        public void ValidateUserName()
 {
		  Reporter.log("Get Actual UserName ", true);  
		  String expUserName = mysheet.getRow(0).getCell(2).getStringCellValue();
		  String ActualUserName = dash.GetActualUserName();
		    // when i have actual..expected result and i want to validate it how i can?
		   // by using assert
		  Assert.assertEquals(ActualUserName, expUserName ,"Actual and expected user name are not matching TC failed");
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 }
  @AfterMethod
		  public void logOutFromNeostox() throws InterruptedException 
{
		   dash.clickOnUsername();
           Thread.sleep(2000);
		   dash.ClickOnlogout();
			Reporter.log("Log Out From Neostox ", true);
}
	 @AfterClass  
		 public void closeWindow() throws InterruptedException  
{
		 
		    Thread.sleep(1000);
			 Reporter.log("Closing Browser ", true);
			 driver.close(); 
}




}
