package com.automatica.springselenium.tests;

import org.testng.annotations.Test;

import com.automatica.springselenium.page.HomePage;

public class OrderFlow extends Core{
	
	@Test
	public void placeOrder() {
		HomePage homePage = new HomePage(driver);
		homePage.searcProduct().selectFirstElement();
	}
}
