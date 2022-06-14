Feature: user could log in with correct data

  Background:
    Given the User in home page and navigate to login page

  Scenario: User could log in with valid email and password

    Given user enter valid Username and valid password and click login
      | sameh17@netservex.com | Test@123 |
    Then the system redirect to the home page and log out appear
    And log out

  Scenario: User couldnot log in with Invalid email and Invalid password

    Given user enter Invalid Username and Invalid password and click login
      | sameh20@netservex.com | Test@123 |
    Then the system Show error message "Login was unsuccessful. Please correct the errors and try again."
