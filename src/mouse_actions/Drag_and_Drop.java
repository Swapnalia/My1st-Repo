package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(100);	
		// 1. create object of action class
		Actions act=new Actions(driver);
		//2. find the element for source of drag
		WebElement source = driver.findElement(By.id("draggable"));
		//3. find the element for destination drag
		WebElement Destination = driver.findElement(By.id("droppable"));
		//4. by using action class methods perform desired actions.
	    act.dragAndDrop(source, Destination).perform();
		// another method is ...click and hold move and release
		act.clickAndHold(source).moveToElement(Destination).release().build().perform();
		
		
		

	}

}
