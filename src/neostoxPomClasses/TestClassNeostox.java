package neostoxPomClasses;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassNeostox 
{


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://neostox.com/sign-in");//first we launch the url
		 driver.manage().window().maximize();
// create the object of N.H.P becoz it is non static 
		 HomePageNeostox Home = new HomePageNeostox(driver);
 //by using object call the all methods present in previous class
		 Home.ClickonSignInButton();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
// handle the mobile no.field 
		 SignIn_ButtonNeostox  MobileNo =new SignIn_ButtonNeostox (driver);
		 MobileNo.MobileNoField();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
 //handle submit button field
		 MobileNo.SignInField();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
// handle password field
		 PasswordNeostox password = new PasswordNeostox(driver);
		 password.EnterPassword();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
 // handle password submitbutton field
		 password.ClickOnSignIn();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//handle pop up
		 Dashboard_neostox popup =new Dashboard_neostox (driver);
		 popup.PopupHandle(driver);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
// handle get text		 
		 Dashboard_neostox text =new Dashboard_neostox (driver);
		 text.getText();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
// handle  click button	 
		 Dashboard_neostox click1 =new Dashboard_neostox (driver);
		 click1.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
// handle logout button		 
		 Dashboard_neostox log =new Dashboard_neostox (driver);
		 log.logout();
		 
		 
		 
		 
		 
		 
		 
	}

}
