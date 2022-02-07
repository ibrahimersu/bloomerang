Feature: User submit to the landing page

  As a user, I should be able to submit the form with minimum required fields

  Scenario: User should be able to submit the form with minimum required fields

    Given The user is on the landing page to fill form
    When User fills every field with partial valid information
    And User clicks submit button
    Then User should see "Thank you for volunteering!"