package ObjectRepository;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;
import GenericUtility.FileUtility;
@Test
public class LoginPage 
{
	public void test() throws FileNotFoundException, IOException
	{
		FileUtility flib = new FileUtility();
		String URL = flib.getdatafromprop("url");
		System.out.println(URL);
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		
	}
	

}
