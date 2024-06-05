Feature: General View
  Scenario: Validate general user is able to view products loggin in
    Given User navigate to the login page
    When User enter email address
    And  User enter password
    Then User validate "LOGIN" text
    And  User click on login Button
    Then User view the product list page