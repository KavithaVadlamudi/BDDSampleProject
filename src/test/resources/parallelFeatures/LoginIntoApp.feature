Feature: Login function

#Scenario: Valid Login
#Given User is on Login page
#When User enters credentials
#Then Should display Home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home page	

#Scenario: Invalid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecret"
#Then Should display Error page

#Scenario Outline: Valid Login
#Given User is on Login page
#When User enters "<username>" and "<password>"
#Then Should display Home page	

#Examples:
#| username | password |
#| tomsmith | SuperSecretPassword! |
#| tomsmith | SuperSecret |

#Scenario: Valid Login
#Given User is on Login page
#When User enters login credentials
#      | tomsmith | SuperSecretPassword! |
#Then Should display Home page	


Scenario: Valid Login
Given User is on Login page
When User enters login credentials
      | username | password |
      | tomsmith | SuperSecretPassword! |
Then Should display Home page	