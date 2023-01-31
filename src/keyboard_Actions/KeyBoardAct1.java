package keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAct1 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		                                  //1.............get.......
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		                                  // if i want to used it multiple time then i have to save it in ref var
		WebElement SignInButton=driver.findElement(By.xpath("//a[text()='Create New Account']"));			
		                                  //1.create a object of action class and passed driver as a argument
		Actions act=new Actions(driver);
		                                  //2. using one of the action class method take required action
	
		act.click(SignInButton).perform();
		Thread.sleep(2000);                           //3.find element whre you want to put date
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		Thread.sleep(1000);
		act.sendKeys(day,Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		

	}

}
