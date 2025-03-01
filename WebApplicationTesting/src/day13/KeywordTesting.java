package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeywordTesting {
	FirefoxDriver driver;
	@BeforeTest
	public void ApplLaunch()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
	}
	@Test
	public void KeyTesting() throws IOException
	{
		FileInputStream f =new FileInputStream("C:\\Users\\Ajay\\Desktop\\SravaniSelenium\\WebApplicationTesting\\src\\keyword.properties");
		Properties pr =new Properties();
		pr.load(f);
		FileInputStream f1 =new FileInputStream("C:\\Users\\Ajay\\Desktop\\SravaniSelenium\\WebApplicationTesting\\src\\com\\ExcelTestData\\UserRegistrationTestData.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(f1);
		XSSFSheet ws =wb.getSheet("Sheet2");
		Row r = ws.getRow(0);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.xpath(pr.getProperty("Password"))).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		//FileOutputStream f2 = new FileOutputStream("C:\\Users\\Ajay\\Desktop\\SravaniSelenium\\WebApplicationTesting\\src\\com\\ExcelResults\\DataDrivenLinksTestData.xlsx");
	//wb.write(f2);
	
	}
	

}
