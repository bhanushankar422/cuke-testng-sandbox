package com.test.config;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.test.page.interfaces.LoginPage;
import org.openqa.selenium.WebDriver;

public abstract class BaseModule extends AbstractModule {

    @Provides
    WebDriver provideWebdriver() {
        return null;

    }
    abstract LoginPage provideLoginPage();

}
