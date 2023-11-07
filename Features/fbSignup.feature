Feature: Facebook sign up

In order to verify search
as a user
i want to Facebook sign up

Scenario Outline:
Given user visiting facebook url 
When user enter "<First name>"  "<Last name>" and valid "<email address>" and "<new password>"
Then user select dropdown Month and dropdown Day and dropdown Year and select gender

Examples:
|First name| Last name| email address   |new password|
|  Nayeem         | akbar     |esdy@gmail.com   | Abc678 |
