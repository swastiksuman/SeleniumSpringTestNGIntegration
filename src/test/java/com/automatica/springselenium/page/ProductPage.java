package com.automatica.springselenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedCheckOut;
	
	@FindBy(xpath = "//span[text() = 'Add to cart']")
	private WebElement addToCartButton;
	
	private WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartAndProceed() throws InterruptedException {
		Thread.sleep(3000);
		addToCartButton.click();
		Thread.sleep(3000);
		proceedCheckOut.click();
	}
}
