@Regression
Feature: User could reset his/her password from login page by enter his mail

  Scenario: User could reset his/her password successfully

    Given the User in home page and navigate to login page
    When User click on forgot password
    And user enters his email "sameh17@netservex.com" to recover his password
    Then The system show Success message that system will send mail to the user