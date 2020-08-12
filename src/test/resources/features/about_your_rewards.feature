Feature: This feature file tests the functionality of About Your Rewards Page on Reward App

  Background: Common Steps
    Given User is logged in on Rewards DashBoard page

  Scenario: User clicks About your rewards link on Dashboard page
    When User clicks on About your rewards Hyperlink
    Then About your rewards page is displayed

  Scenario: Dashboard page displayed when Green Navigation bar is clicked
    When User clicks on About your rewards Hyperlink
    And User clicks Green Navigation bar
    Then Dashboard page is displayed

  Scenario: Version number of Rewards App is displayed on page
    When User clicks on About your rewards Hyperlink
    Then Version Number of Rewards App is displayed

