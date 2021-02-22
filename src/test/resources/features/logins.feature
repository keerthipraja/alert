Feature: This feature file tests the functionality of Login Page on Reward App
  Background: Common Steps
    Given User navigates to Rewards Login page

  Scenario: Rewards Login page displayed
    Then Rewards login page label displayed

  Scenario: Valid Login
    When User enter valid "<username>" and "<password>" credentials
    And User clicks Login button
    Then Rewards Dashboard page displayed

  Scenario Outline: Invalid Login
    When User enter invalid "<username>" and "<password>" credentials
    And User clicks Login button
    Then Validation error Message displayed

    Examples:
      | username   | password   |
      | DanTest123 |            |
      |            | DanTest123 |
      |            |            |
      | Demo123    | Demo330!   |




