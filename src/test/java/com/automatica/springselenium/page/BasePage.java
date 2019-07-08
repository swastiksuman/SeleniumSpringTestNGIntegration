package com.automatica.springselenium.page;

import org.openqa.selenium.WebDriver;

public interface BasePage {
	public WebDriver driver = null;
	
	public BasePage doAction();
	
}
