Feature: School Location Functionality



  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario: Manage school positions

    Given Click on the elements in Setup
      | setup        |
      | School_Setup |
      | Locations    |
    And Click to addbutton

   Then User create the keys in Locations
     | name     | lab7 |
     | sname    | l7   |
     | capacity | 9   |
    And choose location_type is Laboratory
   And save locations info

  Then edit in Locations

  And User must be able to enable and disable Partitions

   Then click delete as name "lab9"

  And delete as name "lab9"  in Locations



