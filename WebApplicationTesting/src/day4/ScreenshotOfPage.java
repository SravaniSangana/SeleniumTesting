package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenshotOfPage {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver =new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Ajay\\Desktop\\Srv.png"));

	}

	

}
