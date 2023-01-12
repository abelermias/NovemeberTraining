Feature: User can find product dealers for individual products

 
 	@Test
  Scenario: Can find product dealers for individual products
    Given User navigates to website
    When User clicks on the product button
    When User selects product's category
    When User clicks BUY NOW on desired product
    Then User is able to see product dealers