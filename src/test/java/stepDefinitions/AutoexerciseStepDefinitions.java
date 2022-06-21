package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AutoExPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutoexerciseStepDefinitions {

    AutoExPage autoExPage = new AutoExPage();

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();
    }


    @When("user navigate to URl")
    public void user_navigate_to_u_rl() {
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }


    @Then("user verifies that home page is visible succesfully")
    public void user_verifies_that_home_page_is_visible_succesfully() {
        Assert.assertEquals("https://automationexercise.com/", Driver.getDriver().getCurrentUrl());

    }


    @And("user clicks on Test Cases button")
    public void userClicksOnTestCasesButton() {
        autoExPage.testCasesLink.click();
    }


    @Then("user is navigated to test cases page succesfully")
    public void user_is_navigated_to_test_cases_page_succesfully() {
        Assert.assertTrue(autoExPage.testCasesText.isDisplayed());

    }


    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();

    }

}
