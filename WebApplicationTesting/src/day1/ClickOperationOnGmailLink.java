package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOperationOnGmailLink {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://google.com");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();

	}

}
