package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String getdatafromprop(String key) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
		
	}

}
