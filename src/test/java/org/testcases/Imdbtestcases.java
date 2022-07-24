package org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.Imdbpages;
import org.programtask.JavaScriptMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imdbtestcases 
{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowserImdb()
	{
		JavaScriptMethod obj2= new JavaScriptMethod();
		String url="https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0";
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(800,800));
		driver.get(url);
		WebElement eleScrollDown = driver.findElement(By.xpath("(//h3[@class='ipc-title__text'])[8]"));
		obj2.scrollTillElement(eleScrollDown,driver);
	}
	@Test
	public void openPushpaPageDetails()
	{
		Imdbpages obj = new Imdbpages(driver);
		obj.releaseDateMethod();
		obj.countryNameMethod();
		
				
	}
}
