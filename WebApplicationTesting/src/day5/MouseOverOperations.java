package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOperations {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://infotech.com");
		Actions act= new Actions(driver);
		WebElement Services=driver.findElement(By.linkText("Services"));
	
		act.moveToElement(Services).perform();
		Thread.sleep(10000);
		
		
		driver.findElement(By.linkText("Consulting")).click();
		driver.close();
		
				
	}

}
