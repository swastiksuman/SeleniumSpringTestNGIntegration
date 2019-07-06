package com.automatica.springselenium.tests;

import com.automatica.springselenium.SpringSeleniumApplication;
import com.automatica.springselenium.page.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

public class GoogleSearch extends Core{

    private GooglePage googlePage;

    @Test
    public void doGoogleSearch(){
        googlePage = new GooglePage(driver);
    	googlePage.setSomeProperties("Hello Bhaiyya");
        googlePage.googleLogin();
    }

}
