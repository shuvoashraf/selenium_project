Feature: Validate Amazon search

Scenario Outline:
Given user visit amazon homepage
When user type "<productname>" and click search icon
Then user should able to see the expected product

Examples:
|productname| 
| iphone 12 promax |