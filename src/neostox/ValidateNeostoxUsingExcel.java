package neostox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNeostoxUsingExcel 
{

	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
	       //create object of chromedriver
			WebDriver driver=new ChromeDriver();
			//1.............get.......
			//launch neostox url
			driver.get("https://neostox.com/sign-in");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			// click on sign in button
			driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
			Thread.sleep(300);
			// enter mobile number
			driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("9146727353");
			Thread.sleep(300);
			//click on sign in button
			driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
			Thread.sleep(300);
			// enter password
			driver.findElement(By.id("txt_accesspin")).sendKeys("1234");
			Thread.sleep(300);
			//click on submit button
			driver.findElement(By.id("lnk_submitaccesspin")).click();
			Thread.sleep(5000);
			//handle hidden division popup
			driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
			Thread.sleep(1000);
			//validating active User name
			
		String ActualUN = driver.findElement(By.id("lbl_username")).getText();
			
			String expectedUN = "Hi";
			// here we using if statement
			if(ActualUN.equals(expectedUN))
			{
				System.out.println("TC is Passed");
			}
			
			else
			{
				System.out.println("TC is failed");
			}
			
			// logging out
			Thread.sleep(1000);
			driver.findElement(By.id("lbl_username")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Logout']")).click();
			Thread.sleep(1000);
			driver.close();//closing the webpage
			

	}

}
