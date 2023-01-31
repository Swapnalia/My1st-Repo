package pop_ups_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");//first we launch the url
		 driver.manage().window().maximize();
		 Thread.sleep(1000);//give some time
		 
		  driver.findElement(By.id("alertButton")).click();// find the path of elment from popup comes out
		  Thread.sleep(100);
		  Alert alt = driver.switchTo().alert();// switch the focus of main page to alert page
		 Thread.sleep(300);// then store it into a referance variable.to use it to perform action.
		 alt.accept();
		 
		 
	}

}
