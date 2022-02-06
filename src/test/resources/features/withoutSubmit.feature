Feature: User submit to the landing page

  As a user, I should not be able to submit the form without clicking the submit button

  Scenario: User should not be able to submit the form without clicking the submit button

    Given The user is on the landing page to fill form
    When User fills every field with valid information
    And User does not click the submit button
    Then User should not be able to see the "Thank you for volunteering!"