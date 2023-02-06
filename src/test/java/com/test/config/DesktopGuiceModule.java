package com.test.config;

import com.google.inject.Provides;
import com.test.page.desktop.DesktopLoginPage;
import com.test.page.interfaces.LoginPage;

public class DesktopGuiceModule extends BaseModule {

    @Provides
    LoginPage provideLoginPage() {
        return new DesktopLoginPage(provideWebdriver());
    }


}
