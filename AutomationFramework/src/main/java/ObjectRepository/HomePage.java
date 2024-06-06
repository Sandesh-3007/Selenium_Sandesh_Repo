package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (linkText = "Log Out")
	private WebElement LogoutButton;
	
	public WebElement LogoutButtonlink()
	{
		return LogoutButton;
	}
	
	
}
