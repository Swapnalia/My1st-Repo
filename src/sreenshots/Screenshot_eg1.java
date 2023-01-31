package sreenshots;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_eg1 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		//to take screenshot we need to make driver as a screenshot interface
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println("source of the file is "+source);
		
		//create aobject  of file to store the screenshot in desired location
		
		File destination =new File("C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\Screenshots\\facebook.png");
		
		FileHandler.copy(source, destination);
		
		
		
	}

}
