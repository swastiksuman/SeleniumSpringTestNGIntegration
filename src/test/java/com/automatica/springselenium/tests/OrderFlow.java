package com.automatica.springselenium.tests;

import org.testng.annotations.Test;

import com.automatica.springselenium.page.HomePage;

public class OrderFlow extends Core{
	
	@Test
	public void placeOrder() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.searcProduct().selectFirstElement().addToCartAndProceed();
	}
}
