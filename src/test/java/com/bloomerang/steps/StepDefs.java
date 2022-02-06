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
    public void user_should_see(String string) {
        String actualResult = "Thank you for volunteering!";
        String expectedResult = submitPage.getMessageElm().getText();

        Assert.assertEquals(expectedResult, actualResult);

    }

    @When("User does not fill every field int the form")
    public void userDoesNotFillEveryFieldIntTheForm() {
        submitPage.fillingInformationWithMissingFields();
    }

    @Then("The form should not be submitted")
    public void theFormShouldNotBeSubmitted() {
        String expectedResult = submitPage.getLastNameFieldRequiredElm().getText();
        String actualResult = "This field is required.";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("User does not click the submit button")
    public void userDoesNotClickTheSubmitButton() {
        submitPage.submitBtnNotClicked();
    }

    @Then("User should not be able to see the {string}")
    public void userShouldNotBeAbleToSeeThe(String arg0) {
        Assert.assertTrue(submitPage.getMessageElm2().size() == 0);
    }
}
