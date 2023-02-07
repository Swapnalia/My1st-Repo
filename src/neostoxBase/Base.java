package neostoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxUtility.Utility;

 public class Base 
{
	protected WebDriver driver;
    public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
	
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://neostox.com/sign-in");//first we launch the url
	 driver.manage().window().maximize();	
	 Utility.implicitWait(2000, driver);
	 Reporter.log("launching browser",true);

}





}
