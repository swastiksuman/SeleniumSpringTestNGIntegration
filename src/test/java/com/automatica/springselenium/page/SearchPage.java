package com.automatica.springselenium.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	@FindAll({
	@FindBy(xpath = "//a[@class='product-name']")
	})
	private List<WebElement> firstElement;
	
	private WebDriver driver;
	
	public SearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductPage selectFirstElement() {
		firstElement.get(0).click();
		return new ProductPage(driver);
	}
}
