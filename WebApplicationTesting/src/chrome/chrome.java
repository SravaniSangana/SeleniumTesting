package chrome;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chrome {
	
	
	
	@Test
	public void ApplLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Desktop\\chromedriver.exe");
		ChromeDriver driver	= new ChromeDriver();
	
		driver.get("http://google.com");
		driver.close();
	}
	
		
}
		
	

