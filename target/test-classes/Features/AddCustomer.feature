#Author: your.email@your.domain.com
@smoke
Feature: Add customer flow validation


@smoke
  Scenario: Add Customer by using scenario
   # Given user launches demo telecom application
    And user clicks on add customer button
    When user fill all the details
    And user click on submit button
    Then user should be displayed customer id is generated

@regression
  Scenario Outline: Add Customer by using scenario outline
   # Given user launches demo telecom application
    And user clicks on add customer button
    When user fill all the details "<FirstName>","<LastName>","<Email>","<Address>","<Phno>"
    And user click on submit button
    Then user should be displayed customer id is generated

    Examples: 
      | FirstName | LastName | Email        | Address   | Phno    |
      | vignesh   | BG       | BG@gmail.com | cuddalore | 8756453 |
      | lokesh    | BG       | BG@gmail.com | cuddalore | 8756453 |
      | ila       | BG       | BG@gmail.com | cuddalore | 8756453 |
      | surya     | BG       | BG@gmail.com | cuddalore | 8756453 |
