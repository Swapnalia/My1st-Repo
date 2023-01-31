package set_size_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://en.wikipedia.org/wiki/India");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 // first we have to find the default size of the browser.
		 System.out.println(driver.manage().window().getSize());
		Dimension defaultSize = driver.manage().window().getSize();
		 
		 System.out.println("default size of the browser is "+defaultSize);
		 // then set the new size of the browser. by using dimensitoion class
		 Thread.sleep(1000);
		Dimension d= new Dimension(500, 399);
		driver.manage().window().setSize(d);
		
		 System.out.println("new dimension the the browser is "+d);

	}

}
