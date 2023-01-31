package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_frame_ex1 
{

	public static void main(String[] args) throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		Thread.sleep(100);
		//1.......text from main page
		//String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		
		//System.out.println("text from main page is "+text );
		
		//1...main page to i child page 1
		
		driver.switchTo().frame("frame1");
		Thread.sleep(100);
		driver.findElement(By.tagName("input")).sendKeys("practise selenium");
		
		// main or child page 1 to child page 2...........i.e..frame 1 to frame 3
		
		Thread.sleep(100);
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		Thread.sleep(100);
		// frame 3 to frame 2
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(100);
		driver.findElement(By.tagName("input")).sendKeys("good morning");
		Thread.sleep(100);
		// from frame 2 to main page
		
		driver.switchTo().defaultContent();
         String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println("text from main page is "+text );
		
		
	}

}
