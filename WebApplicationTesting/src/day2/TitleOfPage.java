package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleOfPage {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.navigate().to("http://gmail.com");
		String Title=driver.getTitle();
		System.out.println(Title);
	
	}

}
