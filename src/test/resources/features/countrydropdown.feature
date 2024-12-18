@regression
Feature: Country Dropdown Test

  @smoke
  Scenario: Verify the following country available in the dropdown list
    Given I am on the home page
    When I click on start button
    Then I can see the following countries in the dropdown:
      | Albania                  |
      | Bhutan                   |
      | British-protected-person |
      | Haiti                    |
      | Kazakhstan               |
      | Mozambique               |
      | Norway                   |
      | Portugal                 |
      | Russia                   |
      | Zambia                   |
