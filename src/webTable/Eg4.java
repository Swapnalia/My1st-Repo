package webTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eg4 {

	public static void main(String[] args) throws InterruptedException 
	{
		/*1.we have to find  all table data without using list
		 * 2.we use if else for that
		 * we use for loop as well as if else together
		 * 3.find the xpath of that element..row or coloum or table data
		 * then use if else to print outer as well as inner data
		 * finally print printing statement.
		 * here you can print all the data without using list 
		 * */
		
		//i used headless here.*************************
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
	       ChromeOptions opt = new ChromeOptions();
	       opt.addArguments("--headless");
	       WebDriver driver=new ChromeDriver(opt);
	       
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
			// read total rows from table
			//outer for loop...>rows..>2-11(TR)....>i
			for(int i =1;i<=11;i++)
			{
				//inner for loop for reading td
				for(int j=1;j<=3;j++)
				{
				
				if(i==1)
				{

			String headerText = driver.findElement(By.xpath("//tbody//tr["+i+"]/th["+j+"]")).getText();
					
			System.out.print(headerText +" ");
				}
				
				else {
					

					String DataText = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
							
					System.out.print(DataText +" ");
					}
				}
				System.out.println();
				
				
				
				
			}
			
			
			
			
			
			

	}

}
