package Synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(100);	
		
		// we used explicit wait for single element present on webpage
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(10000));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//h6[text()='Sign In'])[2]")));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
		
		
		
		
		

	}

}
