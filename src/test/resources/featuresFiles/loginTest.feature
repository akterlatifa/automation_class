Feature: Saucedemo Login feature
  As a user I will be login into saucedemo site
  to test the functionality

  Background: 
    Given user is into login page

  Scenario: Successful login with valid credentials
    When user enters vallid username
    And user enter vaild password
    And user click the login button
    Then user should be directed to products page
    And user will see products image for products

  Scenario: Unsuccessful login with valid credentials
    When user enters invallid username
    And user enter invaild password
    And user click the login button
    Then user should see an error message
