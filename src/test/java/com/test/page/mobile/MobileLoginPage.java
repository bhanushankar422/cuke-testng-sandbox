package com.test.page.mobile;

import com.google.inject.Inject;
import com.test.page.interfaces.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public class MobileLoginPage extends LoginPage {
    @Inject
    public MobileLoginPage(WebDriver driver) {
        super(driver);
    }

    public void doLogin(){
        log.info("Inside mobile doLogin");
    }
}
