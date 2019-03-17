package com.automatica.springselenium.tests;

import com.automatica.springselenium.SpringSeleniumApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

@SpringBootTest(classes = SpringSeleniumApplication.class)
public class Core extends AbstractTestNGSpringContextTests {

    @BeforeTest
    @Parameters({"browser"})
    public void beforeTest(String browser){
        System.out.println(browser);
    }
}
