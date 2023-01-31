package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eg1 
{

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
       ChromeOptions cop = new ChromeOptions();
       
       cop.addArguments("--headless");//***********i used chrome option class here.**************
       
		WebDriver driver=new ChromeDriver(cop);
		//1.............get.......
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
	    WebElement view = driver.findElement(By.id("product"));
		//2..
	    JavascriptExecutor js = (JavascriptExecutor)driver;//i used scroll n view here
	    js.executeScript("arguments[0].scrollIntoView(true)",view);
	    //3.
	   List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
	    
	    System.out.println("no of rows in table are "+table.size());
	    //if i want to print whole table and each row from table...how?
	    // by using for each loop
	    //Q how many rows are there?
	    for(WebElement t:table)
	    {
	    	System.out.println(t.getText());
	    }
	    // how many coloums are in table
	    System.out.println("****************************************");
	    
	   List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
	    
	    System.out.println("no of coloumns in table are "+header.size());
	    
	    System.out.println("****************************************");
	    // no of headers  and their names by using itrator 
	    
	    Iterator<WebElement> it = header.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next().getText());
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
