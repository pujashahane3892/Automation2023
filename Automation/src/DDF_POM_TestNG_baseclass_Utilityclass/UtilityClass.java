package DDF_POM_TestNG_baseclass_Utilityclass;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UtilityClass {//here we write the methods which are used multiple times thats why we declare it as static
	
//1.Parameterization
	public static String getTestData(int rowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\pujak\\Downloads\\poi-bin-5.2.3-20220909\\poi-bin-5.2.3\\Excel1.xls");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	String value = sh.getRow(rowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	
         
 //String value = sh.getRow(rowIndex).getCell(CellIndex).getStringCellValue();
	//return value;
		
	}
	//2.Screenshot capturing//used for execute only failed test cases
	 //here we write the methods which are used multiple times thats why we declare it as static
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException

	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(src);
		 File dest = new File("C:\\screenShot\\Sheet2_"+TCID+".png");
		 FileHandler.copy(src, dest);
	}
	//3. To read data from properties file
	public static String getPropertiFileData(String key) throws IOException
	{Properties obj = new Properties();
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Github.properties");
	obj.load(file);
	String value = obj.getProperty(key);
		return value;
	}
}