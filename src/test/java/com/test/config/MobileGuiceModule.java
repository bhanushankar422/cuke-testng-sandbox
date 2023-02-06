package com.test.config;

import com.google.inject.Provides;
import com.test.page.interfaces.LoginPage;
import com.test.page.mobile.MobileLoginPage;

public class MobileGuiceModule extends BaseModule {

    @Provides
    LoginPage provideLoginPage() {
        return new MobileLoginPage(provideWebdriver());
    }


}
