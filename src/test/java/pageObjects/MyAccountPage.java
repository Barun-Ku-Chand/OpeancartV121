package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")//My Account page heading
	WebElement msgHeading;
	
	@FindBy(xpath="//aside[@id='column-right']//a[text()='Logout']")//added in step 6
	WebElement linkLogout;
	
	public boolean isMyAccountPageExists()
	{
		try
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public void clickLogout()
	{
		linkLogout.click();
	}
	
	

}
