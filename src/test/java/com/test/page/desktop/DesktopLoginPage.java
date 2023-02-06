package com.test.page.desktop;

import com.google.inject.Inject;
import com.test.page.interfaces.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public class DesktopLoginPage extends LoginPage {
    @Inject
    public DesktopLoginPage(WebDriver driver) {
        super(driver);
    }

    public void doLogin(){
        log.info("Inside desktop doLogin");
    }
}
