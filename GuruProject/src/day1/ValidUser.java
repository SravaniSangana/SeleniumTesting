package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidUser {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr85364");
		driver.findElement(By.name("password")).sendKeys("ezurYsE");
		driver.findElement(By.name("btnLogin")).click();
		if(driver.getTitle().contains("Home"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
driver.close();
	}

}
