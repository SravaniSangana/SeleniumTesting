package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3Program2 {
	FirefoxDriver driver;
	int count=1;
	@BeforeTest
	public void ApplLaunch()
	
	{
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
		
	}
	@Test
	
	public void HeaderLinks()
	{
		WebElement Header=driver.findElement(By.id("sc_hdu"));
		List<WebElement> Links=Header.findElements(By.tagName("a"));
		
	System.out.println(Links.size());
	for(int i=0;i<Links.size();i++)
	{
		if(Links.get(i).isDisplayed())
		{
			System.out.println(Links.get(i).getText());
			count++;
		}
		
	}
		
		System.out.println(count);
		
	}
	
	
	@BeforeTest
	public void Close()
	{
		driver.close();
	}
	}
	


