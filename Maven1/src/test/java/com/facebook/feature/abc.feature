Feature: Task in Amazon Website
Scenario Outline: To add 3 different products in add to cart
Given  User enter into the Home page
When User search the "<input>"
And User click on his favourite choice
Then user click the add to cart product details page
Examples:
|input|
|watch|
|mobiles|
|headphones|
