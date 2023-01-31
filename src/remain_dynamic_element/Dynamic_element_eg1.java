package remain_dynamic_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_element_eg1
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	WebElement Searchtext= driver.findElement(By.xpath("//input[@name='q']"));
		Searchtext.sendKeys("honda");
		Thread.sleep(100);
		
	List<WebElement> searchresults = driver.findElements(By.xpath("//ul[@class='G43f7e']"));
		
		System.out.println("no of iteams in list are "+searchresults.size());
		
		System.out.println("================================================");
		
		for (WebElement s:searchresults)
		{
			System.out.println(s.getText());
		}
		// if i want to find how many images are present on the web then
		
		
		
		
	}

}
