package assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class SearsOnlineInstore {
	@FindBy(xpath=".//*[@id='yourAccount']/div[1]")
	WebElement SignIn;
	@FindBy(xpath=".//*[@id='subnavDD_myProfile']/li[12]")
	WebElement JoinFree;
	Actions act;
	
	public void SignInAccounts(FirefoxDriver driver)
	{
		
		 act=new Actions(driver);
		act.moveToElement(SignIn).perform();
	Sleeper.sleepTightInSeconds(5);
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(true)",JoinFree);
	
		JoinFree.click();
		Sleeper.sleepTightInSeconds(10);
		
		
	}
	
	@FindBy(name="email")
	WebElement Email;
	@FindBy(xpath=".//*[@id='emailConfirm']")
	WebElement ConfirmEmail;
	@FindBy(xpath=".//*[@id='password']")
	WebElement CreatePassword;
	@FindBy(xpath=".//*[@id='universalSignInBtns']/button")
	WebElement Join;
	@FindBy(name="fname")
	WebElement FirstName;
	@FindBy(name="lname")
	WebElement LastName;
	@FindBy(name="zip")
	WebElement ZipCode;
	
	public void JoinForFree(FirefoxDriver driver,String email,String cemail,String pwd,String firstName,String lastName,String zipCode)
	{
		act=new Actions(driver);
	driver.switchTo().frame(1);
		Email.sendKeys(email);
		ConfirmEmail.sendKeys(cemail);
		CreatePassword.sendKeys(pwd);
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		ZipCode.sendKeys(zipCode);
		Sleeper.sleepTightInSeconds(5);
		Join.click();
	}

}
