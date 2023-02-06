package com.test.page.desktop;

import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public class SamplePage {
    @Inject
    public SamplePage(WebDriver driver){
        log.info("In constr");
    }
    public void doSample(){
        log.info("In SamplePage");
    }
}
