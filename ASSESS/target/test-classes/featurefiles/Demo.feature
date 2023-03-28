#Author: karthikb2@moback.com

Feature: Automation on youtube
 

  @demo
  Scenario: search for song
    Given Land on youtube homepage
    When I search for 'internet'
    And click search button
    Then verify search results 'Internet'
    And close the browser
    @demo
Scenario Outline: Try differnet combinations
	  Given Land on youtube homepage
    When I search for <Given>
    And click search button
    Then verify search results <Given>
    And close the browser
    Examples:
    |Given|
    |Songs|
    |Music|
    |Technology|
    
