@Regression
Feature:  Logged user could filter with color

  Background:
    Given the User in home page and navigate to login page
    Given user enter valid Username and valid password and click login
      | sameh17@netservex.com | Test@123 |

  Scenario: Logged user could filter with color

    Given user navigates to Apparel & shoes
    When User selects the red shoes
    Then user could see one product only
    And log out