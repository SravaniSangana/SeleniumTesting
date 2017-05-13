package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearsHomePage {
	
	FirefoxDriver driver;
	SearsOnlineInstore S= new SearsOnlineInstore();
	@Test
	public void ApplLaunch() throws IOException
	{
		driver= new FirefoxDriver();
		driver.navigate().to("http://www.sears.com");
		driver.manage().window().maximize();
		
		SearsOnlineInstore S= PageFactory.initElements(driver, SearsOnlineInstore.class);
		Sleeper.sleepTightInSeconds(10);
		S.SignInAccounts(driver);
	FileInputStream f = new FileInputStream("C:\\Users\\Ajay\\Desktop\\Mahija.xlsx");
	XSSFWorkbook wb =new XSSFWorkbook(f);
	XSSFSheet ws =wb.getSheet("Sheet1");
	Row r=ws.getRow(0);
	
		S.JoinForFree(driver,r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue(),r.getCell(2).getStringCellValue());
		
		driver.close();
	}

}
