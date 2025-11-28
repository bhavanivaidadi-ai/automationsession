Feature: user should able to change their status to Admin in all tabs

  Scenario Outline:

    Given user is on login page
    When user enters <username> <password>
    And user clicks on login button
    Then login result should be shown
    And user click on Admin tab
    And user clicks on usermanagement dropdown
    And user selects the users tab
    Then user check whether he entered correctly or not
    And user delets the existing user details





    Examples:
      | username | password   |
      | "Admin"  | "admin123" |