package pomClassesUsingDDF;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelDataRead 
{
  @Test
  public void testing() throws IOException
  { WebDriver driver = null;
		  System.out.println(GeneralMethod.ReadDataFromExcel(0, 0));
		  System.out.println(GeneralMethod.ReadDataFromExcel(0, 1));
		  System.out.println(GeneralMethod.ReadDataFromExcel(0, 2));
	  
		  GeneralMethod.implicitWait(100, driver);
		  GeneralMethod.implicitWait(1000, driver);
		  
		  
		  GeneralMethod.TakeScreenShot(driver, "MY ScreenShot");
		  GeneralMethod.TakeScreenShot(driver, "MY home sceen");
		  
		  
		  GeneralMethod.scrollIntoView(driver, null);
  }
  
  
  
  
  
}
