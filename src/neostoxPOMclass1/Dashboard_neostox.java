package neostoxPOMclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neostoxUtility.Utility;

	public class Dashboard_neostox 
	{//find x path of popup
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement ClickONPopUp;
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
	public void PopupHandling(WebDriver driver) throws InterruptedException
	{   Thread.sleep(500);
		Utility.scrollIntoView(driver, ClickONPopUp);
		ClickONPopUp .click();
		Reporter.log("clicking on pop up ok button",true);
		
		
		//Thread.sleep(1000);
		//ClickONPopUp.click();
	
	}

    public void getText(String Expectedtext)
    {
    	String Actualtext = Text.getText();
    	
    	
    	
    	if(Actualtext.equals(Expectedtext))
    	{
    		System.out.println("actual username is Hi TC is passed");
    	}
    	
    	else 
    	{
    		System.out.println("actual and expectedd is not matched TC is failed");
    	}	
   }
    
	    public void clickOnUsername()
	    {
	    	Textforclick.click();
	    	Reporter.log("click on username",true);
	    }
	    	
	    public void ClickOnlogout() throws InterruptedException
	    {   Thread.sleep(1000);
	    	logout.click();
	    	Reporter.log("logging out from neostox",true);
	    	Thread.sleep(1000);
	    }

		public String GetActualUserName()// writtentype string denar so aapn
		// void chyta jagi string kel
		{
			String ActualUsername = Text.getText();
			Reporter.log("getting actual username", true);
			Reporter.log( "Actualusername"+ActualUsername+"is",true);
			return ActualUsername;
		}
		
		
		
		
}
	
