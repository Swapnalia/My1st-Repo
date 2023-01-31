package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException
	{

	       System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
			// i want to read header of table without using list
			// i will use for loops
			//so first i will find the x path of that headers & then i will put it into the for loop
			//ethe aaplyala i as avariable dyaycha header chya jagi...so to vary krel 1/2/3 as
			for(int i=1;i<=3;i++)
			{
			 WebElement header = driver.findElement(By.xpath("//tbody//th["+i+"]"));
			System.out.println("headers will be "+header.getText());
			}
			// i dont want to use collection and i want to perform on multiple variables how i can
			// by using for loop
			// like start date end date..buy sell....ashaveli x path same but indexing different ast
			// tevha aapn  for loop use kru shkto
			

	}

}
