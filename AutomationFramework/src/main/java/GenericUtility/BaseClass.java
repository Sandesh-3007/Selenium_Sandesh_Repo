package GenericUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.HomePage;
import ObjectRepository.LP2;
import ObjectRepository.WelcomePage;

public class BaseClass 
{
	public static WebDriver driver;
	
	public FileUtility flib;
	public WelcomePage wp;
	public HomePage hp;
	public LP2 lp;
	
	@BeforeClass
	public void launchBrowser() throws FileNotFoundException, IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		flib = new FileUtility();
		String URL = flib.getdatafromprop("url") ;
		driver.get(URL);
	}
	
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException
	{
		wp=new WelcomePage(driver);
		wp.getLoginlink().click();
		lp=new LP2(driver);
		String EMAIL=flib.getdatafromprop("email");
		String PASSWORD = flib.getdatafromprop("password");
		lp.getEmailTF().sendKeys(EMAIL);
		lp.getPasswordTF().sendKeys(PASSWORD);
		lp.getLoginButton().click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		hp = new HomePage(driver);
		hp.LogoutButtonlink().click();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	

}
