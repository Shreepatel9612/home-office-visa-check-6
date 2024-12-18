@regression
Feature: Visa Confirmation Test

  @smoke
  Scenario: An Australian Coming To UK For Tourism
    Given I am on the home page
    When I click on start button
    And I select nationality "Australia"
    And I click on Continue button
    And I select reason "Tourism"
    And I click on Continue button
    Then I should see the result "You will not need a visa to come to the UK"

  @sanity
  Scenario: A Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am on the home page
    When I click on start button
    And I select nationality "Chile"
    And I click on Continue button
    And I select reason "Work, academic visit or business"
    And I click on Continue button
    And I select intendent to stay for "longer than 6 months"
    And I click on Continue button
    And I select job type "Health and care professional"
    And I click on Continue button
    Then I should see the result "You need a visa to work in health and care"

  Scenario: A Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10 Or 20 Card
    Given I am on the home page
    When I click on start button
    And I select nationality "Colombia"
    And I click on Continue button
    And I select reason "Join partner or family for a long stay"
    And I click on Continue button
    And I select immigration status "yes"
    And I click on Continue button
    Then I should see the result "You’ll need a visa to join your family or partner in the UK"
