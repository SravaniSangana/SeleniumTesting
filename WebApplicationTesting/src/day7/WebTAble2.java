package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTAble2 {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
				String part2="]/td[";
				                 String part3= "]";
				                 for(int i=1;i<=36;i++)

				                 {
				                	 for(int j=1;j<=8;j++)
				                	 {
				                	 System.out.print(driver.findElement(By.xpath(part1+i+part2+j+part3)).getText()+" ");
				                	 }
				                	 System.out.println();
				                 }
						
	}

}
