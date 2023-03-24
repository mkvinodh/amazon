Feature: Going to check adactin hotel app Test Cases
Scenario: To check Adactin login scenario
Given Useer enter into Adactin Home page
When User enter the username in the username field
And User enter the password in the password field
Then user click the login button 

Scenario: To check search hotel page
Given user enter into search hotel page
When user select the Hotel Location in Location field
And user select the hotel name in Hotels field
And user select the room type in Room Type field
And User choose the number of rooms in Number of Rooms field
And user enter the Check In Date
And user enter the Check Out Date
And user select the number of rooms for adults
And user select the number of rooms for children
Then user click the search button

Scenario: To check the select hotel page
Given user enter into the select hotel page
When user click the radio button of hotel in that page
Then user click the continue button

Scenario: To check the Book Hotel page
Given user enter into the Book Hotel page
When user enter the First Name 
And user enter the Last name
And user enter the Billing Address
And user enter the Credit Card Number
And user select the Credit Card type
And user select the Expiry Month
And user select the Expiry Year
And user enter the CVV number
Then user click the Book Now Button
