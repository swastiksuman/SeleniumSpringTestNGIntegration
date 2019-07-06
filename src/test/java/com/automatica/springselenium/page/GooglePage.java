package com.automatica.springselenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;


public class GooglePage {

    private String someProperties;
    private WebDriver driver;
    
    public GooglePage(WebDriver driver){
    	this.driver = driver;
    }
    
    public void googleLogin(){
        driver.findElement(By.id("lga")).sendKeys("Verizon");
    }

    public String getSomeProperties() {
        return someProperties;
    }

    public void setSomeProperties(String someProperties) {
        this.someProperties = someProperties;
    }
}
