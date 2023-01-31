package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_context_click {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(100);

		//1 create object of action clasws
		Actions act= new Actions(driver);
		//2.find x path of element and stored in ref varble
		
		WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		// by using action class method perform required action
		//act.moveToElement(RightClick).contextClick().build().perform();
		
		act.contextClick(RightClick).perform();
		
		
		
	}

}
