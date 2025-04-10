Feature: Login into SauceDemoPage
  Scenario: User login with Valid credentials
    Given User in Login page in Sauce demo site
    When user enter "standard_user" and "secret_sauce"
    And click on Login button
    Then Redirect to Login page