package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximiseFireFox {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.close();

	}

}
