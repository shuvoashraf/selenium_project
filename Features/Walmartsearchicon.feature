Feature: Validate Walmart search icon

Scenario Outline: Validate Walmart search icon

Given users visits Walmart homepage
When users types "<productname>" and click search icon
Then users should able to see the expected product

Examples:
|productname| 
| baby car seat |