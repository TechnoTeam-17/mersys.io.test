Feature:BankAccounts


  Background:
   Given Navigate to Campus
   When Enter username and password click login button with ApachePOI
            | username    |
            | password    |
            | loginButton |
    Then User should successfully


    Scenario: User should be able to create BankAccount.

    Then Click setup
    Then Click parameters
    And  Click bank accounts
    Then Add new account
    Then Account update
    When Account will be inactive
    Then the bank account should be deleted and removed from the list


