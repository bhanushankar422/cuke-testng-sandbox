package com.test.page.interfaces;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
@Slf4j
public abstract class LoginPage extends BasePage {


    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void doLogin(){};
}
