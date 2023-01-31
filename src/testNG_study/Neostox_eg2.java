package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Neostox_eg2 
{
  @Test
  public void Neostoxlauch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
	  //created object of chromedriver
		WebDriver driver=new ChromeDriver();
		//launch neoStox url
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	  
	  
	  
  }
  
  @Test
   public void upstoxlauch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
	  //created object of chromedriver
		WebDriver driver=new ChromeDriver();
		//launch neoStox url
		driver.get("https://login.upstox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	  
	  
	  
  }

  
  
}
