package com.test.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.test.page.desktop.DesktopLoginPage;
import com.test.page.mobile.MobileLoginPage;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;

public class GuiceInjectorSource implements InjectorSource {
    @Override
    public Injector getInjector() {
        switch (getType()){
            case "mobile":
                return Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), new MobileGuiceModule());
            default:
                return Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), new DesktopGuiceModule());
        }
    }

    private String getType(){
        String type = System.getProperty("type") ;
        type = type == null ? "desktop": type;

        return type;
    }
}
