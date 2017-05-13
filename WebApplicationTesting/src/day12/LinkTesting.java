package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTesting {
	FirefoxDriver driver;
	@BeforeTest
	public void ApplLaunch()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}
@Test
public void LinksTesting() throws IOException
{
	FileInputStream f = new FileInputStream("C:\\Users\\Ajay\\Desktop\\SravaniSelenium\\WebApplicationTesting\\src\\com\\ExcelTestData\\DataDrivenLinksTestData.xlsx");
	XSSFWorkbook wb =new XSSFWorkbook(f);
	XSSFSheet ws =wb.getSheet("Sheet1");
int	rowCount= ws.getLastRowNum();
for(int i=1;i<=rowCount;i++)
{
Row	R=ws.getRow(i);
try
{
driver.findElement(By.linkText(R.getCell(0).getStringCellValue())).click();
String ExpectedURL=R.getCell(1).getStringCellValue();
String ActualURL=driver.getCurrentUrl();
R.createCell(2).setCellValue(ActualURL);
driver.navigate().back();
if(ActualURL.contains(ExpectedURL))
{
	R.createCell(3).setCellValue("Url's Matched");

}
else
{
	R.createCell(3).setCellValue("Url's Does not match");
}

}

catch(Exception e)
{
R.createCell(3).setCellValue("Link not found");	
}
	
FileOutputStream f1 =new FileOutputStream("C:\\Users\\Ajay\\Desktop\\SravaniSelenium\\WebApplicationTesting\\src\\com\\ExcelResults\\DataDrivenLinksTestData.xlsx");

wb.write(f1);
}

}

}
