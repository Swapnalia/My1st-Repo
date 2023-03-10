package neostoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Records_for_git 
{
	@FindBy(id ="txt_accesspin") private WebElement Password;
	//2...
	@FindBy(id=("lnk_submitaccesspin")) private WebElement SigninClick;
		
	//3...
		//use a parameteric constructor with public level
	   public Records_for_git (WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	//4...
	   
	   //initialize the within method with public level
	   public void EnterPassword()
	   {
		   Password.sendKeys("1234");
		   Reporter.log("enter password",true);
	   }
	  
	//5...
	   public void ClickOnSignIn() throws InterruptedException
	   {
		   Thread.sleep(1000);
		  SigninClick.click();
		  Reporter.log("click on signing button",true);
	   }
		
		
}
