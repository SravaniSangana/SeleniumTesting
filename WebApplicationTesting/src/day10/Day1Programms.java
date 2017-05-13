package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1Programms {
	FirefoxDriver driver;
	
	@BeforeTest
	public void ApplLaunch()
	{
		 driver =new FirefoxDriver();
		 driver.get("http://newtours.demoaut.com");
		
	}
	@Test(priority=1)
	public void Maximise()
	{
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void ClickOnLink()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
    @AfterTest
    public void CloseApp()
    {
    	driver.close();
    }
    }
