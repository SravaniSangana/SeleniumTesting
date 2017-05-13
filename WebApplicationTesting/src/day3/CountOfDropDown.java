package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountOfDropDown {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
		List<WebElement>ListCountry=country.findElements(By.tagName("option"));
		System.out.println(ListCountry.size());
		for(int i=0;i<ListCountry.size();i++)
		{
			System.out.println(ListCountry.get(i).getText());
		}
		
		

	}

}
