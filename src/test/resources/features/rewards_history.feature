Feature: This feature file tests the functionality of Rewards History Page on Reward App

  Background: Common Steps
    Given User is logged in on Rewards DashBoard page

  Scenario: User can view reward History
    When User clicks view my Rewards History link
    Then Reward History page is displayed

  Scenario: Verify Rewards History page shows date and time stamp
    When User clicks view my Rewards History link
    Then Rewards history page displays time stamp for Rewards activity

  Scenario: Verify Rewards History page shows gift claimed
    When User clicks view my Rewards History link
    And User clicks Load More button
    Then Rewards history page displays Gift Claimed

  Scenario: Dashboard page displayed when Green Navigation bar is clicked
    When User clicks view my Rewards History link
    And User clicks Green Navigation bar
    Then Dashboard page is displayed

  Scenario: Verify Rewards History page shows auto banked points
    When User clicks view my Rewards History link
    And User clicks Load More button
    Then Rewards history page displays number of auto banked points

  Scenario: Verify Rewards History page shows pts adjustments
    When User clicks view my Rewards History link
    And User clicks Load More button
    Then Rewards history page displays points adjustments for Rewards activity






