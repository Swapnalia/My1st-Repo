package web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_Enabled 
{

	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(100);
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
	    WebElement currentstatus = driver.findElement(By.xpath("//input[@name='q']"));
	
	  //input[@name='q']
	    // OtpButton.isEnabled();
		System.out.println("current status is "+currentstatus.isEnabled());
		currentstatus.sendKeys("swapnali");
		System.out.println("new status is "+currentstatus.isDisplayed());
		
		WebElement male = driver.findElement(By.id("gender-male"));
		
		WebElement female = driver.findElement(By.id("gender-female"));
		
		System.out.println(male.isSelected());//false.
		System.out.println(female.isSelected());//false
		System.out.println("************");
		//select male radio button
		male.click();
		System.out.println(male.isSelected());//true
		System.out.println(female.isSelected());//false
		System.out.println("************");
		//select male radio button
		female.click();
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//true
		
		
		
		
		
		
	}

}
