Feature: Attestation Management


  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario:
    Given Navigate to Attestations
    When Create a new attestation
    Then success message should be displayed

    And user edit and delete attestation
    Then success message should be displayed