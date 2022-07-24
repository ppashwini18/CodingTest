package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
public class Imdbpages 
{
	private WebDriver driver;
	
	@FindBy(xpath="//a[text()='Release date']")
	private WebElement releaseText;
	
	@FindBy(xpath="(//div[@class='ipc-metadata-list-item__content-container'])[17]")
	private WebElement releaseDate;
	
	@FindBy(xpath="//span[text()='Country of origin']")
	private WebElement countryText;
	
	@FindBy(xpath="(//div[@class='ipc-metadata-list-item__content-container'])[18]")
	private WebElement countryName;
	
	public Imdbpages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void releaseDateMethod()
	{
		String strName=releaseText.getText();
		String strDate =releaseDate.getText();
		Assert.assertEquals(true,true);
		System.out.println(strName +" "+ strDate);
	}
	public void countryNameMethod()
	{
		String countryText1=(countryText.getText());
		String countryNameText=(countryName.getText());
		Assert.assertEquals(countryNameText,"India","string pass");
		System.out.println(countryText1 +" "+ countryNameText);
		
	}
	
	
	
	
}
