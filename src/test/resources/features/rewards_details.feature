Feature: This feature file tests the functionality of Rewards Details Page on Reward App

  Background: Common Steps
    Given User is logged in on Rewards DashBoard page

  Scenario: Variable denomination slider is displayed
    When User clicks on Amazon Gift option
    Then Variable denomination slider is displayed

  Scenario: User can use slider to set Maximum GiftCard buy-amount
    When User clicks on Halfords Gift option
    And User sets slider to maximum available amount using x and y coordinates
    Then Variable denomination amount and point is correctly selected

  Scenario: User can use slider to set GiftCard buy-amount
    When User clicks on Amazon Gift option
    And User drags slider across to right using x and y coordinates
    Then Variable denomination amount and point is correctly selected

  Scenario: GiftCard name is displayed on Reward Details page
    When User clicks on Amazon Gift option
    Then GiftCard name is displayed on page

  Scenario: Navigation bar is displayed on Rewards Details page
    When User clicks on Amazon Gift option
    Then Navigation bar is displayed on Reward Details page

  Scenario: Navigation bar contains Your current balance Rewards Details page
    When User clicks on Amazon Gift option
    Then Navigation bar contains Your current balance

  Scenario: User enters value of Costa GiftCard in Amount field
    # Because field value defaults to 1, I am only sending 5 to assert value of 15Points in RewardsDetails page
    When User clicks on Costa Gift option
    And User enters required Gift Card value in Amount field
    Then Gift card value successfully entered

  Scenario: User can buy Amazon GiftCard using slider
    When User clicks on Amazon Gift option
    And User moves slider to get required amount
    And User clicks Buy Now button
    Then Success Message is displayed on screen
    And Green tick mark displayed along GiftCard image

  Scenario: User clicks Back to Rewards button on Reward Details page
    When User clicks on Halfords Gift option
    And User moves slider to get required amount
    And User clicks Buy Now button
    And User clicks Back to Rewards button
    Then Dashboard page is displayed

  Scenario: User points are updated after purchase of points
    When User clicks on Amazon Gift option
    Then Points are adjusted after completing purchase

  Scenario: The minimum spend value is £1
    When User clicks on Halfords Gift option
    And User moves slider to get minimum spend
    Then Slider shows minimum value as one pound

  Scenario: User can view Description of TK Maxx Gift Card option
    When User clicks on TK Maxx Gift Card option
    And User clicks Description tab on Rewards Details page
    Then Gift Card description text is displayed

  Scenario: User can view Terms of TK Maxx Gift Card option
    When User clicks on TK Maxx Gift Card option
    And User clicks Terms tab on Rewards Details page
    Then Gift Card Terms text is displayed

  Scenario: User can view Instructions of TK Maxx Gift Card option
    When User clicks on TK Maxx Gift Card option
    And User clicks Instructions tab on Rewards Details page
    Then Gift Card Instructions text is displayed

  Scenario: User can view Instructions of Google Play Gift Card on Rewards Detail
    When User clicks on Google Play Gift Card option
    And User clicks Instructions tab on Rewards Details page
    Then Gift Card Instructions text is displayed

  Scenario: Navigation bar contains points balance on Rewards Detail page
    When User clicks on Amazon Gift option
    Then Navigation bar contains points balance

  Scenario: Dashboard page displayed when Green Navigation bar is clicked
    When User clicks on Amazon Gift option
    And User clicks Green Navigation bar
    Then Dashboard page is displayed

  Scenario: GiftCard image or Logo is displayed on Rewards Detail page
    When User clicks on Amazon Gift option
    Then Giftcard image displayed on Rewards details page

  Scenario: User can choose Argos GiftCard values using dropdown
    When User clicks on Argos Gift option
    And User selects giftcard value from dropdown
    Then Selected index value is displayed in dropdown

  Scenario: User clicks Back to Rewards button on Reward Detail page
    When User clicks on Halfords Gift option
    And User moves slider to get required amount
    And User clicks Buy Now button
    And User clicks Back to Rewards button
    Then Dashboard page is displayed

  Scenario: User can not redeem Gift option value higher than points balance
    When User clicks on M and S Gift option
    And User clicks Buy Now button after selecting maximum value from dropdown
    Then Not enough points message is displayed


