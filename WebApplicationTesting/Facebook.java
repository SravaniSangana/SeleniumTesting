package com.mavenproject.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver ajay  = new FirefoxDriver();
		ajay.navigate().to("https://www.facebook.com/");
		ajay.manage().window().maximize();
		ajay.findElement(By.id("email" )).sendKeys("ajjukurba.62@gmail.com");
		ajay.findElement(By.id("pass" )).sendKeys("1234");
		ajay.findElement(By.id("u_0_r")).click();
		ajay.close();
	}
}
