Feature: Login Functionality


  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully
