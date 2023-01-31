package chrome_option_class;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Chrome_version {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("version");
		//opt.addArguments("--disable-popup-blocking");// it disabled all 
		//popups and show direct result
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://demoqa.com/select-menu");
		//driver.manage().window().maximize();
		Thread.sleep(100);
		
		// to checking multiselected
		// we can select multiple elements at a time using multiselected.
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select a1=new Select(cars);
	
		System.out.println("we can select multiple cars "+a1.isMultiple());
		
		a1.selectByIndex(0);
		a1.selectByVisibleText("Saab");
		a1.selectByValue("opel");
		a1.selectByIndex(3);
		
		// to get text of that all selected webelements we have to follow following like
		
		List<WebElement> alloptions = a1.getAllSelectedOptions();
		
		// now i have to read all them so i am using diff.methods like
		
		Iterator<WebElement> it = alloptions.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		System.out.println("====================================");
		
		for(int i=0;i<=alloptions.size()-1;i++)
		{
			System.out.println(alloptions.get(i).getText());
		}
		System.out.println("====================================");
		
		for(WebElement s:alloptions)
		{
			System.out.println(s.getText());
		}
		//assignment....list itrator
		System.out.println("====================================");
		ListIterator<WebElement> li = alloptions.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next().getText());
		}

	}

}
