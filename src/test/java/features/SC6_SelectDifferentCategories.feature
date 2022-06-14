@Regression
Feature:  the Logged user could select any different Categories in the system

  Background:
    Given the User in home page and navigate to login page
    Given user enter valid Username and valid password and click login
      | sameh17@netservex.com | Test@123 |

  Scenario: Logged user could select different Categories

    When user can hover on computer category and selects sub category notebook
    Then the system show all sub category products
    And log out