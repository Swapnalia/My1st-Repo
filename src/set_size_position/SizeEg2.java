package set_size_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://en.wikipedia.org/wiki/India");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 System.out.println(driver.manage().window().getSize());
		 
		Dimension defaultSize = driver.manage().window().getSize();
		 System.out.println("default size is "+defaultSize);
		
		Dimension d= new Dimension(1000, 590);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
        Dimension NewSize = driver.manage().window().getSize();
		System.out.println("new size of the browser is "+NewSize);
		 
		 
	}

}
