package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableXpath {
	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[1]";
		for(int i=1;i<=36;i++)
		{
	System.out.println(driver.findElement(By.xpath(part1+i+part2)).getText());
		}
	}

}
