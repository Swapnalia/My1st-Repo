package neostoxPOMclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageNeostox 
{
	//1..Data member should be declaired globally with acess level private using @findby annotation

	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement Signinbutton;
	
	//2..initialize within a constructor with acess level public using pagefactory
	public HomePageNeostox (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.. utilize within the method with acess level public
	
	public void ClickonSignInButton()
	{
		Signinbutton.click();
	}
	
	
	
	
}
