Feature: Login into Multiple Credentials
  Scenario Outline: User login with Multiple crendentials
    Given User in Login page in Sauce demo site
    When user enter "<username>" and "<password>"
    And click on Login button
    Then Redirect to Login page


    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |