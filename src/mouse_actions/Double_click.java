package mouse_actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(100);
		//1. if i want to perform actions ..i hv to create object of action class
		
		Actions act=new Actions(driver);
		
		//2.first i have to find the expath of that element and store it in ref varbl
		
		WebElement DoubleClick = driver.findElement(By.name("dblClick"));
		//by 2 ways
		//act.moveToElement(DoubleClick).doubleClick().build().perform();
		act.doubleClick(DoubleClick).perform();
		//*%****to handle alert popup i need to switch my focus
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}

}
