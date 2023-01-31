package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox_eg1
{
  @Test
  
  public void neoStoxLaunch() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
	  //created object of chromedriver
		WebDriver driver=new ChromeDriver();
		//launch neoStox url
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println("hii this is swapnali..");
		// it only shows me on console..
		// it not shown me in the emailing report.
		//but..
		// if i used reporter.log method then it will shown me result on both 
		// console as well as in emailing report.
		// by using standard log report
		
		Reporter.log("hii this is reporter", true);
		
		
  } 
	  
  }

