package neostox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_neostox_username 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
       //create object of chromedriver
		WebDriver driver=new ChromeDriver();
		// reading data from excel
		File Myfile=new File("C:\\Users\\SWAPNALI\\OneDrive\\Documents\\Automation\\Excel\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		String UserID = Mysheet.getRow(0).getCell(0).getStringCellValue();		
		String password = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String expUN = Mysheet.getRow(0).getCell(2).getStringCellValue();
				//launch neostox url
		driver.get("https://neostox.com/sign-in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// click on sign in button
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		Thread.sleep(300);
		// enter mobile number
		driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys(UserID);
		Thread.sleep(300);
		//click on sign in button
		driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
		Thread.sleep(300);
		// enter password
		driver.findElement(By.id("txt_accesspin")).sendKeys(password);
		Thread.sleep(300);
		//click on submit button
		driver.findElement(By.id("lnk_submitaccesspin")).click();
		Thread.sleep(5000);
		//handle hidden division popup
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		Thread.sleep(1000);
		//validating active User name
		
	String ActualUN = driver.findElement(By.id("lbl_username")).getText();
		
		//String expectedUN = "Hi";
		// here we using if statement
		if(ActualUN.equals(expUN))
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
