package GenericUtility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility extends BaseClass implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		String MethodName = result.getName();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots"+MethodName+".png");
		try {
			FileHandler.copy(temp,dest);
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
