Feature: User submit to the landing page

  As a user, I want to be able submit the form when all the fields are filled with valid information.

  Scenario: As someone who wants to submit volunteering contact information

    Given The user is on the landing page to fill form
    When User fills every field with valid information
    And User clicks submit button
    Then User should see "Thank you for volunteering!"