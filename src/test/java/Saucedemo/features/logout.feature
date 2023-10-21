Feature: Customer logout

  @Regression @Positive
  Scenario: User success login and logout
    Given Halaman login kasiraja
    When input username
    And input password
    And click login button
    Then user redirect to dashboard page
    And user click burger button
    And user click logout menu
    Then user should see login Page

