
Feature: Editing Discounts Under Parameters Setting

  Background:

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario: Create a new Discount
    When the user navigates to setup
      | setup1          |
      | parametersSetup |
      | discounts       |
    And the user creates a new discount
    Then the discount document should be added successfully

  Scenario: Edit a new Discount
    When the user navigates to setup
      | setup1          |
      | parametersSetup |
      | discounts       |
    And the user edits an existing new discount
    Then the new discount should be edited successfully

  Scenario: Delete a new Discount
    When the user navigates to setup
      | setup1          |
      | parametersSetup |
      | discounts       |
    And the user deletes an existing new discount
    Then the new discount should be deleted successfully