package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2Program {
	
	FirefoxDriver driver;
	@BeforeTest
	public void ApplLaunch()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
public void GetTitle()
{
		System.out.println(driver.getTitle());
}
	@Test(priority=2)
	public void GetCurrentURL()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=3)
	public void CountOfLinks()
	{
		List<WebElement>countlinks=driver.findElements(By.tagName("a"));
		System.out.println(countlinks.size());
	}
	@Test(priority=4)
	public void EnterDataAndLogin()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void Close()
	{
		driver.close();
	}
	}
	

