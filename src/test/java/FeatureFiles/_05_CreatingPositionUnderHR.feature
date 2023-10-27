Feature: Creating Position under HR


  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario: Creating Position under HR
    When Navigates to HR
      | humanResource|
      | setupUnderHR   |
      | positionUnderHR |
    And the user add a new position
    Then a new position should be added successfully




