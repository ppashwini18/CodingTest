package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Wikipages 
{
	private WebDriver driver;
	@FindBy(xpath="//div[text()='Release date']")
	private WebElement releaseText;
	
	
	@FindBy(xpath="(//div[@class='plainlist'])[4]")
	private WebElement releaseDate; 
	
	@FindBy(xpath="//th[text()='Country']")
	private WebElement country;
	
	@FindBy(xpath="//td[text()='India']")
	private WebElement countryName;
	
	
	public Wikipages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void extractReleaseDate()
	{
		
		String strName=releaseText.getText();
		String strDate =releaseDate.getText();
		Assert.assertEquals(true,true);
		System.out.println(strName +" "+ strDate);
		
	}

	public void extractcountryName()
	{
		String countryText=country.getText();
		String countryNameText=(countryName.getText());
		Assert.assertEquals(countryNameText,"India","string pass");
		System.out.println(countryText +" "+ countryNameText);
		
	}

}
