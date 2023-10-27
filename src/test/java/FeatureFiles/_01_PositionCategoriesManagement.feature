Feature: Position Categories Management

  Background:

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario:
    Given Navigate to Position Categories
    When Create a new Category
    Then success message should be displayed

    And user edit and delete position category
    Then success message should be displayed

