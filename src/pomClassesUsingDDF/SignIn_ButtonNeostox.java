package pomClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_ButtonNeostox 
{
// 1. DATA MEMBERS SHOULD DECLAIRED GLOBALLY have private access and by suing @find by annotation
	
	//a.. find the x path of that element
	//write written type of that element
	//declaired it globally
	//make it private...so no one can acess it
	
	//**** FIND X PATH OF MOBILE NO..
	@FindBy(xpath = "//input[@id='MainContent_signinsignup_txt_mobilenumber']")private WebElement MobileNoField;
	
	//**** FIND X PATH OF SUBMIT BUTTON
	@FindBy(xpath = "//a[@id='lnk_signup1']") private WebElement SignInField;
	
	//2..initialize within constructor with accsess public using pagefactory class
	// IN THAT we have to use public acess 
	//write constructor with the same name as class
	//give parmeter as driver 
	// use pagefactory class and enit element method 
	// use this keyword to acess global variables from same class
	public SignIn_ButtonNeostox(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3..utilize in method with access level public like
	
	public void MobileNoField(String mobNum)
	{
		MobileNoField.sendKeys(mobNum);
	}
	public void SignInField()
	{
		SignInField.click();
	}
	// means instead of actual mob no.we provide parameter their...and we fetch that data from excel
	
	
}
