Feature: This feature file tests the functionality of Forgotten Password Page on Reward App
  Background: Common Steps
    Given User navigates to Rewards Login page

  Scenario: User clicks Forgotten Password Link
    When User clicks Forgotten Password link
    Then Forgotten Password page is displayed

  Scenario Outline: User can not reset Password with incorrect Username
    When User clicks Forgotten Password link
    And User enters invalid "<email address>" in field
    And User clicks Reset Password button
    Then Validation error message displayed

    Examples:
      | email address      |
      | DanTest123@aol.com |
      |                    |
      | Demo123            |
