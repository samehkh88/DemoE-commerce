Feature:  Logged user could add different products to Wishlist

  Scenario : Logged user could add different products to Wishlist

    Given User in homapage and add product to his wishlist
      | sameh17@netservex.com |
    Then the system show green success message
    When user go to his Wishlist
    Then The User find his Product in the Wishlist


