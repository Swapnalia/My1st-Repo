package scrolling;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_scrolling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://en.wikipedia.org/wiki/India");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(500);
		js.executeScript("window.scrollBy(0,900)");
		 Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		
		
	}

}
