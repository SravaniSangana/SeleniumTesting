package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Se {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver d=new FirefoxDriver();
d.get("https://www.sears.com/universalprofile/userLogonForm?upid=3&formName=REG&URL=http%3A%2F%2Fwww.sears.com%2F");
Sleeper.sleepTightInSeconds(10);
Actions a = new Actions(d);
d.switchTo().frame(1);
d.findElement(By.name("email")).sendKeys("Sr");
	}

}
