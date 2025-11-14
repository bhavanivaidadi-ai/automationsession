Feature: user able to add details in profile session

  Scenario: user able to login add details in their profile

    Given user is on login page
    When user enters "Admin" and "admin123"
    And user clicks on login button
    Then user is successfully logged in
    And user click on PIM module
    And user click on add employee tab

