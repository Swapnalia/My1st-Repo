package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollintoView {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);	

		// create oblect of action class
		Actions act = new Actions(driver);
		//2. find the element whre you want direct scroll
		WebElement ScrollIntoView = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		//3. use action class method
		act.scrollToElement(ScrollIntoView).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
