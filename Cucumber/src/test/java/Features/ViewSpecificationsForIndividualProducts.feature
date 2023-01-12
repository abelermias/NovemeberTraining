Feature: User can view specifications for individual products
 

	@Test
  Scenario: View specifications for individual products
    Given User navigates to website
    Given User clicks on the product button
    When User selects product's category
    When User clicks learn more on desired product
    Then User is able to see products specifications