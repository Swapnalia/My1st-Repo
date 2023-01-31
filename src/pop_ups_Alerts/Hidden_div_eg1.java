package pop_ups_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_eg1
{

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://neostox.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.findElement(By.className("nav-link")).click();
		 Thread.sleep(100);
		 driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("9146727353");
		 Thread.sleep(100);
		 driver.findElement(By.id("lnk_signup1")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("txt_accesspin")).sendKeys("1234");
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		Thread.sleep(100);
		driver.findElement(By.className("//btn btn-sm neobutton")).click();
		Thread.sleep(100);
		 
		 
	}

}
