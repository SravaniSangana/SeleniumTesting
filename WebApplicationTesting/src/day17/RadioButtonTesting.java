package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTesting {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radio1= table.findElements(By.name("group1"));
		List<WebElement> radio2=table.findElements(By.name("group2"));
		for(int i=0;i<radio1.size();i++)
		{
			radio1.get(i).click();
			for(int k=0;k<radio1.size();k++)
			{
				System.out.println(radio1.get(k).getAttribute("value")+"....."+radio1.get(k).getAttribute("checked"));
				radio2.get(k).click();
			}
				for(int j=0;j<radio2.size();j++)
				{
				System.out.println(radio2.get(j).getAttribute("value")+"...."+radio2.get(j).getAttribute("checked"));
				
				
				}
				
				
			}
				
			
			
		
		driver.close();

	}

}
