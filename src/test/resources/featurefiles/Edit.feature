Feature: user able to edit all the existing data in general information session


  Scenario: user login with valid user name and password

    Given user is on login page
    When user enters "Admin" and "admin123"
    And user clicks on login button
    Then user is successfully logged in
    And user clicking on Admin tab
    And user click on organization dropdown
    And user clicks on general information

