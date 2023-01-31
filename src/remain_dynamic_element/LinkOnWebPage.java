package remain_dynamic_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOnWebPage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no of link present on webpage are "+ links.size());
		
		// if i want to name of that links then i will put them in for each loop
		
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
		
		
		
		
	}

}
