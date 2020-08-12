Feature: This feature file tests the functionality of Dashboard Page on Reward App

  Background: Common Steps
    Given User is logged in on Rewards DashBoard page

  Scenario: Verify User points colour on Dashboard page
    Then Points balance colour is bold green on page

  Scenario: User has option to use Buy Now button
    When User clicks on Amazon Gift option
    Then Buy Now button is displayed on Rewards Details

  Scenario: Browse Gift label is displayed
    Then Browse Gifts label is displayed

  Scenario: User Points balance is displayed
    Then Points balance is displayed

  Scenario: User guide text on eGifts retailers is displayed
    Then eGift user guide text is displayed

  Scenario: Rewards Dashboard page displays all Gift Card options
    Then number of gift options is forty


