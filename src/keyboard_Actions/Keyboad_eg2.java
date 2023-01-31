package keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboad_eg2 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		                                  //1.............get.......
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement signupbutton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		
		Actions act =new Actions(driver);
		
		act.click(signupbutton).perform();
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		act.click(month).perform();
		Thread.sleep(1000);
		act.sendKeys(month, Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(month, Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
	}

}
