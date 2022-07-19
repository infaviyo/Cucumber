#Author: viyola.email@your.domain.com


@tag
Feature: Mobile purchase
  I want to use this template for my feature file

  @tag1
  Scenario: Mobile scenario
    
Given user launches flipkart application
And user Login into flipkart
When user search moblie
And user choose the mobile and doing payment
Then user receive order confirmation message

 Scenario: Mobile scenario one dim list
    
Given user launches flipkart application
And user Login into flipkart
When user search moblie by useing one dim list
|realme|Smsung|Mimobile|
And user choose the mobile and doing payment
Then user receive order confirmation message

 Scenario: Mobile scenario one dim map
    
Given user launches flipkart application
And user Login into flipkart
When user search moblie by useing one dim Map
|phone1|realme|
|phone2|Samsung|
|phone3|Mimobile|
And user choose the mobile and doing payment
Then user receive order confirmation message

Scenario Outline:All Mobiles
Given user launches flipkart application
And user Login into flipkart
When user search moblie"<phones>"
And user choose the mobile and doing payment
Then user receive order confirmation message

Examples:
|phones|
|realme|
|samsung|
|miphone|