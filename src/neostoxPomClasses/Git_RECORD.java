package neostoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Git_RECORD 
{
	//input[@id='txt_accesspin']....//a[@class='btn btn-neo']

	//1.. declaire data member globally with private access using @ anotation
		@FindBy(id ="txt_accesspin") private WebElement Password;
	//2...
	@FindBy(id=("lnk_submitaccesspin")) private WebElement SigninClick;
		
	//3...
		//use a parameteric constructor with public level
	   public Git_RECORD (WebDriver driver)
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
