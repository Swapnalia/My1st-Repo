package pomClassesUsingDDF;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class GeneralMethod
{
	  // excel
	  // wait
	// screenshot
	// screll in to view
	
	
	
	public static String ReadDataFromExcel(int row,int cell) throws  IOException
	{
		File myfile= new File("C:\\\\Users\\\\SWAPNALI\\\\OneDrive\\\\Documents\\\\Automation\\\\Excel\\\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	public static void implicitWait(int time,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static void TakeScreenShot(WebDriver driver,String FileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\Screenshots\\"+FileName+".png");
		FileHandler.copy(src, Dest);	
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollintoview(true)", element);
		
		
		
	}
	
	
	
	
	
	}
