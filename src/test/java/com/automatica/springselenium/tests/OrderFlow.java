package com.automatica.springselenium.tests;

import org.testng.annotations.Test;

import com.automatica.springselenium.page.BasePage;
import com.automatica.springselenium.page.HomePage;

public class OrderFlow extends Core{
	
	@Test
	public void placeOrder() throws InterruptedException {
		BasePage homePage = new HomePage(driver);
		while(homePage!=null) {
			homePage = homePage.doAction();
		}
	}
}
