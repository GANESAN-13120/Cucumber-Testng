Feature: This is to Login Mystore home page
Scenario Outline: Multiple Login Scenario
Given User going to online page
When User give input values "<username>" and "<password>"
Then User click on Login button and navigate to home page



Examples:
|username|password|
|sganesh13120@gmail.com|SG@ganesh13120|
|danielpaul1304@gmail.com|Danielpaul@1304|
|abc@yahoo.com|abc@123|
