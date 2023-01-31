package pomClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	public void PopupHandling() throws InterruptedException
	{ Thread.sleep(1000);
		ClickONPopUp.click();
	
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
	    }
	    	
	    public void ClickOnlogout()
	    {
	    	logout.click();
	    }

		public String GetActualUserName()// writtentype string denar so aapn
		// void chyta jagi string kel
		{
			String ActualUsername = Text.getText();
			return ActualUsername;
		}
		
		
		
		
}
	
