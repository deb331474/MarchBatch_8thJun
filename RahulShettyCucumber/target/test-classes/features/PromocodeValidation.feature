Feature: Errormessage validation for the wrong Promocode

  @CartPage
  Scenario Outline: Adding wrong promocodes and validate the error message
    Given User is on GreenCart Landing page
    When user searched with Shortname <name> and extracted actual name of product
    And Added 3 items of the selected product to cart
    Then User proceeds to Checkout and validate the <name> items in checkout page
    And User enters <promocodeM> promocode in the cart page and get the error message
    
    Examples: 
      | name |promocodeM|
      | Bri  |deb123    |
