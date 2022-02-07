package com.bloomerang.steps;


import com.bloomerang.pages.SubmitPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class StepDefs {

    SubmitPage submitPage = new SubmitPage();

    @Given("The user is on the landing page to fill form")
    public void the_user_is_on_the_landing_page_to_fill_form() {
        submitPage.goTo();
    }

    @When("User fills every field with valid information")
    public void user_fills_every_field_with_valid_information() {
        submitPage.fillingInformationFields();
    }

    @When("User clicks submit button")
    public void user_clicks_submit_button() {
        submitPage.submitBtn();
    }

    @Then("User should see {string}")
    public void user_should_see(String expectedResult) {
        String actualResult = submitPage.getMessageElm().getText();

        Assert.assertEquals(expectedResult, actualResult);

    }

    @When("User does not fill every field int the form")
    public void userDoesNotFillEveryFieldIntTheForm() {
        submitPage.fillingInformationWithMissingFields();
    }


    @When("User fills every field with partial valid information")
    public void userFillsEveryFieldWithPartialValidInformation() {
        submitPage.fillingPartialInformationFields();

    }

    @Then("The form should not be submitted and display {string}")
    public void theFormShouldNotBeSubmittedAndDisplay(String expectedResult) {
        String actualResult = submitPage.getLastNameFieldRequiredElm().getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
