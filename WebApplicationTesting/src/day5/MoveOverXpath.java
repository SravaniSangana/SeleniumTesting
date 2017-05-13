package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOverXpath {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://infotech.com");
		Actions act=new Actions(driver);
		WebElement Services=driver.findElement(By.xpath("html/body/div[2]/div[1]/header/nav[1]/ul[2]/li[2]/a"));
		act.moveToElement(Services).perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/header/nav[1]/ul[2]/li[2]/ul/li[3]/a")).click();
		driver.close();

	}

}
