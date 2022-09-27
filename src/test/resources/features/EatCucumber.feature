Feature: Eating Cucumber

Scenario: Eat 5 out of 12
Given there are 12 cucumbers
When I eat 5 cucumbers
Then I should have 7.5 cucumber
#Then I should have "very few" cucumber

Scenario: Eat 5 out of 12
Given there are 12 cucumbers
When I eat 5 cucumbers
#Then I should not have 8.5 cucumber
Then I should not have "as many" cucumber

#this feature is used to check which value it is getting coverted in stepdef int,double.run the feature using runner and check in failed trace