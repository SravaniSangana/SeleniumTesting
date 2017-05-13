package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VAlidatingLinksAndImages {

	public static void main(String[] args) throws IOException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("http://newtours.demoaut.com");
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<links.size();i++)
	{
		String name=links.get(i).getText();
		links.get(i).click();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\Ajay\\Desktop\\"+name+".png"));
	driver.navigate().back();
	links=driver.findElements(By.tagName("a"));
	}
driver.close();
	}

}
