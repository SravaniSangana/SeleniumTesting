package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlOfPage {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String ExpectedURL="https://www.google.com/?gws_rd=ssl";
		if(URL.equals(ExpectedURL))
		{
			System.out.println("PASS:URL's Match");
			
		}
		else
		{
			System.out.println("Fail:Not Match");
		}


	}

}
