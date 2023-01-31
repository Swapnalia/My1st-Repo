package neostoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neostoxUtility.Utility;

	public class Dashboard_neostox 
	{//find x path of popup
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement PopUp;
	//find x path of text
	@FindBy(xpath = "//span[text()='Hi  ']") private WebElement Text;
	@FindBy(xpath = "//span[text()='Hi  ']") private WebElement Textforclick;	
	//find x path of logout button
	@FindBy(id = "lnk_logout")private WebElement logout;
	
	public Dashboard_neostox (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
		}
	//handle popup
	public void PopupHandle(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(200);
		Utility.scrollIntoView(driver, PopUp);
		PopUp .click();
		Reporter.log("clicking on pop up ok button",true);
	}
    public void getText()
    {
    	String Actualtext = Text.getText();
    	
    	String Expectedtext = "Hi";
    	
   	if(Actualtext.equals(Expectedtext))
    	{
    		System.out.println("actual username is Hi TC is passed");
    	}
    	else 
    	{
    		System.out.println("actual and expectedd is not matched TC is failed");
    	}	
   }
	    public void click()
	    {
	    	Textforclick.click();
	    	Reporter.log("click on username",true);
	    }
	    	
	    public void logout()
	    {
	    	logout.click();
	    	Reporter.log("logging out from neostox",true);
	    }

		
		
		
}
