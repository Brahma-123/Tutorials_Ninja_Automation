Feature: Login feature
  Background: Navigate to the Register page
    Given User in Landing page
    When  Verify My Account field
    And Click Login option
    Then User should land on Login page

  Scenario: Login With Valid credentials
    Given User in Login Page
    When Enter email id "brahma124@gmail.com"
    And Enter Password "reddy@1234"
    And Click on Login Button
    Then User should be login and navigated to Dashboard
