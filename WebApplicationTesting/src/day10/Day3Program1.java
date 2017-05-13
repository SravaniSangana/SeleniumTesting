package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3Program1 {
	FirefoxDriver driver;
@BeforeTest
public void ApplLaunch()
{
	
	driver=new FirefoxDriver();
	driver.navigate().to("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("REGISTER")).click();
}
@Test
public void CountOFDropDown()
{
	WebElement country=driver.findElement(By.name("country"));
	List<WebElement> listNames=country.findElements(By.tagName("option"));
	System.out.println(listNames.size());
}

@AfterTest
public void Close()
{
	driver.close();
}
}

