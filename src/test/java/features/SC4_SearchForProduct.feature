@Regression
Feature:  Logged User could search for any product on the system

  Background:
    Given the User in home page and navigate to login page
    Given user enter valid Username and valid password and click login
      | sameh17@netservex.com | Test@123 |

  Scenario:  Logged User could search for any product

    Given user writes Product name "apple"
    When user click on search button
    Then the system show related product that include "Apple"
    And log out