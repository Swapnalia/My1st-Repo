package Synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait2 {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(100);	
			// we used implicit wait for complete web page.
			// foe ex if we giver 1000 sec.and test run in 500 then 500 will be released.
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
