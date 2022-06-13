Feature:  Logged User could switch between currencies US-Euro

  Background:
    Given the User in home page and navigate to login page
    Given user enter valid Username and valid password and click login
      | sameh17@netservex.com | Test@123 |
    Given user writes Product name "Apple MacBook"
    Given user click on search button

  Scenario:  Logged User could switch between currencies US-Euro

    When user selects Euro from currency dropdown list
    Then the system change the system currency
    And log out