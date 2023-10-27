Feature: School Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario: Configuration of sections under school adjustment
    Given Click on the element in Setup
      | setup        |
      | School_Setup |
      | Departments  |
    Then Click to addbutton

    And User sending the keys in School Department
      | name | tech1 |
      | code | omr3  |

    And add the keys in Section
      | Shortname | omr345 |
      | name      | Sci18 |

   Then Click to addbutton2


   And add the keys in Department Parameters
     | key   | afre |
     | value | 7    |
    Then Click to addbutton2
    And save all info


