Feature: Document Types


  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario:
    Given Navigate to Document Types
    When Create a new document

    And edit a document
    Then delete document
    Then document should be deleted

