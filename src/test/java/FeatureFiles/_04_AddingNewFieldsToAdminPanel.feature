Feature: Setting up Parameters Field


  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario:
    Given Navigate to Fields Page
    When Create a new Field

    And edit a Field
    Then delete a Field
    Then User should delete successfully

