package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickORmoveToelement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		// if i want to used it multiple time then i have to save it in ref var
		WebElement SignInButton=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		//SignInButton.click();// this is by...find element method
		
		//1.create a object of action class and passed driver as a argument
	
		Actions act=new Actions(driver);
		//2. using one of the action class method take required action
		act.click(SignInButton).perform();
		
		//now if i want to move my cursor and then click ..
		act.moveToElement(SignInButton).click().build().perform();
	//***mhnj jevha 2 peksha jast method aapn use karto tevha build.perf..use karayche	
		
		
		
		
		
		
		
		
		
	}

}
