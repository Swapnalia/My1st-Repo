package web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text 
{

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://paytm.com/");
		Thread.sleep(100);
		
		String actualtext = driver.findElement(By.xpath("//h1[contains(text(),'Pay Bills on Paytm.')]")).getText();
		String expectedText = ("Recharge & Pay Bills on Paytm.");
		
		 System.out.println("actual text is"+actualtext);
		 
		 if(actualtext.equals(expectedText))
		 {
			System.out.println("test case is matching TC is passed");
			
		 }
		 else
		 {
			 System.out.println("test case is not matching TC is failed");
		 }
		 
	}
		
		
	}


