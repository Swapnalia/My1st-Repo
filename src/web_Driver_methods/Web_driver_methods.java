package web_Driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver_methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://vctcpune.com/");
		Thread.sleep(100);
		//driver.navigate().refresh();
		
		//2.....maximize and minimize.....
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//3........nevigate
		//a.
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		
		//b...
		driver.navigate().back();
		Thread.sleep(1000);
		//c.......
		driver.navigate().forward();
		Thread.sleep(1000);
		//d.......
		driver.navigate().refresh();
		Thread.sleep(1000);
		//e.........
		driver.get("https://www.amazon.in/");
		 String url = driver.getCurrentUrl();
				 System.out.println(url);
				 
		//f.......		 
		
		
		
		
		
		
		
		
		
		
		
		//orrrrrrrrrrrrrrrrrr
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("T shirts for girls");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fzgufm-2tdv7b-kkvks2-rcpxvg")).click();
		
		
		
	}

}
