package com.test.config;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.test.page.interfaces.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public abstract class BaseModule extends AbstractModule {

    @Provides
    WebDriver provideWebdriver() {
        log.info("Creating driver for {} browser", getBrowser());
        return null;

    }
    abstract LoginPage provideLoginPage();

    protected String getBrowser(){
        String type = System.getProperty("browser") ;
        type = type == null ? "chrome": type;

        return type;
    }

}
