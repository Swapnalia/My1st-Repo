package sreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_eg3 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println("the source folder of the file paytm is "+source);
		//now
		// here one more concept that is random string ...which is use to give number to screenshot
		
		String random = RandomString.make(4);
		
		File destination =new File("C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\Screenshots\\paytm "+random+".png");
		
		FileHandler.copy(source, destination);
		
		
		
		
		
		
		
		

	}

}
