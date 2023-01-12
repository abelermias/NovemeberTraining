Feature: User can view items in shopping cart

  @Test
  Scenario: User can view items in shopping cart
  
   Given User navigates to website
    When User clicks on the cart button
    When User clicks on the software button
    When User adds SVT Suite to the cart
    When User clicks Hardware Button
    When User clicks All Hardware Button
    When User adds Liquifier Analog Chorus Pedal to cart
    Then User can view items in cart
