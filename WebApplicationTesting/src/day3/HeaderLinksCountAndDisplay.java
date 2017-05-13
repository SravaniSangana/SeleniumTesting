package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksCountAndDisplay {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.navigate().to("http://bing.com");
		WebElement Header=driver.findElement(By.id("sc_hdu"));
		List<WebElement>SubLinks=Header.findElements(By.tagName("a"));
		
		System.out.println(SubLinks.size());
		int count=1;
		for(int i=0;i<SubLinks.size();i++)
		{
		
			if(SubLinks.get(i).isDisplayed())
			{
				
			System.out.println(SubLinks.get(i).getText());
			
			
			count++;
		
			}
			
			
		}
		System.out.println(count);
		
	}

}
