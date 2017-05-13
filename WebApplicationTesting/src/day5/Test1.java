package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	FirefoxDriver driver;
	@Test
	public void test()
	{
		
	driver= new FirefoxDriver();
	driver.navigate().to("http://www.sears.com");
	
	
	
	}
}
