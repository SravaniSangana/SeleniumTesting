package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserRegistrationDataDriven {
	FirefoxDriver driver;
@BeforeTest
public void ApplLaunch()
{
	driver= new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	Sleeper.sleepTightInSeconds(5);
	
}
@Test
public void UserRegistration() throws IOException
{
	driver.findElement(By.linkText("REGISTER")).click();
	FileInputStream f =new FileInputStream("C:\\Users\\Ajay\\Desktop\\SravaniSelenium\\WebApplicationTesting\\src\\com\\ExcelTestData\\UserRegistrationTestData.xlsx");
	XSSFWorkbook wb =new XSSFWorkbook(f);
	XSSFSheet ws = wb.getSheet("Sheet1");
int Rowcount=	ws.getLastRowNum();
for (int i=1;i<=Rowcount;i++)
{
	Row r=ws.getRow(i);
	driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
	  driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
	  
	  double d=r.getCell(2).getNumericCellValue();
	  long l=(long)d;
	  String x=Long.toString(l);
	  driver.findElement(By.name("phone")).sendKeys(x);
	  driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
	  driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
	  driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
	  driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
	  
	  double p= r.getCell(7).getNumericCellValue();
	  long k = (long)p;
	  String m = Long.toString(k);
	  driver.findElement(By.name("postalCode")).sendKeys(m);
	  driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
	  driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
	  driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
	  driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
	  driver.findElement(By.name("register")).click();
	  
	  String ExpectedUserName=r.getCell(9).getStringCellValue();
	  String ActualUsername=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	  if(ActualUsername.contains(ExpectedUserName))
	  {
		  r.createCell(12).setCellValue("Successfully Registered");
	  }
	  else
	  {
		  r.createCell(12).setCellValue("Successfully Failed");
	  }
	  driver.navigate().back();
}
	  FileOutputStream f1 =new FileOutputStream("C:\\Users\\Ajay\\Desktop\\SravaniSelenium\\WebApplicationTesting\\src\\com\\ExcelResults\\UserRegistrationTestData.xlsx");
	  wb.write(f1);

}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}

