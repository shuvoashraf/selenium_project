Feature: Validate Facebook login

Scenario Outline: Validate Facebook login

Given Users visits facebook homepage

When  Users type "<email>" "<pw>" and click fb login button
Then  Users should able to facebook login 

Examples:

|email|pw| 
|shuvoashraf786@gmail.com |Abc123|