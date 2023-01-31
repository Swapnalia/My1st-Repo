package serialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void Fb() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(100);
  }
}
