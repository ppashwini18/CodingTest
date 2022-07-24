package org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.Wikipages;
import org.programtask.JavaScriptMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikitestcase 
{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		JavaScriptMethod obj2= new JavaScriptMethod();
		String url="https://en.wikipedia.org/wiki/Pushpa:_The_Rise";
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(800,800));
		driver.get(url);
		WebElement eleScrollDown = driver.findElement(By.xpath("//th[text()='Produced by']"));
		obj2.scrollTillElement(eleScrollDown,driver);
		
	}
	@Test
	public void OpenPushpaPageDetails()
	{
		
		Wikipages obj = new Wikipages(driver);   // create object of page class and call the actions methods
		obj.extractReleaseDate();
		obj.extractcountryName();
		
	}
	
	
}
