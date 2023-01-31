package web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			//1.............get.......
			driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
			Thread.sleep(1000);
			
			//driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
			WebElement SubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			//boolean results = SubmitButton.isEnabled();
			//System.out.println("current status is "+results);
			
			//SubmitButton.click();
			driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
			//System.out.println("new status "+results);
			//SubmitButton.click();
			
			if(SubmitButton.isEnabled())
			{
				boolean result = SubmitButton.isEnabled();
				System.out.println("current status is "+result);
				
				SubmitButton.click();
			}
			else
			{
				System.out.println("submitbutton is not enabled");
			}
			
			
			
			
			
	}        
}
