package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test2 {

	FirefoxDriver driver ;
	@Test
	public void test()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.sears.com/universalprofile/userLogonForm?upid=3&formName=REG&URL=http%3A%2F%2Fwww.sears.com%2F");
		WebElement b=driver.findElement(By.id("regform"));
		b.findElement(By.name("email")).sendKeys("srv");
	}

}
