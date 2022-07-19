#Author: viyola.email@your.domain.com
@tag
Feature: Mobile purchase
  I want to use this template for my feature file

  @tag1
  Scenario: TV scenario
    
Given user launches flipkart application
And user Login into flipkart
When user search TV
And user choose the TV and doing payment
Then user receive order confirmation message

  Scenario: TV scenario one dim list
    
Given user launches flipkart application
And user Login into flipkart
When user search TV by useing one dim list
|realme|Smsung|MiTV|
And user choose the TV and doing payment
Then user receive order confirmation message

 Scenario: TV scenario one dim map
 Given user launches flipkart application
And user Login into flipkart
When user search TV by useing one dim Map
|phone1|realme|
|phone2|Samsung|
|phone3|MiTV|
And user choose the TV and doing payment
Then user receive order confirmation message

Scenario Outline:All TV
Given user launches flipkart application
And user Login into flipkart
When user search TV"<TV>"
And user choose the TV and doing payment
Then user receive order confirmation message

Examples:
|TVs|
|realme|
|samsung|
|miTV|