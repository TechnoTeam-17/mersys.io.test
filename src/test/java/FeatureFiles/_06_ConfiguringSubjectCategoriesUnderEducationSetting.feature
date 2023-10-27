Feature: Configure Subject Category under Education Setting

  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario: Configure Subject Category under Education Setting
    When Navigates to subject education
      | education           |
      | setupUnderEducation |
      | subjectCategories   |
    And The user add a subject category
    Then A subject category should be added successfully

