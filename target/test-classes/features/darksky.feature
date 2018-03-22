@regression @darksky
Feature: Darksky homepage data

  Background:
    Given I am on darksky home page

#  #JIRA ticket TA1
  Scenario: Verify the days of the week are displayed correctly
    Then I verify the days of the week are displayed in the correct order

#  #JIRA Ticket TA2
   Scenario: Verify low to high value is displayed correctly on weekly forecast section
    When  I click on todays bar on darksky homepage
    Then I verify low and high temp displayed correctly on parent bar

#  #JIRA Ticket TA3
   Scenario: Select Tomorrows date from Time Machine
    When I click on TimeMachine on darksky homepage
    And I select tomorrows date
    Then I verify selected date is clickable
    And I verify date is displayed in correct format








