package sreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_eg2 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.w3schools.com/");
			driver.manage().window().maximize();
			Thread.sleep(100);
			
			//1..... i have to cast driver into takescreenshot interface
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			System.out.println("the source of the file is "+source);
			
			// i got screenshot but i want to store that in my desired place.
			// so i hv to create object of my file and stored it in ref.var.
			
			File destination =new File("C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\Screenshots\\w3school.png");
			
			// i gave the file but i want to copy that image from dource to destination ..so
			// I HAVE TO USE FILE HANDLER
			
			FileHandler.copy(source, destination);
			
			
			

	}

}
