@Smoke
@Regression
Feature:  Logged user could add different products to Shopping cart

  Background:
    Given user writes Product name "Apple MacBook"
    Given user click on search button


  Scenario: Logged user could add different products to Shopping cart

    When user click to add Product to cart
    Then user can add this item to the shopping cart and a confirmation message will be shown