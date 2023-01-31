package listbox_drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_ex1 
{

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1.............get.......
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
        
		
		//2...get path of create new account.
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
	    Thread.sleep(1000);
		
	    WebElement day = driver.findElement(By.id("day"));
		//3...create create a object of select class
		Select s =new Select(day);
		
		//4...select date by using text
		s.selectByVisibleText("4");
			//5.....select month by using index
		Thread.sleep(100);
	    WebElement month = driver.findElement(By.id("month"));
		
		Select s1=new Select(month);
		s1.selectByIndex(4);
		
		//6...select by using value..
		Thread.sleep(100);
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("2020");
		
		
		
	}

}
