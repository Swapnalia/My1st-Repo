package neostoxPOMclass1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PasswordNeostox 
{
	//input[@id='txt_accesspin']....//a[@class='btn btn-neo']

	//1.. declaire data member globally with private access using @ anotation
		@FindBy(id ="txt_accesspin") private WebElement PasswordField;
	//2...
	@FindBy(id=("lnk_submitaccesspin")) private WebElement SigninClick;
		
	//3...
		//use a parameteric constructor with public level
	   public PasswordNeostox (WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	//4...
	   
	   //initialize the within method with public level
	   public void EnterPassword(String password)
	   {
		   PasswordField.sendKeys(password);
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


