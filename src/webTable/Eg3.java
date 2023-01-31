package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		/*1.we have to find table data without using list
		 * 2.we use for or nested if for that
		 * 3.find the xpath of that element..row or coloum or table data
		 * then use nested for loop to print outer as well as inner data
		 * finally print printing statement.
		 * here you can print all the data without using list 
		 * */
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
			// read total rows from table
			//outer for loop...>rows..>2-11(TR)....>i
			for(int i =2;i<=11;i++)
			{
				//inner for loop for reading td
				for(int j=1;j<=3;j++)
				{
					
					WebElement tableData = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]"));
					System.out.print(tableData.getText()+" ");
				}
				System.out.println();
				
				
			}
			
			
			
			
			
			

	}

}
