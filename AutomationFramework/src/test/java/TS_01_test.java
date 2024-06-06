import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ListenerUtility;
import ObjectRepository.HomePage;

@Listeners(ListenerUtility.class)

public class TS_01_test extends BaseClass
{
	@Test
	private void Clickonbooks()
	{
		hp = new HomePage(driver);
	
	}

}
