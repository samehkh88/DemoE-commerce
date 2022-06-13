Feature: User Registration

  Background:
    Given the User in home page and naviagte to register page

  Scenario Outline: User could register with valid data

    When user enter the required date "<Gender>" and "<Firstname>" and "<Lastname>" and "<Email>" and "<Password>" then click register
    Then the system show success message
    And log out

    Examples:
      | Gender | Firstname | Lastname | Email                 | Password |
      | Male   | sameh     | khalil   | sameh17@netservex.com | Test@123 |