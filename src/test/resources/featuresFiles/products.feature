Feature: Product Feature Test
  As a user I will be able to add products and delete products from cart
  and I will see individual products

  Scenario: Adding products
    Given the user will be on product page
    When I click one product
    Then one product will be added to the cart
    And I will be able to go to the cart page
