Feature: Customer transaction

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
And user click checkout button
Then user should see Checkout Your Information page
And user input on first name field
And user input last name field
And user input Zip or Postal Code field
When user click continue button
Then user directed to checkout overview section
And user click Finish button
Then user directed to checkout complete section
When user click back home button
Then user should see Product Page
And user click burger button
And user click logout menu
Then user should see login Page

  @Regression @Negative
  Scenario: User login to sauce demo
    Given Halaman login sauce demo
    When  I input username as username
    And I input password as password
    When click login button
    Then I verify status login result
    Then user should see Product Page
    And user click add to cart button
    And user click cart icon
    And user click checkout button
    Then user should see Checkout Your Information page
    And user input on first name field
    And user input last name field
    When user click continue button
    Then user should see error message bellow the Zip or Postal Code field