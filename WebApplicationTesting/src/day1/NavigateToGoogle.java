package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGoogle {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://google.com");

	}

}
