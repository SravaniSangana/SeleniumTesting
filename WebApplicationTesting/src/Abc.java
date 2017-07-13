
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class Abc {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver ajay  = new FirefoxDriver();
		ajay.navigate().to("https://www.facebook.com/");
		ajay.manage().window().maximize();
		ajay.findElement(By.id("email" )).sendKeys("ajjukurba.62@gmail.com");
		ajay.findElement(By.id("pass" )).sendKeys("1234");
		ajay.findElement(By.id("u_0_r")).click();
		File src=((TakesScreenshot)ajay).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File("C:\\Users\\Ajay\\Desktop\\Ajay.png"));
	
		
		ajay.close();
	}
}
