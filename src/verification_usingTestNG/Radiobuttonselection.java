package verification_usingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//test case is checking whether radio button is selected or not
// if selected then test case pass ....else fail
public class Radiobuttonselection {
  @Test
  public void ValidateRadioButtonStatus() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.............get.......
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
//		if(Radio1.isSelected())
//		{
//			Reporter.log("radio 1 is selected test case passed ", true);
//		}
//		else
//		{
//			Reporter.log("radio 1 is not selected test case failed ", true);
//		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",Radio1);
		Radio1.click();
		
	Assert.assertTrue(Radio1.isSelected(),"radio 1 is not selected test case failed ");
		
		
  }
}
