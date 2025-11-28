Feature: user able to add details in profile session

  Scenario Outline: : user able to login add details in their profile

    Given user is on login page
    When user enters <username> <password>
    And user clicks on login button
    And I click on PIM module
    And I click on add employee tab
    When I enters <EmpFName> and <EmpLName>
    When I create unique <EmpId>
    And I click save button
    Then i see a toaster msg
    And I click Employee list
    When I Enter the <EmpId> to search for particular emp
    And i click search button
    And i click edit button
    And i select nationality







    Examples:
    |username | password | EmpFName | EmpLName  | EmpId |
    |"Admin"  | "admin123" |"tester1" | "test"     | "3390" |
