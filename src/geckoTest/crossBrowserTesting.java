package geckoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting 
{//jevha multiple browsers use krayche astat ex...2/3 tevha else if use krne
  
	//driver.manage().window().maximize();
	//driver.get("https://www.facebook.com/");
	
	@Parameters("browsername")
	@Test 
  public void cbTesting(String Bname) 
  {
		WebDriver driver = null;
	 if(Bname.equals("Chrome"))
	  {
			    System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
				 driver=new ChromeDriver();
				
	  }
	 
	else if(Bname.equals("Firefox"))
			{
				  System.setProperty("webdriver.gecko.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\geckodriver.exe");
			  // create object of firefox
			    driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");			
					
	        }
			    driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
			
		  }	  
  
}
