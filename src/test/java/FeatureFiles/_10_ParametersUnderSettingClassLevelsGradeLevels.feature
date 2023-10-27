Feature: Grade Levels


  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario: The user add Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user adds a new grade level
    Then the grade level should be added successfully

  Scenario: The user edit Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user edits a grade level
    Then the grade level should be edited successfully

  Scenario: The user delete Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user deletes a grade level
    Then the grade level should be deleted successfully

