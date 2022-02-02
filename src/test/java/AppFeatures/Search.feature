Feature: Amazon search
  Scenario: Search a product
    Given I I have a search filed on Amazon Page
    When I search for a project with name "Apple Macbook Pro" and price 1000
    Then Product with name "Apple Macbook Pro" should be displayed