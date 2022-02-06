Feature: User submit to the landing page

  As a user, I should not be able to submit the form with missing fields

  Scenario: User should not be able to submit the form when there are missing fields

    Given The user is on the landing page to fill form
    When User does not fill every field int the form
    And User clicks submit button
    Then The form should not be submitted