package geckoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoTesting {
  @Test
  public void firefoxtesting() 
  {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\geckodriver.exe");
		
	  // create object of firefox
		WebDriver driver=new FirefoxDriver();
		
		//1.............get.......
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	  
  }
}
