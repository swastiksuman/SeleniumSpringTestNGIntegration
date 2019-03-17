package com.automatica.springselenium.page;

import org.springframework.stereotype.Component;

@Component
public class GooglePage {

    private String someProperties;

    public void googleLogin(){
        System.out.println(someProperties);
    }

    public String getSomeProperties() {
        return someProperties;
    }

    public void setSomeProperties(String someProperties) {
        this.someProperties = someProperties;
    }
}
