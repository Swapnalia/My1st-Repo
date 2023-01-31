package pomClassesUsingDDF;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassNeostox 
{


	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://neostox.com/sign-in");//first we launch the url
		 driver.manage().window().maximize();
// get data from excelsheet
		File Myfile =new File("C:\\Users\\SWAPNALI\\OneDrive\\Documents\\Automation\\Excel\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		String mobnumb = mysheet.getRow(0).getCell(0).getStringCellValue();
		String pass = mysheet.getRow(0).getCell(1).getStringCellValue();
		String Uid = mysheet.getRow(0).getCell(2).getStringCellValue();
		
// create the object of N.H.P becoz it is non static 
	   HomePageNeostox Home = new HomePageNeostox(driver);
 //by using object call the all methods present in previous class
	   Home.ClickonSignInButton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
// handle the mobile no.field 
		 
		 
		 
		 SignIn_ButtonNeostox  MobileNo =new SignIn_ButtonNeostox (driver);
		 MobileNo.MobileNoField(mobnumb);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
 //handle submit button field
		 MobileNo.SignInField();
		 
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
// handle password field
		 PasswordNeostox password1 = new PasswordNeostox(driver);
		 password1.EnterPassword(pass);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
 // handle password submitbutton field
		 password1.ClickOnSignIn();
		 
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//handle pop up
		 Dashboard_neostox popup =new Dashboard_neostox (driver);
		 popup.PopupHandling();
		 
		 
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
// handle get text		 
		 Dashboard_neostox text =new Dashboard_neostox (driver);
		 text.getText(Uid);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
// handle  click button	
		 Thread.sleep(1000);
		 Dashboard_neostox click1 =new Dashboard_neostox (driver);
		 click1.clickOnUsername();
		 
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
// handle logout button		 
		 Dashboard_neostox log =new Dashboard_neostox (driver);
		 log.ClickOnlogout();
		 
		 
		 
		 
		 
		 
		 
	}

}
