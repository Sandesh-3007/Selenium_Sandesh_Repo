package ExtentReport;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttachScreenshot 
{
	@Test
	public void screenshot()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Github trial Successful",true);
		Reporter.log("Github trial Successful",true);
        TakesScreenshot ts = (TakesScreenshot) driver;
        String Screenshot = ts.getScreenshotAs(OutputType.BASE64);
        
       ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/DemoScreenshot.html");
       ExtentReports extReports = new ExtentReports();
       extReports.attachReporter(spark);
       ExtentTest test = extReports.createTest(Screenshot);
       test.log(Status.INFO, "adding screenshot into report");
       test.addScreenCaptureFromBase64String(Screenshot,"error image");
       extReports.flush();
	}

}
