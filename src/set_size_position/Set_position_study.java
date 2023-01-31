package set_size_position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position_study 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://en.wikipedia.org/wiki/India");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 //1.first find the default position of webpage
		 System.out.println(driver.manage().window().getPosition());
		//2 store it in ref variable
		 Object defaultPosition = driver.manage().window().getPosition();
		 //3 print it to get default position
		 System.out.println("default position is "+defaultPosition);
		 
		 // how to set new position to browser?
		 
		 // create object of point class and pass x and y co ordinates
		 
		   Point p = new Point(500, 100);
		 // use set position method and provide point class object as a parameter
		   Thread.sleep(2000);
		   driver.manage().window().setPosition(p);
	 
		 

	}

}
