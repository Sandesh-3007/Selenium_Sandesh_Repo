package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility 
{
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void draganddrop(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(element, 34, 54).perform();
	}
	             

}
