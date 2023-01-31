package pop_ups_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_popup 
{

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1.............get.......
		
		driver.get("https://www.flipkart.com/");// get url 1st
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//now i have to cut the pop up from the web page
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(100);
		
		// and then i want to search something on flipkart
		driver.findElement(By.name("q")).sendKeys("the man perfumes");
		
		// and click on search button.
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		

	}

}
