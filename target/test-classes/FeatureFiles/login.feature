Feature: Login
  Background: : Login flow in Admin portal
    Given User in Login page
    When Enter the Email id "Siddulugari.Reddy@ril.com"
    And Select the Terms and Conditions Check box
    And Click on Login button
    Then SSO login page visible
    When Enter the SSO email "Siddulugari.Reddy@ril.com" and Password "Jiorooms@2023"
    And Click on ssoLogin button



  Scenario: Home Page Verification
    Given Login with Valid credentials
    Then  Dashboard App title visible
    And Add new device visible
    And Rooms option Visible
    And Clusters option Visible

  Scenario: Add new Device Verify
    Given User in Home page




