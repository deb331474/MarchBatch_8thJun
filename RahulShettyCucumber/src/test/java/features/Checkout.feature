Feature: Placing the order for the Products

  @PlaceOrder
  Scenario Outline: Adding products into the cart and validating in both home and offers page
    Given User is on GreenCart Landing page
    When user searched with Shortname <name> and extracted actual name of product
    And Added 3 items of the selected product to cart
    Then User proceeds to Checkout and validate the <name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples: 
      | name |
      | Tom  |
      | Beet |
