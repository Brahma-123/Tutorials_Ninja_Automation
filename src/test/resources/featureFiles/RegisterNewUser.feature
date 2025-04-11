Feature: Register new user

  Background: Navigate to the Register page
    Given User in Landing page
    When  Verify My Account field
    And Select Register option
    Then User land on Register page

  Scenario: Create new user by giving all correct inputs
    Given User in Landing page
    When Enter the Firstname "Brahmananda" and Lastname "Reddy"
    And Enter the Email id "brahma124@gmail.com" and Phonenumber "9000002133"
    And Enter password "reddy@1234" and Confirm password "reddy@1234"
    And Select yes Subscribe and Checkbox
    And Click Continue button
    Then Account created text should display

