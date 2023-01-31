package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default_ex1 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(100);
		
		String text = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']")).getText();
		
		System.out.println("text on iframe is "+text);
		
// switch focus from iframe to main page ...
		driver.switchTo().defaultContent();
		
		String mainpgtext = driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText();

		System.out.println("text on main page is "+mainpgtext);
		
		
		
		
	}

}
