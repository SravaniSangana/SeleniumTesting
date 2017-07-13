package day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.jetty.util.URI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

public class Grid {
	@Parameters("Browser")
	@Test
	public void LogIn(String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap =null;
		if (b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver rc= new RemoteWebDriver(new URL("http://192.168.0.8:4444/wd/hub"),cap);
		rc.get("http://newtours.demoaut.com");
		rc.findElement(By.name("userName")).sendKeys("tutorial");
		rc.findElement(By.name("password")).sendKeys("tutorial");
		rc.findElement(By.name("login")).click();
		rc.close();
		
	}

}
