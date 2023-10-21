Feature: Login page sauce demo

  @Regression @Positive
  Scenario: Success Login
    Given Halaman login sauce demo
    When input username
    And input password
    And click login button
    Then user redirect to dashboard page

  @Regression @Negative
  Scenario: Failed Login
    Given Halaman login sauce demo
    When input username
    And input invalid password
    And click login button
    Then user get error message

  @TDD @login
  Scenario Outline: User login to sauce demo
    Given Halaman login sauce demo
    When  I input <username> as username
    And I input <password> as password
    When click login button
    Then I verify <status> login result

    Examples:
      | username      | password      | status  |
      | standard_user | secret_sauce  | success |
      | standard_user | failed-login  | failed  |

