package com.automatica.springselenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;


public class HomePage implements BasePage{

    @FindBy(id = "search_query_top")
    private WebElement searchBox;
    
    @FindBy(name = "submit_search")
    private WebElement searchButton;
    
    private WebDriver driver;
    
    public HomePage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    
    public SearchPage searcProduct(){
        searchBox.sendKeys("shirt");
        searchButton.click();
        return new SearchPage(driver);
    }

	@Override
	public BasePage doAction() {
		return searcProduct();
	}
}
