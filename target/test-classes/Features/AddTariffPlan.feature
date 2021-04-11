#Author: your.email@your.domain.com
Feature: Add Tariff Plan feature


Scenario: Add tariff plan validation
  # Given user launch demo telecom application
   And user click on add tariff button
   When user fill up the plan details
   And user clicked on submit button
   Then user should be displayed congratulation message
   
  