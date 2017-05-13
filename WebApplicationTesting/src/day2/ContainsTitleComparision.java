package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ContainsTitleComparision {
	

		public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
		String Title=driver.getTitle();
		System.out.println(Title);
		String ExpectedTitle="Facebook";
		if(Title.contains(ExpectedTitle))
		{
			System.out.println("Match");
		}
		else
		{
			System.out.println("DoesNotMatch");
		}
		}

	}




