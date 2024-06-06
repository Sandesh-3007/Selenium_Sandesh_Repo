package ExtentReport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReport 
{
	@Test
	public void report()
	{
		//To get new report everytime after execution need to attach time stamp
		String Time = LocalDateTime.now().toString().replace(":","-");
		
		
		//Create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/ExtentReport"+Time+".html");
		
		//Create ExtentReports object
		ExtentReports extReports = new ExtentReports();
		
		//Attach spark Report to extent report
		extReports.attachReporter(spark);
		
		//create extent test object
		ExtentTest test = extReports.createTest("report");
		
		//call log() to provide status
		test.log(Status.PASS, "log message added into extent reports");
		
		//call flush() to write report into destination
		extReports.flush();
	}

}
