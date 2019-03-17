package com.automatica.springselenium.tests;

import com.automatica.springselenium.page.YahooPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class YahooSearch extends Core{

    @Autowired
    private YahooPage yahooPage;

    @Test
    public void yahooSearch(){
        yahooPage.yahooLogin();
    }
}
