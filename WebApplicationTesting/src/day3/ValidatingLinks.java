package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingLinks {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		driver.manage().window().maximize();
		for(int i=0;i<Links.size();i++)
		{
			
			Links.get(i).click();
			driver.navigate().back();
			Links=driver.findElements(By.tagName("a"));
			System.out.println(Links.get(i).getText());
		}
		driver.close();
				
	}

}
