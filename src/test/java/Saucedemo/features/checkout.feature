Feature: Customer add to cart

  @Regression @Positive
  Scenario: User login to sauce demo
    Given Halaman login sauce demo
    When  I input username as username
    And I input password as password
    When click login button
    Then I verify status login result
    Then user should see Product Page
    And user click add to cart button
    And user click cart icon
