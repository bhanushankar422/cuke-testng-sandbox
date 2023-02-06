package com.test.stepdef;

import com.google.inject.Inject;
import com.test.page.interfaces.LoginPage;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@ScenarioScoped
public class LoginStepdefs {
    @Inject
    LoginPage loginPage;
    @Given("I have opened the browser")
    public void iHaveOpenedTheBrowser() {
        log.info(" Inside step def 1");
        loginPage.doLogin();
    }

    @When("I send my credentials")
    public void iSendMyCredentials() {
        log.info(" Inside step def 2");
    }

    @Then("I should see the {string} title of the page")
    public void iShouldSeeTheTitleOfThePage(String arg0) {
        log.info(" Inside step def 3 with arg {}", arg0);
    }
}
